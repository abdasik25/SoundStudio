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

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class RockSongValidatorTest {

    private boolean expected;
    private String actual;

    public RockSongValidatorTest(boolean expected, String actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParametrs() {
        return Arrays.asList(new Object[][]{
                {true, "name - surname, 2, 3, country, 4, 0, 0"},
                {false, "name, 2, 3, country, 4, beatmaker, samplesong"},
        });
    }
    @Test
    public void rockSongValidatorTest(){
        RapSongValidator rapSongValidator = new RapSongValidator();
        assertEquals(expected, rapSongValidator.validate(actual));
    }
}