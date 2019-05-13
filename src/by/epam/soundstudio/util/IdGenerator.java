package by.epam.soundstudio.util;

public class IdGenerator {
    private static long idCounter = 0;

    public static long createId() {
        return idCounter++;
    }

    public static void setId(long id) {
        idCounter = id;
    }
}
