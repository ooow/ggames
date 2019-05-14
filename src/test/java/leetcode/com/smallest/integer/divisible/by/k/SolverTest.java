package leetcode.com.smallest.integer.divisible.by.k;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        assertEquals(underTest.smallestRepunitDivByK(1), 1);
    }

    @Test
    void test2() {
        assertEquals(underTest.smallestRepunitDivByK(2), -1);
    }

    @Test
    void test3() {
        assertEquals(underTest.smallestRepunitDivByK(3), 3);
    }

    @Test
    void test7() {
        assertEquals(underTest.smallestRepunitDivByK(17), 16);
    }

    @Test
    void test8() {
        assertEquals(underTest.smallestRepunitDivByK(23), 22);
    }
}
