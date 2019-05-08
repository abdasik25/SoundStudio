package by.epam.soundstudio.logic.searcher.extreme;

import by.epam.soundstudio.container.Disks;
import by.epam.soundstudio.data.RapSong;
import by.epam.soundstudio.data.RockSong;
import by.epam.soundstudio.data.Song;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ExtremeDurationSearcherTest {

    private Disks disks;
    private int expected;


    public ExtremeDurationSearcherTest(Disks disks, Song[] elements, int expected) {
        this.disks = disks;
        this.expected = expected;
        disks.setElements(elements);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        RockSong rockSong = new RockSong(1,"1", 300, 10, "2", 1991, true, 20);
        RapSong rapSong = new RapSong(2,"2", 320, 30, "2", 1995, "2", "3");
        Disks disks = new Disks();
        return Arrays.asList(new Object[][]{
                {disks, new Song[]{rockSong, rapSong}, 0},
                {disks, null, -1},
                {disks, new Song[]{}, -1},
                {disks, new Song[]{rapSong, rockSong}, -1},
        });
    }

    @Test
    public void extremeDurationSearcherTest() {
        assertEquals(expected, new ExtremeDurationSearcher().search(disks, 300, 0, disks.size()));
    }
}