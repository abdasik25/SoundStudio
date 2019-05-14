/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.comparsion;

import by.epam.soundstudio.data.RockSong;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CostComparatorTest {

    private RockSong rockSongGreater;
    private RockSong rockSongSmaller;

    public CostComparatorTest(RockSong rockSongGreater, RockSong rockSongSmaller) {
        this.rockSongGreater = rockSongGreater;
        this.rockSongSmaller = rockSongSmaller;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 450, 40,
                "USA", 1991, true, 60);
        RockSong rockSong1 = new RockSong("Metallica - Turn The Page", 300, 30,
                "USA", 1997, false, 60);
        return Arrays.asList(new Object[][]{
                {rockSong, rockSong1},
        });
    }

    @Test
    public void costComparatorTest(){
        CostComparator costComparator = new CostComparator();
        int result = 1;
        assertEquals(result, costComparator.compare(rockSongGreater, rockSongSmaller));
    }
}