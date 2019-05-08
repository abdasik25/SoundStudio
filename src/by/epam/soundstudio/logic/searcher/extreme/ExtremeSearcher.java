package by.epam.soundstudio.logic.searcher.extreme;

import by.epam.soundstudio.container.Disks;

public interface ExtremeSearcher {
    int search(Disks disks, int value, int leftBorder, int rightBorder);
}
