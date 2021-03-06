/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.repository;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.specification.filter.Specification;
import by.epam.soundstudio.util.IdGenerator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Optional.ofNullable;

public class SoundStudioRepository implements Repository<Song> {

    private static final Logger LOGGER = LogManager.getLogger();
    private List<Song> disk;

    public SoundStudioRepository() {
        disk = new ArrayList<>();
    }

    public Song getSong(int index) {
        return disk.get(index);
    }

    public List<Song> getSongList() {
        return disk;
    }

    @Override
    public boolean add(Song entity) {
        entity.setId(IdGenerator.generateId());
        disk.add(entity);
        LOGGER.debug(entity + "\nwas recorded on disk. ID = " + entity.getId());
        return true;
    }

    @Override
    public boolean remove(Song entity) {
        if (disk.contains(entity)) {
            disk.remove(entity);
            LOGGER.debug(entity + "\nwas deleted from disk.");
            return true;
        } else {
            LOGGER.error(entity + "\nwas not found on disk.");
            return false;
        }
    }

    @Override
    public boolean removeAll() {
        disk.clear();
        IdGenerator.setId(0);
        LOGGER.debug("\nDisk was cleared.");
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
