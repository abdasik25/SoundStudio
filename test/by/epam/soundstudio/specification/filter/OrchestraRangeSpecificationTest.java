/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.specification.filter;

import by.epam.soundstudio.data.SymphonicSong;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class OrchestraRangeSpecificationTest {

    private SymphonicSong symphonicSong;
    private boolean result;

    public OrchestraRangeSpecificationTest(SymphonicSong rockSong, boolean result) {
        this.symphonicSong = rockSong;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        SymphonicSong symphonicSong = new SymphonicSong("SYMPHONY VII", 7000, 20,
                "USA", 1893, "BACH", 20);
        return Arrays.asList(new Object[][]{
                {symphonicSong, true},
        });
    }

    @Test
    public void orchestraRangeSpecificationTest(){
        OrchestraRangeSpecification orchestraRangeSpecification =
                new OrchestraRangeSpecification(20,30);
        assertEquals(orchestraRangeSpecification.test(symphonicSong), result);
    }
}