/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.factory;

import by.epam.soundstudio.data.Song;

public interface AbstractFactory <T extends Song>  {
    T create();
}
