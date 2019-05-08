package by.epam.soundstudio.repository;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.exceptions.SongNotFound;
import by.epam.soundstudio.specification.Specification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

public class SoundStudioRepository implements Repository<Song> {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final AtomicLong ID_GENERATOR = new AtomicLong(0);
    private List<Song> disk;

    public SoundStudioRepository() {
        disk = new ArrayList<>();
    }

    public Song getSong(int index) {
        return disk.get(index);
    }

    @Override
    public boolean add(Song entity) {
        entity.setId(ID_GENERATOR.getAndIncrement());
        disk.add(entity);
        LOGGER.debug(entity + "was recorded on disk. ID = " + entity.getId());
        return true;
    }

    @Override
    public boolean remove(Song entity) {
        if (disk.contains(entity)) {
            disk.remove(entity);
            LOGGER.debug(entity + "was deleted from disk.");
            return true;
        } else {
            LOGGER.error(entity + "was not found on disk.");
            return false;
        }
    }

    @Override
    public boolean removeAll() {
        disk.clear();
        ID_GENERATOR.set(0);
        LOGGER.debug("Disk was cleared.");
        return true;
    }

    @Override
    public Optional<Song> update(Song entity) {
        Song song = null;
        for (int i = 0; i < disk.size(); i++) {
            if (disk.get(i).getId() == entity.getId()) {
                song = disk.get(i);
                disk.set(i, entity);
            }
        }
        return ofNullable(song);
    }

    @Override
    public List<Song> query(Specification<Song> specification) {
        return disk.stream().filter(specification).collect(Collectors.toList());
    }

    @Override
    public List<Song> sorted(Comparator<Song> comparator) {
        return disk.stream().sorted(comparator).collect(Collectors.toList());
    }


    @Override
    public Optional<Song> findOne(Comparator<Song> comparator) {
        return Optional.of(disk.stream()
                .max(comparator)
                .orElseThrow(SongNotFound::new));
    }


    @Override
    public <R> Optional<R> sum(Specification<Song> specification, Function<Song, R> function,
                               BinaryOperator<R> aggregator) {
        return disk.stream()
                .filter(specification)
                .map(function)
                .reduce(aggregator);
    }

    @Override
    public long count(Specification<Song> specification) {
        return disk.stream().filter(specification).count();
    }
}
