package leetcode.com.univalued.binary.tree;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        new TreeNode(1, null, null),
                        new TreeNode(1, null, null)),
                new TreeNode(1,
                        new TreeNode(1, null, null),
                        null));

        assertTrue(underTest.isUnivalTree(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(2,
                new TreeNode(2,
                        new TreeNode(5, null, null),
                        new TreeNode(2, null, null)),
                new TreeNode(2, null, null));

        assertFalse(underTest.isUnivalTree(root));
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(4,
                new TreeNode(4, null, null),
                null);

        assertTrue(underTest.isUnivalTree(root));
    }
}
