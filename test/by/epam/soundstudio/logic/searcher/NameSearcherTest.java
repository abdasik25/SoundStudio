//package by.epam.soundstudio.logic.searcher;
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
//import static org.junit.Assert.assertArrayEquals;
//
//
//@RunWith(Parameterized.class)
//public class NameSearcherTest {
//
//    private Disks disks;
//    private Object[] expected;
//
//
//    public NameSearcherTest(Disks disks, Song[] elements, Object[] expected) {
//        this.disks = disks;
//        this.expected = expected;
//        disks.setElements(elements);
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getParameters() {
//        RockSong rockSong1 = new RockSong(1,"1", 300, 200, "2", 1991, true, 20);
//        RockSong rockSong2 = new RockSong(2,"1", 500, 20, "2", 1991, false, 70);
//        RapSong rapSong1 = new RapSong(3,"2", 320, 20, "2", 1995, "2", "3");
//        Disks disks = new Disks();
//        return Arrays.asList(new Object[][]{
//                {disks, new Song[]{rockSong1, rockSong2, rapSong1}, new Object[]{0,1}},
//                {disks, null, new Object[]{}},
//                {disks, new Song[]{}, new Object[]{}},
//        });
//    }
//
//    @Test
//    public void totalDurationTest() {
//        assertArrayEquals(expected, NameSearcher.searchByName(disks,"1"));
//    }
//}