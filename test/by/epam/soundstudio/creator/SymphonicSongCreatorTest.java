package by.epam.soundstudio.creator;

import by.epam.soundstudio.converter.StringSplitter;
import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.data.SymphonicSong;
import by.epam.soundstudio.factory.SymphonicSongFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SymphonicSongCreatorTest {

    private String actual;
    private SymphonicSong expected;

    public SymphonicSongCreatorTest(String actual, SymphonicSong expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {"1,name,2,3,country,4,compositorname,0", new SymphonicSong("name", 2,
                        new BigDecimal("3"), "country", 4, "compositorname",
                        0)},
        });

    }

    @Test
    public void rockSongCreatorTest() {
        StringSplitter stringSplitter = new StringSplitter();
        List<String> data = stringSplitter.splitString(actual, ',');
        SymphonicSongFactory symphonicSongFactory = new SymphonicSongFactory();
        Song symphonigSong = symphonicSongFactory.create(data);
        assertEquals(expected, symphonigSong);

    }
}