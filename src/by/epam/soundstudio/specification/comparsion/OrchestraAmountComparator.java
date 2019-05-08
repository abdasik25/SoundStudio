/**
 * Created by Alexander Lomat on 08.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.comparsion;

import by.epam.soundstudio.data.SymphonicSong;

import java.util.Comparator;

public class OrchestraAmountComparator implements Comparator<SymphonicSong> {
    @Override
    public int compare(SymphonicSong o1, SymphonicSong o2) {
        return Comparator.comparing(SymphonicSong::getOrchestraAmount)
                .reversed()
                .compare(o1,o2);
    }
}
