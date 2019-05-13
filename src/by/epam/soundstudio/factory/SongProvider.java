/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.factory;

import by.epam.soundstudio.converter.StringCleaner;
import by.epam.soundstudio.converter.StringSplitter;
import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.exceptions.SongFileNotFoundException;
import by.epam.soundstudio.reader.FileReader;
import by.epam.soundstudio.repository.Repository;
import by.epam.soundstudio.validator.RapSongValidator;
import by.epam.soundstudio.validator.RockSongValidator;
import by.epam.soundstudio.validator.SongValidator;
import by.epam.soundstudio.validator.SymphonicSongValidator;

import java.util.List;

public class SongProvider {

    private AbstractFactory abstractFactory;
    private Repository<Song> repository;
    private StringCleaner stringCleaner;
    private StringSplitter stringSplitter;

    public SongProvider(AbstractFactory abstractFactory, Repository<Song> repository) {
        this.abstractFactory = abstractFactory;
        this.repository = repository;
        stringCleaner = new StringCleaner();
        stringSplitter = new StringSplitter();
    }

    public void addToRepository(List<String> data) {
        for (String line : data) {
            List<String> lineParts = stringSplitter.splitString(line, ',');
            repository.add(abstractFactory.create(lineParts));
        }
    }

    public void provideRapSongToRepository(String filePath) {
        try {
            List<String> data = FileReader.getINSTANCE().readDataFromFile(filePath);
            SongValidator rapSongValidator = new RapSongValidator();
            data = stringCleaner.cleanSongList(rapSongValidator, data);
            addToRepository(data);
        } catch (SongFileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void provideRockSongToRepository(String filePath) {
        try {
            List<String> data = FileReader.getINSTANCE().readDataFromFile(filePath);
            SongValidator rockSongValidator = new RockSongValidator();
            data = stringCleaner.cleanSongList(rockSongValidator, data);
            addToRepository(data);
        } catch (SongFileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void provideSymphonicSongToRepository(String filePath) {
        try {
            List<String> data = FileReader.getINSTANCE().readDataFromFile(filePath);
            SongValidator symphonicSongValidator = new SymphonicSongValidator();
            data = stringCleaner.cleanSongList(symphonicSongValidator, data);
            addToRepository(data);
        } catch (SongFileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
