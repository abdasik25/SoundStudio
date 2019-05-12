//package by.epam.soundstudio.logic.counter;
//
//import by.epam.soundstudio.container.Disks;
//import by.epam.soundstudio.data.RapSong;
//import by.epam.soundstudio.data.RockSong;
//import by.epam.soundstudio.data.Song;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//import static org.junit.Assert.assertEquals;
//
//@RunWith(Parameterized.class)
//public class DiskTotalDurationTest {
//
//    private Disks disks;
//    private int expected;
//
//
//    public DiskTotalDurationTest(Disks disks, Song[] elements, int expected) {
//        this.disks = disks;
//        this.expected = expected;
//        disks.setElements(elements);
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getParameters() {
//        RockSong rockSong1 = new RockSong(1,"1", 300, 200, "2", 1991, true, 20);
//        RockSong rockSong2 = new RockSong(2,"1", 500, 20, "2", 1991, false, 70);
//        RapSong rapSong1 = new RapSong(3,"1", 320, 20, "2", 1995, "2", "3");
//        return Arrays.asList(new Object[][]{
//                {new Disks(), new Song[]{rockSong1,rockSong2, rapSong1}, 18},
//                {new Disks(), null, 0},
//                {new Disks(), new Song[]{} , 0},
//        });
//    }
//
//    @Test
//    public void totalDurationTest() {
//        assertEquals(expected, DiskTotalDuration.countTotalDurationMinutes(disks), 0.001d);
//    }
//}