/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.repository;

import by.epam.soundstudio.data.RockSong;
import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.specification.filter.CostRangeSpecification;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SoundStudioRepositoryQueryTest {
    private SoundStudioRepository soundStudioRepository;
    private List<Song> expected;

    public SoundStudioRepositoryQueryTest(SoundStudioRepository soundStudioRepository) {
        this.soundStudioRepository = soundStudioRepository;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        SoundStudioRepository soundStudioRepository = new SoundStudioRepository();
        RockSong rockSong = new RockSong("Metallica - The Unforgiven", 450, 20,
                "USA", 1991, true, 60);
        RockSong rockSong1 = new RockSong("Metallica - Turn The Page", 300, 20,
                "USA", 1997, false, 60);

        soundStudioRepository.add(rockSong);
        soundStudioRepository.add(rockSong1);

        return Arrays.asList(new Object[][]{
                {soundStudioRepository},
        });
    }

    @Test
    public void setSoundStudioRepositoryQueryTest() {
        CostRangeSpecification  costRangeSpecification= new CostRangeSpecification(10,25);
        expected = soundStudioRepository.query(costRangeSpecification::test);
        assertEquals(expected.size(), 2);
    }
}
