/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.repository;

import by.epam.soundstudio.data.RockSong;
import by.epam.soundstudio.data.Song;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SoundStudioRepositorySortedTest {

    private SoundStudioRepository soundStudioRepositoryActual;

    public SoundStudioRepositorySortedTest(SoundStudioRepository soundStudioRepositoryActual) {
        this.soundStudioRepositoryActual = soundStudioRepositoryActual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong1 = new RockSong("Metallica - Turn The Page", 300, 20,
                "USA", 1997, false, 60);
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 450, 30, "USA", 1991, true, 60);
        SoundStudioRepository soundStudioRepositoryActual = new SoundStudioRepository();
        soundStudioRepositoryActual.add(rockSong);
        soundStudioRepositoryActual.add(rockSong1);
        return Arrays.asList(new Object[][]{
                {soundStudioRepositoryActual},
        });
    }

    @Test
    public void soundStudioRepositoryRemoveTest() {
        List<Song> actualData = soundStudioRepositoryActual.sorted(Comparator.comparing(Song::getCost).reversed());
        List<Song> expectedData = soundStudioRepositoryActual.getSongList();
        assertEquals(expectedData, actualData);
    }
}
