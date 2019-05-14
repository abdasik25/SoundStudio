/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.converter;

import by.epam.soundstudio.validator.RockSongValidator;
import by.epam.soundstudio.validator.SongValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CleanRockSongList {

    private List<String> expected;
    private List<String> actual;

    public CleanRockSongList(List<String> expected, List<String> actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParametrs() {
        List<String> expectedList = new ArrayList<>();
        List<String> actualList = new ArrayList<>();
        actualList.add("na!m^e,2?,3!,c?ou?nt?r?y,4,bea!t!ma!!ker,s^amplesong");
        actualList.add("metallica - the unforgiven, 20, 30.5," +
                " United States of America, 1999, true, 0");
        expectedList.add("metallica - the unforgiven, 20, 30.5," +
                " United States of America, 1999, true, 0");
        return Arrays.asList(new Object[][]{
                {expectedList, actualList},
        });
    }

    @Test
    public void cleanRockSongListTest() {
        StringCleaner stringCleaner = new StringCleaner();
        SongValidator rockSongValidator = new RockSongValidator();
        List<String> cleanList = stringCleaner.cleanSongList(rockSongValidator, actual);
        assertEquals(expected, cleanList);
    }
}
