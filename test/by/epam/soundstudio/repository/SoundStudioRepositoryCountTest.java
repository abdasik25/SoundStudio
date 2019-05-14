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
public class SoundStudioRepositoryCountTest {

    private SoundStudioRepository soundStudioRepository;
    private long expectedSize;

    public SoundStudioRepositoryCountTest(SoundStudioRepository soundStudioRepository, long expectedSize) {
        this.soundStudioRepository = soundStudioRepository;
        this.expectedSize = expectedSize;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        SoundStudioRepository soundStudioRepository = new SoundStudioRepository();
        SoundStudioRepository soundStudioRepository1 = new SoundStudioRepository();
        soundStudioRepository1.add(new RockSong("Metallica - The Unforgiven", 450, 20,
                "USA", 1991, true, 60));
        return Arrays.asList(new Object[][]{
                {soundStudioRepository, 0},
                {soundStudioRepository1, 1},
        });
    }

    @Test
    public void soundStudioRepositoryCountTest(){
        assertEquals(soundStudioRepository.count(Objects::nonNull), expectedSize);
    }
}
