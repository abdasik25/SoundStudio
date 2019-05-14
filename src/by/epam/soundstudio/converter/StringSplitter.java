/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

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
