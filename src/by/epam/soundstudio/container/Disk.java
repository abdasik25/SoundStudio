/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 * EPAM Main Task 02: Object-Oriented Programming with Java
 * Model part - CONTAINER: Container Entity Class
 */


package by.epam.soundstudio.container;

import by.epam.soundstudio.data.Song;

public class Disk {
    //The array buffer
    private Song[] elements;
    //The array number of elements
    private int elementCount;

    public Disk() {
        elementCount = 0;
        elements = new Song[elementCount];
    }

    public Disk(Song[] elements, int elementCount) {
        this.elements = elements;
        this.elementCount = elementCount;
    }

    public Song[] getElements() {
        return elements;
    }

    public void setElements(Song[] elements) {
        this.elements = elements;
    }

    //size of an array
    public int size() {
        return elementCount;
    }

    public void setElementCount(int elementCount) {
        this.elementCount = elementCount;
    }

}