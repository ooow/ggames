package leetcode.com.maximize.sum.of.array.after.k.negations;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        int[] array = {4, 2, 3};

        assertEquals(underTest.largestSumAfterKNegations(array, 1), 5);
    }

    @Test
    void test2() {
        int[] array = {3, -1, 0, 2};

        assertEquals(underTest.largestSumAfterKNegations(array, 3), 6);
    }

    @Test
    void test3() {
        int[] array = {2, -3, -1, 5, -4};

        assertEquals(underTest.largestSumAfterKNegations(array, 2), 13);
    }
}
