package by.epam.soundstudio.logic.searcher.range;

import by.epam.soundstudio.container.Disks;

public class CostRangeSearcher implements RangeSearcher {
    @Override
    public int searchInRange(Disks disks, int approximateCost, int delta) {
        for (int i = 0; i < disks.size(); i++) {
            if (disks.getElement(i).getCost() >= approximateCost - delta ||
                    (disks.getElement(i).getCost() <= approximateCost + delta
                            && disks.getElement(i).getCost() > approximateCost)) {
                return i;
            }
        }
        return -1;
    }
}
