package leetcode.com.powerful.integers;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        assertEquals(underTest.powerfulIntegers(3, 5, 15),
                Arrays.asList(2, 4, 6, 8, 10, 14));
    }

    @Test
    void test2() {
        assertEquals(underTest.powerfulIntegers(2, 3, 10),
                Arrays.asList(2, 3, 4, 5, 7, 9, 10));
    }

    @Test
    void test3() {
        assertEquals(underTest.powerfulIntegers(2, 1, 10),
                Arrays.asList(2, 3, 5, 9));
    }
}
