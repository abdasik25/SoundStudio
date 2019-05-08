package by.epam.soundstudio.logic.searcher.extreme;

import by.epam.soundstudio.container.Disks;
import by.epam.soundstudio.data.Song;
import by.epam.soundstudio.logic.sorter.isSortedAscending;

public class ExtremeCostSearcher implements ExtremeSearcher {
    public ExtremeCostSearcher(){}
    @Override
    public int search(Disks disks, int value, int l, int r) {
        if (disks.size() == 0 || disks == null || !isSortedAscending.isSortedAccedingByCost(disks)){
            return -1;
        }
        Song[] arr = disks.getElements();
        if (r >= l) {
            int mid = l + (r - l) / 2;
            //if the element is present at the middle itself
            if (arr[mid].getCost() == value)
                return mid;

            //if element is smaller than mid, then
            //it can only be present in left subarray
            if (arr[mid].getCost() > value)
                return search(disks, value, l, mid - 1);

            //else the element can only be present
            //in right subarray
            return search(disks, value, mid + 1, r);
        }
        //we reach here when element is not present
        //in array
        return -1;
    }
}
