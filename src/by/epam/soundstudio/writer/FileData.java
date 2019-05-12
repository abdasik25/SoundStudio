package by.epam.soundstudio.writer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileData {

    private static final Logger LOGGER = LogManager.getLogger();


    //FIXME
    private static FileData INSTANCE;

    private static FileData getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new FileData();
        }
        return INSTANCE;
    }

    public void writeData(String filePath, String line) throws FileNotFoundException{
        try (FileWriter writer = new FileWriter(filePath, true)) {
            LOGGER.debug(line + " was wrote in file " + filePath);
            writer.write("\n" + line);
        } catch (IOException e) {
            throw new FileNotFoundException("File " + filePath + "not found");
        }
    }
}
