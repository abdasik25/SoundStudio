package by.epam.soundstudio.creator;

import by.epam.soundstudio.converter.StringSplitter;
import by.epam.soundstudio.data.RapSong;
import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.factory.RapSongFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RapSongCreatorTest {

    private String actual;
    private RapSong expected;

    public RapSongCreatorTest(String actual, RapSong expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {"1,name,2,3,country,4,beatmaker,samplesong", new RapSong("name", 2,
                        new BigDecimal("3"), "country", 4, "beatmaker",
                        "samplesong")},
        });
    }

    @Test
    public void rapSongCreatorTest() {
        StringSplitter stringSplitter = new StringSplitter();
        List<String> data = stringSplitter.splitString(actual, ',');
        RapSongFactory rapSongFactory = new RapSongFactory();
        Song rapSong = rapSongFactory.create(data);
        assertEquals(expected, rapSong);
    }
}