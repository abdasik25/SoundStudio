/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - SORTER: Sorting by cost
 */


package by.epam.soundstudio.logic.sorter;

import by.epam.soundstudio.container.Disks;
import by.epam.soundstudio.data.Song;

public class CostSorter{

    //merges two subarrays of arr[].
    //first subarray is arr[lowBound..middlePoint]
    //second subarray is arr[middlePoint+1..upperBound]
    private static void merge(Song arr[], int lowBound, int middlePoint, int upperBound, boolean ascending) {
        // Find sizes of two subarrays to be merged
        int n1 = middlePoint - lowBound + 1;
        int n2 = upperBound - middlePoint;
        //create temp arrays
        Song L[] = new Song[n1];
        Song R[] = new Song[n2];
        //copy data to temp arrays
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[lowBound + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[middlePoint + 1 + j];
        }
        //merge the temp arrays */
        //initial indexes of first and second subarrays
        int i = 0, j = 0;
        //initial index of merged subarray array
        int k = lowBound;
        while (i < n1 && j < n2) {
            if (L[i].getCost() >= R[j].getCost() && !ascending) {
                arr[k] = L[i];
                i++;
            } else if (L[i].getCost() <= R[j].getCost() && ascending) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    //main function that sorts arr[l..r] using
    //merge()
    public static void costSort(Disks disks, int lowBound, int highBound, boolean ascending) {
        if (disks.size() == 0 && disks == null){
            return;
        }
        Song[] arr = disks.getElements();
        if (lowBound < highBound) {
            //find the middle point
            int m = (lowBound + highBound) / 2;
            //sort first and second halves
            costSort(disks, lowBound, m, ascending);
            costSort(disks, m + 1, highBound, ascending);
            //merge the sorted halves
            merge(arr, lowBound, m, highBound, ascending);
        }
    }

}
