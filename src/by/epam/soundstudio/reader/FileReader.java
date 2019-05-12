package by.epam.soundstudio.reader;

import by.epam.soundstudio.exceptions.SongsFileNotFoundException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

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

    //FIXME
    public List<String> readDataFromFile(String filePath) throws SongsFileNotFoundException {
        List<String> resultData = null;
        if (Files.exists(Paths.get(filePath))) {
            try {
                resultData = Files.readAllLines(Paths.get(filePath), Charset.defaultCharset());
            } catch (IOException e) {
                LOGGER.fatal("Can't find file: " + filePath, e);
                throw new SongsFileNotFoundException();
            }
        }
        return resultData;
    }

}
