package by.epam.soundstudio.logic.sorter;

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
public class isSortedAscendingByCostTest {

    private Disks disks;
    private boolean expected;


    public isSortedAscendingByCostTest(Disks disks, Song[] elements, boolean expected) {
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
                {disks, new Song[]{rapSong, rockSong}, false},
                {disks, new Song[]{rockSong, rapSong}, true},
                {disks, new Song[]{rapSong, rapSong}, true},
                {disks, new Song[]{}, false},
                {disks, null, false},
        });
    }

    @Test
    public void isSortedAscendingByCostTest() {
        assertEquals(expected, isSortedAscending.isSortedAccedingByCost(disks));
    }
}