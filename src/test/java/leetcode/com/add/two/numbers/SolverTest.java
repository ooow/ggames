package leetcode.com.add.two.numbers;

import leetcode.com.TimeTrackedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolverTest extends TimeTrackedTest {
    private final Solver underTest = new Solver();

    @Test
    void test1() {
        // First linked list
        Solver.ListNode firstNode = new Solver.ListNode(2);
        Solver.ListNode secondNode = new Solver.ListNode(4);
        Solver.ListNode lastNode = new Solver.ListNode(3);
        firstNode.next = secondNode;
        secondNode.next = lastNode;


        // Second linked list
        Solver.ListNode nodeFirst = new Solver.ListNode(5);
        Solver.ListNode nodeSecond = new Solver.ListNode(6);
        Solver.ListNode nodeLast = new Solver.ListNode(4);
        nodeFirst.next = nodeSecond;
        nodeSecond.next = nodeLast;

        //Expected result linked list
        Solver.ListNode resFirstNode = new Solver.ListNode(7);
        Solver.ListNode resSecondNode = new Solver.ListNode(0);
        Solver.ListNode resLastNode = new Solver.ListNode(8);
        resFirstNode.next = resSecondNode;
        resSecondNode.next = resLastNode;

        int[] expected = nodeToArray(resFirstNode).stream().mapToInt(i -> i).toArray();
        int[] result = nodeToArray(underTest.addTwoNumbers(firstNode, nodeFirst)).stream().mapToInt(i -> i).toArray();

        assertArrayEquals(expected, result);
    }

    @Test
    void test2() {
        // First linked list
        Solver.ListNode firstNode = new Solver.ListNode(9);
        firstNode.next = new Solver.ListNode(8);

        // Second linked list
        Solver.ListNode nodeFirst = new Solver.ListNode(1);

        //Expected result linked list
        Solver.ListNode resFirstNode = new Solver.ListNode(0);
        resFirstNode.next = new Solver.ListNode(9);

        int[] expected = nodeToArray(resFirstNode).stream().mapToInt(i -> i).toArray();
        int[] result = nodeToArray(underTest.addTwoNumbers(firstNode, nodeFirst)).stream().mapToInt(i -> i).toArray();

        assertArrayEquals(expected, result);
    }

    @Test
    void test3() {
        // First linked list
        Solver.ListNode firstNode = new Solver.ListNode(1);

        // Second linked list
        Solver.ListNode nodeFirst = new Solver.ListNode(9);
        nodeFirst.next = new Solver.ListNode(9);

        //Expected result linked list
        Solver.ListNode resFirstNode = new Solver.ListNode(0);
        Solver.ListNode resSecondNode = new Solver.ListNode(0);
        Solver.ListNode resLastNode = new Solver.ListNode(1);
        resFirstNode.next = resSecondNode;
        resSecondNode.next = resLastNode;

        int[] expected = nodeToArray(resFirstNode).stream().mapToInt(i -> i).toArray();
        int[] result = nodeToArray(underTest.addTwoNumbers(firstNode, nodeFirst)).stream().mapToInt(i -> i).toArray();

        assertArrayEquals(expected, result);
    }

    List<Integer> nodeToArray(Solver.ListNode node) {
        List<Integer> arr = new ArrayList<>();
        while (node != null) {
            arr.add(node.val);
            node = node.next;
        }
        return arr;
    }
}
