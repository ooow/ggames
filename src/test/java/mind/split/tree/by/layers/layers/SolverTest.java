package mind.split.tree.by.layers.layers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class SolverTest {
    private final Solver underTest = new Solver();

    @Test
    void solve() {
        Node tree = new Node(1, new Node(2, new Node(4), new Node(5)), new Node(3));

        assertEquals(Arrays.asList(Arrays.asList(4, 5, 3), List.of(2), List.of(1)),
                     underTest.solve(tree));
    }

    @Test
    void solve2() {
        Node tree = new Node(1);
        assertEquals(List.of(List.of(1)), underTest.solve(tree));
    }

    @Test
    void solve3() {
        Node tree = new Node(1,
                             new Node(2, new Node(4, new Node(6, new Node(8), null), new Node(7)),
                                      new Node(5)), new Node(3));

        assertEquals(Arrays.asList(Arrays.asList(8, 7, 5, 3), List.of(6), List.of(4), List.of(2),
                                   List.of(1)), underTest.solve(tree));
    }
}
