package by.epam.soundstudio.validator;

import java.util.regex.Pattern;

public class SymphonicSongValidator implements SongValidator {

    private static final String SYMPHONIC_SONG_REGEX_PATTERN = "^ ?([\\w ]+)\\b ?- ?\\b([\\w ]+) ?, ?([\\d]+) ?," +
            " ?([\\d.]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?$";

    @Override
    public boolean validate(String data) {
        return Pattern.matches(SYMPHONIC_SONG_REGEX_PATTERN, data);
    }
}
