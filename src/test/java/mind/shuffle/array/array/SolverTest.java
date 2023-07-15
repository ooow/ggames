package mind.shuffle.array.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class SolverTest {
    private final Solver underTest = new Solver();

    @Test
    void shuffle() {
        int[] array = {2, 5, 1, 3, 4, 7};

        assertEquals(Arrays.asList(2, 3, 5, 4, 1, 7), underTest.shuffle(array, 3));
    }

    @Test
    void shuffle2() {
        int[] array = {1, 2, 3, 4, 4, 3, 2, 1};

        assertEquals(Arrays.asList(1, 4, 2, 3, 3, 2, 4, 1), underTest.shuffle(array, 4));
    }

    @Test
    void shuffle3() {
        int[] array = {1, 1, 2, 2};

        assertEquals(Arrays.asList(1, 2, 1, 2), underTest.shuffle(array, 2));
    }
}
