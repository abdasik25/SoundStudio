package by.epam.soundstudio.converter;

import by.epam.soundstudio.validator.RapSongValidator;
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
public class CleanRapSongList {

    private List<String> expected;
    private List<String> actual;

    public CleanRapSongList(List<String> expected, List<String> actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParametrs() {
        List<String> expectedList = new ArrayList<>();
        List<String> actualList = new ArrayList<>();
        actualList.add("na!m^e,2?,3!,c?ou?nt?r?y,4,bea!t!ma!!ker,s^amplesong");
        actualList.add("name - surname,1,3.5,country,4,beatmaker,samplesong");
        expectedList.add("name - surname,1,3.5,country,4,beatmaker,samplesong");
        return Arrays.asList(new Object[][]{
                {expectedList, actualList},
        });
    }

    @Test
    public void cleanRapSongListTest() {
        StringCleaner stringCleaner = new StringCleaner();
        SongValidator rapSongValidator = new RapSongValidator();
        List<String> cleanList = stringCleaner.cleanSongList(rapSongValidator, actual);
        assertEquals(expected, cleanList);
    }

}
