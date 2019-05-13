package by.epam.soundstudio.validator;

import java.util.regex.Pattern;

public class RockSongValidator implements SongValidator {

    private static final String ROCK_SONG_REGEX_PATTERN = "^ ?([\\w ]+)\\b ?- ?\\b([\\w ]+) ?, ?([\\d]+) ?," +
            " ?([\\d.]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?" + ", ([Tt][Rr][Uu][Ee]|[Ff][Aa][Ll][Ss][Ee]), ?([\\d]+) ?$";

    @Override
    public boolean validate(String data) {
        return Pattern.matches(ROCK_SONG_REGEX_PATTERN, data);
    }
}
