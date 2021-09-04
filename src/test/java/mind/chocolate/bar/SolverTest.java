package mind.chocolate.bar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolverTest {
    private final Solver underTest = new Solver();

    @Test
    void isSumPossible_true() {
        assertTrue(underTest.isSumPossible(4, new int[]{2, 2, 3, 5}));
        assertTrue(underTest.isSumPossible(4, new int[]{5, 2, 2, 3}));
        assertTrue(underTest.isSumPossible(7, new int[]{5, 2, 3, 5}));
        assertTrue(underTest.isSumPossible(5, new int[]{1, 1, 1, 1, 1}));
        assertTrue(underTest.isSumPossible(1, new int[]{1, 0, 9, 2}));
        assertTrue(underTest.isSumPossible(0, new int[]{1, 0, 0, 2}));
        assertTrue(underTest.isSumPossible(9, new int[]{9}));
        assertTrue(underTest.isSumPossible(-3, new int[]{-3, -3, 3}));
        assertTrue(underTest.isSumPossible(110, new int[]{55, 45, 10, 25, 92}));
    }

    @Test
    void isSumPossible_false() {
        assertFalse(underTest.isSumPossible(5, new int[]{1, 1, 1, 1}));
        assertFalse(underTest.isSumPossible(0, new int[]{1, 1, 1, 1}));
        assertFalse(underTest.isSumPossible(10, new int[]{3, 3, 6}));
        assertFalse(underTest.isSumPossible(5, new int[]{1}));
        assertFalse(underTest.isSumPossible(3, new int[]{}));
        assertFalse(underTest.isSumPossible(-5, new int[]{-3, -1, 6}));
        assertFalse(underTest.isSumPossible(1100, new int[]{1, 2, 3, 4}));
    }

    @Test
    void splitChocolate() {
        assertEquals(underTest.getSweetestPeace(new int[]{2, 5, 1, 3, 4, 1}, 3), 4);
        assertEquals(underTest.getSweetestPeace(new int[]{2, 4, 8, 1, 5, 4, 2, 9, 4, 2, 0, 3}, 4),
                     10);
        assertEquals(underTest.getSweetestPeace(new int[]{2, 4, 8, 1, 5, 4, 2, 9, 4, 2, 0, 3}, 5),
                     7);
        assertEquals(underTest.getSweetestPeace(new int[]{3, 4, 2, 7, 5, 8, 3, 2}, 3), 10);
        assertEquals(underTest.getSweetestPeace(new int[]{0, 0, 0, 0, 9}, 4), 0);
        assertEquals(underTest.getSweetestPeace(new int[]{0, 0, 0, 0, 0}, 0), 0);
        assertEquals(underTest.getSweetestPeace(new int[]{1, 1, 1}, 2), 1);
        assertEquals(underTest.getSweetestPeace(new int[]{5, 4, 4}, 3), 4);
        assertEquals(underTest.getSweetestPeace(new int[]{2, 2, 3, 5}, 3), 3);
        assertEquals(underTest.getSweetestPeace(new int[]{3, 3, 3, 3}, 3), 3);
        assertEquals(underTest.getSweetestPeace(new int[]{1, 1, 1, 1, 1, 1}, 2), 2);
        assertEquals(underTest.getSweetestPeace(new int[]{1, 1, 1, 1, 1}, 2), 2);
        assertEquals(underTest.getSweetestPeace(new int[]{1, 1, 1}, 2), 1);
        assertEquals(underTest.getSweetestPeace(new int[]{1, 1}, 2), 1);
        assertEquals(underTest.getSweetestPeace(new int[]{2, 3}, 2), 2);
        assertEquals(underTest.getSweetestPeace(new int[]{1}, 1), 1);
    }
}
