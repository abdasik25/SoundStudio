/**
 * Created by Alexander Lomat on 10.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.reader;

import by.epam.soundstudio.exceptions.SongFileNotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//FIXME INSTANCE?
public class FileReader {

    private static final Logger LOGGER = LogManager.getLogger();
    private static final String DEFAULT_DATA_FILE = "data/default/songs_default_data.txt";

    private static FileReader INSTANCE;

    public static FileReader getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new FileReader();
        }
        return INSTANCE;
    }

    public List<String> readDataFromFile(String filePath) throws SongFileNotFoundException {
        List<String> resultData = null;
        if (Files.exists(Paths.get(filePath))) {
            try {
                resultData = Files.readAllLines(Paths.get(filePath), Charset.defaultCharset());
            } catch (IOException e) {
                LOGGER.fatal("Can't find file: " + filePath, e);
                throw new SongFileNotFoundException();
            }
        }
        return resultData;
    }

}
