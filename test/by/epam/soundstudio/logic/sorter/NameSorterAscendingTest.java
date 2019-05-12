//package by.epam.soundstudio.logic.sorter;
//
//import by.epam.soundstudio.container.Disks;
//import by.epam.soundstudio.data.RapSong;
//import by.epam.soundstudio.data.RockSong;
//import by.epam.soundstudio.data.Song;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//
//@RunWith(Parameterized.class)
//public class NameSorterAscendingTest {
//
//    private Disks disks;
//    private Song[] expected;
//
//
//    public NameSorterAscendingTest(Disks disks, Song[] elements, Song[] expected) {
//        this.disks = disks;
//        this.expected = expected;
//        disks.setElements(elements);
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getParameters() {
//        RockSong rockSong = new RockSong(1,"Metallica", 300, 10, "2", 1991, true, 20);
//        RapSong rapSong = new RapSong(2,"Meballica", 320, 30, "2", 1995, "2", "3");
//        RapSong rapSong1 = new RapSong(3,"Mebcllica", 320, 30, "2", 1995, "2", "3");
//        Disks disks = new Disks();
//        return Arrays.asList(new Object[][]{
//                {disks, new Song[]{rapSong, rockSong, rapSong1}, new Song[]{rockSong, rapSong1, rapSong}},
//                {disks, new Song[]{}, new Song[]{}},
//        });
//    }
//
//    @Test
//    public void nameSorterAscendingTest() {
//        NameSorter.nameSort(disks, true);
//        Assert.assertArrayEquals(expected, disks.getElements());
//    }
//}