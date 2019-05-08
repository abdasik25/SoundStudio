/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Controller part - CONTROLLER: Console working example
 */

package by.epam.soundstudio.controller;

import by.epam.soundstudio.data.RapSong;
import by.epam.soundstudio.specification.comparsion.CostComparator;

public class Main {
    public static void main(String[] args) {
////        RapSong rapSong = new RapSong("MC YELLA - WORTH IT", 320, 20, "USA", 1995, "DR. DRE", "NWA - F.T.P");
////        SymphonicSong symphonicSong = new SymphonicSong("SFSO - Until it sleeps", 20, 30, "USA", 1991, "MICHAEL", 20);
//        Disks disks = new Disks();
//        disks.addElementToEnd(rockSong);
//        disks.addElementToEnd(rapSong);
//        disks.addElementToEnd(symphonicSong);
//        disks.addElementToEnd(rockSong1);
//        System.out.println(ConsolePrinter.output(DiskTotalDuration.countTotalDurationMinutes(disks)));
//        CostSorter.costSort(disks, 0, disks.size() - 1, false);
//        NameSorter.nameSort(disks, true);
//        DurationSorter.lengthSort(disks, true);
//        System.out.println(new CostRangeSearcher().searchInRange(disks, 250, 40));
//        System.out.println(new DurationRangeSearcher().searchInRange(disks, 6, 60));
//        System.out.println("---------------------");
//        for (int i = 0; i < NameSearcher.searchByName(disks, "METALLICA").length; i++) {
//            System.out.println(disks.getElement((int) NameSearcher.searchByName(disks, "METALLICA")[i]));
//        }
//        System.out.println("---------------------");
//        System.out.println(ConsolePrinter.output(disks.toString()));

        RapSong rapSong = new RapSong(1,"MC YELLA - WORTH IT", 320, 20, "USA", 1995, "DR. DRE", "NWA - F.T.P");
        RapSong rapSong1 = new RapSong(2,"MC YELLA - WORTH IT", 320, 20, "USA", 1995, "DR. DRE", "NWA - F.T.P");

        CostComparator costComparator = new CostComparator();
        System.out.println(costComparator.compare(rapSong,rapSong1));
    }
}
