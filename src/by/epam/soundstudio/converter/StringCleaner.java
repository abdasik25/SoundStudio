package by.epam.soundstudio.converter;

import by.epam.soundstudio.validator.SongValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class StringCleaner {

    private static final Logger LOGGER = LogManager.getLogger();

    private static final String ILLEGAL_CHARS = "[_/@!?~^;{}]";


    public String deleteIllegalChars(String line) {
        line = line.replaceAll(ILLEGAL_CHARS, "");
        return line;
    }

    public List<String> cleanSongList(SongValidator songValidator, List<String> fileData) {
        List<String> resultList = new ArrayList<>();
        for (String line : fileData) {
            if (songValidator.validate(line)) {
                line = deleteIllegalChars(line);
                resultList.add(line);
            } else {
                LOGGER.debug(songValidator.getClass() + ": Line '" + line + "' was removed");
            }
        }
        return resultList;
    }

}
