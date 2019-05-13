/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.validator;

import java.util.regex.Pattern;

public class RapSongValidator implements SongValidator {

    private static final String RAP_SONG_REGEX_PATTERN = "^ ?([\\w ]+ ) ?, ?([\\d]+) ?," +
            " ?([\\d.]+) ?, ?([\\w ]+) ?, ?([\\d]+) ?, ?([\\w ]+ ) ?, ?([\\w ]+ ) ?$";

    @Override
    public boolean validate(String data) {
        return Pattern.matches(RAP_SONG_REGEX_PATTERN, data);
    }
}
