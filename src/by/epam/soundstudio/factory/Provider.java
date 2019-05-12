package by.epam.soundstudio.factory;

import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.repository.Repository;

public class Provider {

    private AbstractFactory abstractFactory;
    private Repository<Song> repository;

    public Provider(AbstractFactory abstractFactory, Repository<Song> repository) {
        this.abstractFactory = abstractFactory;
        this.repository = repository;
    }

    //TODO
    public void provideToRepository(String filePath){
    }
}
