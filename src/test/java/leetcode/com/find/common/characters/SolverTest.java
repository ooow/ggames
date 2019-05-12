package leetcode.com.find.common.characters;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        String[] array = {"bella", "label", "roller"};

        assertEquals(underTest.commonChars(array),
                Arrays.asList("e", "l", "l"));
    }

    @Test
    void test2() {
        String[] array = {"cool", "lock", "cook"};

        assertEquals(underTest.commonChars(array),
                Arrays.asList("c", "o"));
    }
}
