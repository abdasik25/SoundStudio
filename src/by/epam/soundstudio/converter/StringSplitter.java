package by.epam.soundstudio.converter;

import java.util.Arrays;
import java.util.List;

public class StringSplitter {
    public List<String> splitString(String data, char character) {
        List<String> resultData;
        resultData = Arrays.asList(data.split(Character.toString(character)));
        return resultData;
    }
}
