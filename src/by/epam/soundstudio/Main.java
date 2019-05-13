/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 */

package by.epam.soundstudio;

import by.epam.soundstudio.converter.StringCleaner;
import by.epam.soundstudio.validator.RockSongValidator;
import by.epam.soundstudio.validator.SongValidator;

public class Main {
    public static void main(String[] args) {
//TODO SETUP CLASSPATH FOR LOG4J
        SongValidator songValidator = new RockSongValidator();
        System.out.println((songValidator.validate(" Metallica - the unforgiven, 20, 30.5," +
                " United States of America, 1999, TRuE, 0")));
        StringCleaner stringCleaner = new StringCleaner();
        System.out.println(stringCleaner.deleteIllegalChars("Metall/ica - the unf/orgiven, 20, 30.5," +
                " United States of America, 1999, TRuE, 0"));
    }
}
