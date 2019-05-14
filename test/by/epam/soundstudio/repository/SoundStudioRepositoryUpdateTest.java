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

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class SoundStudioRepositoryUpdateTest {

    private SoundStudioRepository soundStudioRepository;

    public SoundStudioRepositoryUpdateTest(SoundStudioRepository soundStudioRepository) {
        this.soundStudioRepository = soundStudioRepository;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 450, 20, "USA", 1991, true, 60);
        SoundStudioRepository soundStudioRepository = new SoundStudioRepository();
        soundStudioRepository.add(rockSong);
        return Arrays.asList(new Object[][]{
                {soundStudioRepository},
        });
    }

    @Test
    public void soundStudioRepositoryUpdateTest(){
        RockSong rockSong1 = new RockSong("Metallica - Turn The Page", 300, 20,
            "USA", 1997, false, 60);
        rockSong1.setId(1);
        soundStudioRepository.update(rockSong1);
        assertTrue(soundStudioRepository.getSong(0).equals(rockSong1));
    }
}
