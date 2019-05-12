///**
// * Created by Alexander Lomat on 23.03.19.
// * Version 1.0
// * EPAM Main Task 02: Object-Oriented Programming with Java
// * Model part - SORTER: Sorting by song name in alphabet order
// */
//
//
//package by.epam.soundstudio.logic.sorter;
//
//
//import by.epam.soundstudio.container.Disks;
//import by.epam.soundstudio.data.Song;
//
//public class NameSorter {
//    public static void nameSort(Disks disks, boolean isAscending) {
//        for (int j = 0; j < disks.size(); j++) {
//            for (int i = j + 1; i < disks.size(); i++) {
//                if (disks.getElement(i).getName().compareTo(disks.getElement(j).getName()) < 0 && !isAscending) {
//                    Song tmp = disks.getElement(j);
//                    disks.setElement(j, disks.getElement(i));
//                    disks.setElement(i,tmp);
//                }
//                else if (disks.getElement(i).getName().compareTo(disks.getElement(j).getName()) > 0 && isAscending){
//                    Song tmp = disks.getElement(j);
//                    disks.setElement(j, disks.getElement(i));
//                    disks.setElement(i,tmp);
//                }
//            }
//        }
//    }
//}
