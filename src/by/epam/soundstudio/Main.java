/**
 * Created by Alexander Lomat on 23.03.19.
 * Version 1.0
 */

package by.epam.soundstudio;

import by.epam.soundstudio.validator.SongValidator;

public class Main {
    public static void main(String[] args) {
        System.out.println(SongValidator.validateRockSong(" Metallica - the unforgiven, 20, 30.5," +
                " United States of America, 1999, TRuE, 0"));
    }
}
