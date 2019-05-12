///**
// * Created by Alexander Lomat on 23.03.19.
// * Version 1.0
// * EPAM Main Task 02: Object-Oriented Programming with Java
// * Model part - COUNTER: Counts total disk duration
// */
//
//package by.epam.soundstudio.logic.counter;
//
//import by.epam.soundstudio.container.Disks;
//
//public class DiskTotalDuration {
//
//    public static int countTotalDurationMinutes(Disks disk) {
//        int totalDuration = 0;
//        if (disk.size() == 0 || disk == null) {
//            return totalDuration;
//        }
//
//        for (int i = 0; i < disk.size(); i++) {
//            totalDuration += disk.getElement(i).getDurationInSeconds();
//        }
//        return totalDuration / 60;
//    }
//}
//
