package leetcode.com.n.repeated.element.in.size.two.n.array;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        int[] array = {1, 2, 3, 3};

        assertEquals(underTest.repeatedNTimes(array), 3);
    }

    @Test
    void test2() {
        int[] array = {2, 1, 2, 5, 3, 2};

        assertEquals(underTest.repeatedNTimes(array), 2);
    }

    @Test
    void test3() {
        int[] array = {5, 1, 5, 2, 5, 3, 5, 4};

        assertEquals(underTest.repeatedNTimes(array), 5);
    }
}
