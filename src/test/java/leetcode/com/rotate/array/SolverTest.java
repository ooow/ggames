package leetcode.com.rotate.array;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(underTest.rotate(arr, 3), expected);
    }

    @Test
    void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertArrayEquals(underTest.rotate(arr, 0), arr);
    }

    @Test
    void test3() {
        int[] arr = new int[]{1, 2, 3};
        assertArrayEquals(underTest.rotate(arr, 7), arr);
    }

    @Test
    void test4() {
        int[] arr = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 3};
        assertArrayEquals(underTest.rotate(arr, 3), expected);
    }

    @Test
    void test5() {
        int[] arr = new int[]{1, 2, 3};
        int[] expected = new int[]{2, 3, 1};
        assertArrayEquals(underTest.rotate(arr, 2), expected);
    }
}
