package leetcode.com.contains.duplicate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolverTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        int[] array = {1, 2, 3, 4, 5};
        assertFalse(underTest.containsDuplicate(array));
    }

    @Test
    void test2() {
        int[] array = {1, 2, 3, 4, 4};
        assertTrue(underTest.containsDuplicate(array));
    }

    @Test
    void test3() {
        int[] array = {};
        assertFalse(underTest.containsDuplicate(array));
    }

    @Test
    void test4() {
        int[] array = {-1, -2, -4, -4, 2, 2};
        assertTrue(underTest.containsDuplicate(array));
    }

    @Test
    void test5() {
        int[] array = {22, 0, 0, 0, 15};
        assertTrue(underTest.containsDuplicate(array));
    }
}
