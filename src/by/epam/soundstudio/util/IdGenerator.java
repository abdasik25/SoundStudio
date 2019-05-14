/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.util;

public class IdGenerator {
    private static long idCounter = 0;

    private IdGenerator(){
    }

    public static long generateId() {
        return idCounter++;
    }

    public static void setId(long id) {
        idCounter = id;
    }
}
