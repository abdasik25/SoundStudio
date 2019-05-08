package by.epam.soundstudio.factory;

import by.epam.soundstudio.data.Song;

public interface AbstractFactory <T extends Song>  {
    T create();
}
