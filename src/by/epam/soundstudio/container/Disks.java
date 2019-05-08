/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - CONTAINER: Container Service Class
 */


package by.epam.soundstudio.container;

import by.epam.soundstudio.data.Song;

public class Disks {

    private Disk diskModelData;

    public Disks() {
        diskModelData = new Disk();
    }

    public void setElement(int index, Song element) {
        diskModelData.getElements()[index] = element;
    }

    public void addElementsToEnd(Song[] elements) {
        int elementCount = diskModelData.size();
        Song[] vectorElements = diskModelData.getElements();
        elementCount += elements.length;
        Song[] tmpElements = new Song[elementCount];
        for (int i = 0; i <= elementCount; i++) {
            if (elementCount - elements.length == i) {
                for (int j = elementCount - elements.length, k = 0; j < elementCount; j++, k++) {
                    tmpElements[j] = elements[k];
                }
                break;
            }
            tmpElements[i] = vectorElements[i];
        }
        vectorElements = tmpElements;
        diskModelData.setElements(vectorElements);
        diskModelData.setElementCount(elementCount);
    }

    public void addElementToEnd(Song element) {
        int elementCount = diskModelData.size();
        Song[] elements = diskModelData.getElements();
        elementCount++;
        Song[] tmpElements = new Song[elementCount];
        for (int i = 0; i < elementCount; i++) {
            //last element
            if (i == elementCount - 1) {
                tmpElements[i] = element;
                break;
            }
            tmpElements[i] = elements[i];
        }
        diskModelData.setElementCount(elementCount);
        elements = tmpElements;
        diskModelData.setElements(elements);
        diskModelData.setElementCount(elementCount);
    }

    public Song[] getElements() {
        return diskModelData.getElements();
    }

    public Song getElement(int i) {
        return diskModelData.getElements()[i];
    }

    public void setElements(Song[] elements) {
        if (elements == null){
            diskModelData.setElementCount(0);
            return;
        }
        diskModelData.setElements(elements);
        diskModelData.setElementCount(elements.length);
    }

    public void setElementCount(int elementCount) {
        diskModelData.setElementCount(elementCount);
    }

    public int size() {
        return diskModelData.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n=========================");
        for (int i = 0; i < size(); i++) {
            builder.append(getElements()[i]).append(" ");
        }
        builder.append("\n");
        builder.append("=========================");
        return "DISK: " + builder.toString();
    }
}


