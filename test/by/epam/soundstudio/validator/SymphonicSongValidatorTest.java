/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.validator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SymphonicSongValidatorTest {

    private boolean expected;
    private String actual;

    public SymphonicSongValidatorTest(boolean expected, String actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParametrs() {
        return Arrays.asList(new Object[][]{
                {true, "name - surname, 2, 3, country, 4, beatmaker, 0"},
                {false, "name, 2, 3, country, 4, beatmaker, samplesong"},
        });
    }
    @Test
    public void symphonicSongValidatorTest(){
        SymphonicSongValidator symphonicSongValidator = new SymphonicSongValidator();
        assertEquals(expected, symphonicSongValidator.validate(actual));
    }
}