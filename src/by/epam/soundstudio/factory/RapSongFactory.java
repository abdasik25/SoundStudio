/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.factory;

import by.epam.soundstudio.creator.Creator;
import by.epam.soundstudio.creator.RapSongCreator;
import by.epam.soundstudio.data.Song;

import java.util.List;

public class RapSongFactory implements AbstractFactory<Song> {
    @Override
    public Song create(List<String> lineParts) {
        Creator creator;
        creator = new RapSongCreator();
        return creator.create(lineParts);
    }
}
