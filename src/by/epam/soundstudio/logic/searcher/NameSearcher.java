package by.epam.soundstudio.logic.searcher;

import by.epam.soundstudio.container.Disks;

import java.util.ArrayList;


public class NameSearcher {
    public static Object[] searchByName(Disks disks, String name) {
        int j = 0;
        ArrayList<Integer> names = new ArrayList<>();
        if (disks.size() == 0 || disks == null) {
            return  names.toArray();
        }
        for (int i = 0; i < disks.size(); i++) {
            if (disks.getElement(i).getName().lastIndexOf(name) != -1) {
                names.add(i);
            }
        }
        return  names.toArray();
    }
}
