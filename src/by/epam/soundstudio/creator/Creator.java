/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.creator;

import by.epam.soundstudio.data.Song;

import java.util.List;

public interface Creator <T extends Song> {
    T create(List<String> data);
}
