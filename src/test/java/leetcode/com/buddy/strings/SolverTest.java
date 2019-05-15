package leetcode.com.buddy.strings;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        assertTrue(underTest.buddyStrings("ab", "ba"));
    }

    @Test
    void test2() {
        assertFalse(underTest.buddyStrings("ab", "ab"));
    }

    @Test
    void test3() {
        assertTrue(underTest.buddyStrings("aa", "aa"));
    }

    @Test
    void test4() {
        assertTrue(underTest.buddyStrings("aaaaaaabc", "aaaaaaacb"));
    }

    @Test
    void test5() {
        assertFalse(underTest.buddyStrings("", "ab"));
    }

    @Test
    void test6() {
        assertTrue(underTest.buddyStrings("cdcd", "cdcd"));
    }

    @Test
    void test7() {
        assertTrue(underTest.buddyStrings("abcdede", "abcdede"));
    }

    @Test
    void test8() {
        assertFalse(underTest.buddyStrings("abcd", "badc"));
    }

    @Test
    void test9() {
        assertFalse(underTest.buddyStrings("abcaa", "abcbb"));
    }

    @Test
    void test10() {
        assertFalse(underTest.buddyStrings("ab", "ca"));
    }
}
