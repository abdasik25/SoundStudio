package by.epam.soundstudio.converter;

import by.epam.soundstudio.validator.SongValidator;
import by.epam.soundstudio.validator.SymphonicSongValidator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CleanSymphonicSongList {

    private List<String> expected;
    private List<String> actual;

    public CleanSymphonicSongList(List<String> expected, List<String> actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParametrs() {
        List<String> expectedList = new ArrayList<>();
        List<String> actualList = new ArrayList<>();
        actualList.add("na!m^e,2?,3!,c?ou?nt?r?y,4,bea!t!ma!!ker,s^amplesong");
        actualList.add("Bach- Symphony, 20, 30.5," +
                " Germany, 1999, Alexander, 0");
        expectedList.add("Bach- Symphony, 20, 30.5," +
                " Germany, 1999, Alexander, 0");
        return Arrays.asList(new Object[][]{
                {expectedList, actualList},

        });
    }

    @Test
    public void cleanSymphonicSongListTest() {
        StringCleaner stringCleaner = new StringCleaner();
        SongValidator symphonicSongValidator = new SymphonicSongValidator();
        List<String> cleanList = stringCleaner.cleanSongList(symphonicSongValidator, actual);
        assertEquals(expected, cleanList);
    }
}
