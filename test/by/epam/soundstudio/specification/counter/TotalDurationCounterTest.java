/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.counter;

import by.epam.soundstudio.data.RockSong;
import by.epam.soundstudio.repository.SoundStudioRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TotalDurationCounterTest {

    private SoundStudioRepository soundStudioRepository;

    public TotalDurationCounterTest(SoundStudioRepository soundStudioRepository) {
        this.soundStudioRepository = soundStudioRepository;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 600, 20, "USA", 1991, true, 60);
        SoundStudioRepository soundStudioRepository = new SoundStudioRepository();
        soundStudioRepository.add(rockSong);
        return Arrays.asList(new Object[][]{
                {soundStudioRepository},
        });
    }

    @Test
    public void soundStudioRepositoryAddTest() {
        TotalDurationCounter totalDurationCounter = new TotalDurationCounter();
        long expectedSize = 10;
        long actualSize = totalDurationCounter.apply(soundStudioRepository);
        assertEquals(expectedSize, actualSize);
    }

}