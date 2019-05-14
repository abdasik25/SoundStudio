/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.RockSong;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SoloRangeSpecificationTest {

    private RockSong rockSong;
    private boolean result;

    public SoloRangeSpecificationTest(RockSong rockSong, boolean result) {
        this.rockSong = rockSong;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 450, 20,
                "USA", 1991, false, 60);
        return Arrays.asList(new Object[][]{
                {rockSong, true},
        });
    }

    @Test
    public void soloRangeSpecificationTest(){
        SoloRangeSpecification soloRangeSpecification = new SoloRangeSpecification(0,20);
        assertEquals(soloRangeSpecification.test(rockSong), result);
    }
}