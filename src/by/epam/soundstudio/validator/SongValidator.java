package by.epam.soundstudio.validator;

import java.util.regex.Pattern;

public class SongValidator {

    private static final String ROCK_SONG_REGEX_PATTERN = "^ ?([\\w ]+)\\b ?- ?\\b([\\w ]+) ?, ?([\\d]+) ?," +
            " ?([\\d.]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?" + ", ([Tt][Rr][Uu][Ee]|[Ff][Aa][Ll][Ss][Ee]), ?([\\d]+) ?$";

    private static final String RAP_SONG_REGEX_PATTERN = "^ ?([\\w ]+ ) ?, ?([\\d]+) ?," +
            " ?([\\d.]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?, ?([\\w ]+ ) ?, ?([\\w ]+ ) ?$";

    private static final String SYMPHONIC_SONG_REGEX_PATTERN = "^ ?([\\w ]+ ) ?, ?([\\d]+) ?," +
            " ?([\\d.]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?, ?([\\w ]+ ) ?, ?([\\d]+) ?$";

    public static boolean validateRockSong(String data) {
        return Pattern.matches(ROCK_SONG_REGEX_PATTERN, data);
    }

    public static boolean validateRapSong(String data) {
        return Pattern.matches(RAP_SONG_REGEX_PATTERN, data);
    }

    public static boolean validateSymphonicSong(String data) {
        return Pattern.matches(SYMPHONIC_SONG_REGEX_PATTERN, data);
    }
}
