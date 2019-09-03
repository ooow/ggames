package leetcode.com.remove.nth.node.from.end.of.list;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        Solver.ListNode node1 = new Solver.ListNode(1);
        Solver.ListNode node2 = new Solver.ListNode(2);
        Solver.ListNode node3 = new Solver.ListNode(3);
        Solver.ListNode node4 = new Solver.ListNode(4);
        Solver.ListNode node5 = new Solver.ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        String expected = "1235";
        String result = nodeToString(underTest.removeNthFromEnd(node1, 2));

        assertEquals(expected, result);
    }

    @Test
    void test2() {
        Solver.ListNode node1 = new Solver.ListNode(1);
        node1.next = new Solver.ListNode(2);

        String expected = "1";
        String result = nodeToString(underTest.removeNthFromEnd(node1, 1));

        assertEquals(expected, result);
    }

    @Test
    void test3() {
        Solver.ListNode node1 = new Solver.ListNode(1);
        node1.next = new Solver.ListNode(2);

        String expected = "2";
        String result = nodeToString(underTest.removeNthFromEnd(node1, 2));

        assertEquals(expected, result);
    }

    String nodeToString(Solver.ListNode node) {
        StringBuilder str = new StringBuilder();
        while (node != null) {
            str.append(node.val);
            node = node.next;
        }
        return str.toString();
    }
}
