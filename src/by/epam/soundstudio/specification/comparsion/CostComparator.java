/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.comparsion;

import by.epam.soundstudio.data.Song;

import java.util.Comparator;

public class CostComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        return Comparator.comparing(Song::getCost)
                .reversed()
                .compare(o1, o2);
    }
}
