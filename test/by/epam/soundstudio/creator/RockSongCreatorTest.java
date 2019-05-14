/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.creator;

import by.epam.soundstudio.converter.StringSplitter;
import by.epam.soundstudio.data.RockSong;
import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.factory.RockSongFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RockSongCreatorTest {

    private String actual;
    private RockSong expected;

    public RockSongCreatorTest(String actual, RockSong expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {"1,name,2,3,country,4,0,0", new RockSong("name", 2,
                        3, "country", 4, false,
                        0)},
        });

    }

    @Test
    public void rockSongCreatorTest() {
        StringSplitter stringSplitter = new StringSplitter();
        List<String> data = stringSplitter.splitString(actual, ',');
        RockSongFactory rockSongFactory = new RockSongFactory();
        Song rockSong = rockSongFactory.create(data);
        assertEquals(expected, rockSong);

    }
}