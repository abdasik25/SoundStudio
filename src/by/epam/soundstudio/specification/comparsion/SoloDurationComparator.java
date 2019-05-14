/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.comparsion;

import by.epam.soundstudio.data.RockSong;

import java.util.Comparator;

public class SoloDurationComparator implements Comparator<RockSong> {

    @Override
    public int compare(RockSong o1, RockSong o2) {
        return Comparator.comparing(RockSong::getSoloDuration)
                .compare(o1,o2);
    }
}
