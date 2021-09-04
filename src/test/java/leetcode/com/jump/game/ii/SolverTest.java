package leetcode.com.jump.game.ii;

import static org.junit.jupiter.api.Assertions.assertEquals;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        int[] nums = {2, 3, 1, 1, 4};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test2() {
        int[] nums = {2, 3, 0, 1, 4};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test3() {
        int[] nums = {1, 1, 1, 1, 1};

        assertEquals(underTest.jump(nums), 4);
    }

    @Test
    void test4() {
        int[] nums = {1, 1, 2, 1, 1};

        assertEquals(underTest.jump(nums), 3);
    }

    @Test
    void test5() {
        int[] nums = {2, 2, 0, 1, 4};

        assertEquals(underTest.jump(nums), 3);
    }

    @Test
    void test6() {
        int[] nums = {2, 0, 2, 0, 4};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test7() {
        int[] nums = {0};

        assertEquals(underTest.jump(nums), 0);
    }

    @Test
    void test8() {
        int[] nums = {1, 2};

        assertEquals(underTest.jump(nums), 1);
    }

    @Test
    void test9() {
        int[] nums = {4, 1, 1, 3, 1, 1, 1};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test10() {
        int[] nums = {4, 1, 2, 3, 1, 1, 1};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test11() {
        int[] nums = {4, 2, 2, 3, 1, 1, 1};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test12() {
        int[] nums = {1, 2, 3};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test13() {
        int[] nums = {2, 3, 1};

        assertEquals(underTest.jump(nums), 1);
    }

    @Test
    void test14() {
        int[] nums = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 0};

        assertEquals(underTest.jump(nums), 2);
    }

    @Test
    void test15() {
        int[] nums = {1, 1, 1, 2, 1};

        assertEquals(underTest.jump(nums), 4);
    }

    @Test
    void test16() {
        int[] nums = {1, 1, 2, 1, 1};

        assertEquals(underTest.jump(nums), 3);
    }

    @Test
    void test17() {
        int[] nums = {2, 1, 1, 1, 1};

        assertEquals(underTest.jump(nums), 3);
    }

    @Test
    void test18() {
        int[] nums = {1, 1, 3, 1, 1};

        assertEquals(underTest.jump(nums), 3);
    }
}
