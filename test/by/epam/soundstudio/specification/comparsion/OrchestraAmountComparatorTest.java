/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.comparsion;

import by.epam.soundstudio.data.SymphonicSong;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrchestraAmountComparatorTest {

    private SymphonicSong symphonicSongGreater;
    private SymphonicSong symphonicSongSmaller;

    public OrchestraAmountComparatorTest(SymphonicSong symphonicSongGreater, SymphonicSong symphonicSongSmaller) {
        this.symphonicSongGreater = symphonicSongGreater;
        this.symphonicSongSmaller = symphonicSongSmaller;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        SymphonicSong symphonicSong = new SymphonicSong("SYMPHONY VII", 7000, 20,
                "USA", 1893, "BACH", 20);
        SymphonicSong symphonicSong1 = new SymphonicSong("SYMPHONY VI", 700, 20,
                "USA", 1893, "BACH", 10);
        return Arrays.asList(new Object[][]{
                {symphonicSong, symphonicSong1},
        });
    }

    @Test
    public void orchestraAmountComparatorTest(){
        OrchestraAmountComparator orchestraAmountComparator = new OrchestraAmountComparator();
        int result = 1;
        assertEquals(result, orchestraAmountComparator.compare(symphonicSongGreater, symphonicSongSmaller));
    }
}