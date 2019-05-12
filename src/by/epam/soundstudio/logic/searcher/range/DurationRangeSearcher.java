//package by.epam.soundstudio.logic.searcher.range;
//
//import by.epam.soundstudio.container.Disks;
//
//public class DurationRangeSearcher implements RangeSearcher {
//    @Override
//    public int searchInRange(Disks disks, int durationInMinutes, int deltaInSeconds) {
//        for (int i = 0; i < disks.size(); i++) {
//            if (disks.getElement(i).getDurationInSeconds() >= durationInMinutes * 60 - deltaInSeconds ||
//                    (disks.getElement(i).getDurationInSeconds() <= durationInMinutes * 60 + deltaInSeconds
//                            && disks.getElement(i).getDurationInSeconds() > durationInMinutes * 60)) {
//                return i;
//            }
//        }
//        return -1;
//    }
//}
