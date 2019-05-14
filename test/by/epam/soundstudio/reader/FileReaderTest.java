/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.reader;

import by.epam.soundstudio.exceptions.SongFileNotFoundException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FileReaderTest {

    private FileReader fileReader = FileReader.getINSTANCE();
    private List<String> expected;
    private String actual;

    public FileReaderTest(List<String> expected, String actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        final String DATA_FILE_PATH = "test_data/songs_data.txt";
        List<String> testDataList = new ArrayList<>();
        testDataList.add("1,1,name,2,3,country,4,0,0");
        testDataList.add("2,2,name2,3,4,country2,5,1,1");
        return Arrays.asList(new Object[][]{
                {testDataList, DATA_FILE_PATH},
        });
    }

    @Test
    public void readDataFromFileTest() throws SongFileNotFoundException {
        List<String> fileData = fileReader.readDataFromFile(actual);
        assertEquals(expected, fileData);
    }
}