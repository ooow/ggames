package mind.split.tree.by.layers.layers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * Given a tree, split it by layers starting from the bottom.
 * <p>
 * Example:
 * Given tree = 1 -> 2 -> 4
 * ******************* -> 5
 * ************** -> 3,
 * ***** target = [ [4, 5, 3], [2], [1] ]
 * <p>
 */
final class Solver {
    public List<List<Integer>> solve(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        while (root.left != null) {
            ArrayList<Node> leafs = new ArrayList<>();
            findLeafs(root, leafs);

            result.add(leafs.stream().map(l -> l.value).collect(Collectors.toList()));
            removeNode(root, leafs);
        }
        result.add(List.of(root.value));

        return result;
    }

    /** Finds leafs of provided tree. Based on DFS algorithm. */
    private void findLeafs(Node tree, ArrayList<Node> leafs) {
        if (tree == null) {
            return;
        }

        if (tree.left != null) {
            findLeafs(tree.left, leafs);
        }

        if (tree.right != null) {
            findLeafs(tree.right, leafs);
        }

        if (tree.left == null && tree.right == null) {
            leafs.add(tree);
        }
    }

    /** Removes provided nodes from the three. */
    private void removeNode(Node three, ArrayList<Node> toRemove) {
        if (three == null) {
            return;
        }
        if (toRemove.contains(three.left)) {
            three.left = null;
        } else {
            removeNode(three.left, toRemove);
        }
        if (toRemove.contains(three.right)) {
            three.right = null;
        } else {
            removeNode(three.right, toRemove);
        }
    }
}

final class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {this.value = value;}

    Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
