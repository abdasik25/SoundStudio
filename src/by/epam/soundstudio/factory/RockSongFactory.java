/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.factory;

import by.epam.soundstudio.creator.Creator;
import by.epam.soundstudio.creator.RockSongCreator;
import by.epam.soundstudio.data.Song;

import java.util.List;

public class RockSongFactory implements AbstractFactory<Song> {
    @Override
    public Song create(List<String> lineParts) {
        Creator creator;
        creator = new RockSongCreator();
        return creator.create(lineParts);
    }
}
