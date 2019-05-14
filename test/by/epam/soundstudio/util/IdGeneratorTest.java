/**
 * Created by Alexander Lomat on 14.05.19
 * Version 0.0.1
 */

package by.epam.soundstudio.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IdGeneratorTest {

    private long expected;
    private long actual;

    public IdGeneratorTest(long expected, long actual) {
        this.expected = expected;
        this.actual = actual;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
       // IdGenerator.setId(0); --> only for all tests at 1 time!
        return Arrays.asList(new Object[][]{
                {IdGenerator.generateId(), 0},
                {IdGenerator.generateId(), 1},
                {IdGenerator.generateId(), 2},
        });
    }

    @Test
    public void generateIdTest() {
        assertEquals(actual, expected);
    }
}