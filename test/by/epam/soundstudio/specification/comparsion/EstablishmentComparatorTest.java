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

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class EstablishmentComparatorTest {

    private RockSong rockSongGreater;
    private RockSong rockSongSmaller;

    public EstablishmentComparatorTest(RockSong rockSongGreater, RockSong rockSongSmaller) {
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
    public void establishmentComparatorTest(){
        EstablishmentComparator establishmentComparator = new EstablishmentComparator();
        int result = -1;
        assertEquals(result, establishmentComparator.compare(rockSongGreater, rockSongSmaller));
    }
}