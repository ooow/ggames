package leetcode.com.two.sum;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        int[] array = {2, 7, 11, 15};

        assertArrayEquals(underTest.twoSum(array, 9),
                new int[]{0, 1});
    }

    @Test
    void test2() {
        int[] array = {3, 2, 4};

        assertArrayEquals(underTest.twoSum(array, 6),
                new int[]{1, 2});
    }

    @Test
    void test3() {
        int[] array = {2, 5, 5, 11};

        assertArrayEquals(underTest.twoSum(array, 10),
                new int[]{1, 2});
    }
}
