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
//public class NameSorterDescendingTest {
//
//    private Disks disks;
//    private Song[] expected;
//
//
//    public NameSorterDescendingTest(Disks disks, Song[] elements, Song[] expected) {
//        this.disks = disks;
//        this.expected = expected;
//        disks.setElements(elements);
//    }
//
//    @Parameterized.Parameters
//    public static Collection<Object[]> getParameters() {
//        RockSong rockSong = new RockSong(1,"Metallica", 300, 10, "2", 1991, true, 20);
//        RapSong rapSong = new RapSong(2,"Meballica", 320, 30, "2", 1995, "2", "3");
//        RapSong rapSong1 = new RapSong(3,"Aebcllica", 320, 30, "2", 1995, "2", "3");
//        Disks disks = new Disks();
//        return Arrays.asList(new Object[][]{
//                {disks, new Song[]{rapSong, rockSong, rapSong1}, new Song[]{rapSong1, rapSong, rockSong}},
//                {disks, new Song[]{}, new Song[]{}},
//        });
//    }
//
//    @Test
//    public void nameSorterDescendingTest() {
//        NameSorter.nameSort(disks, false);
//        Assert.assertArrayEquals(expected, disks.getElements());
//    }
//}