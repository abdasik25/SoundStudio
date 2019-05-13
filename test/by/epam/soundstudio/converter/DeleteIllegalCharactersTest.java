package by.epam.soundstudio.converter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class DeleteIllegalCharactersTest {

    private String actual;
    private String expected;

    public DeleteIllegalCharactersTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> illegalCharsParameters() {
        return Arrays.asList(new Object[][]{
                {"{a;l_e/x!a?n~de@r}", "alexander"},
        });
    }

    @Test
    public void deleteIllegalCharactersTest() {
        StringCleaner stringCleaner = new StringCleaner();
        String cleanString = stringCleaner.deleteIllegalChars(actual);
        assertEquals(expected, cleanString);
    }

}