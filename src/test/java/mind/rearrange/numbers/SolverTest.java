package mind.rearrange.numbers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolverTest {
  private final Solver underTest = new Solver();

  @Test
  void rearrange() {
    int[] array = {1, 2, 3, 1, 2, 1};
    int[] result = {1, 1, 1, 2, 2, 3};

    assertArrayEquals(result, underTest.rearrange(array));
  }

  @Test
  void rearrange2() {
    int[] array = {5, 4, 5, 5, 3, 1, 2, 2, 4};
    int[] result = {5, 5, 5, 4, 4, 3, 1, 2, 2};

    assertArrayEquals(result, underTest.rearrange(array));
  }

  @Test
  void rearrange3() {
    int[] array = {};
    int[] result = {};

    assertArrayEquals(result, underTest.rearrange(array));
  }

  @Test
  void rearrange4() {
    int[] array = {0, 1};
    int[] result = {0, 1};

    assertArrayEquals(result, underTest.rearrange(array));
  }
}
