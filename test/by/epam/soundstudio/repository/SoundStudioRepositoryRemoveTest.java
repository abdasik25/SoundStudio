/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.repository;

import by.epam.soundstudio.data.RockSong;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SoundStudioRepositoryRemoveTest {

    private SoundStudioRepository soundStudioRepository;
    private RockSong rockSong;

    public SoundStudioRepositoryRemoveTest(SoundStudioRepository soundStudioRepository, RockSong rockSong) {
        this.soundStudioRepository = soundStudioRepository;
        this.rockSong = rockSong;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 450, 20, "USA", 1991, true, 60);
        SoundStudioRepository soundStudioRepository = new SoundStudioRepository();
        soundStudioRepository.add(rockSong);
        return Arrays.asList(new Object[][]{
                {soundStudioRepository, rockSong},
        });
    }

    @Test
    public void soundStudioRepositoryRemoveTest() {
        long expectedSize = 0;
        soundStudioRepository.remove(rockSong);
        long actualSize = soundStudioRepository.count(Objects::nonNull);
        assertEquals(expectedSize, actualSize);
    }
}
