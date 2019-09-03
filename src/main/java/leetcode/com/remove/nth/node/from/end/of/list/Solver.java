package leetcode.com.remove.nth.node.from.end.of.list;

/**
 * A solution for https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * Given a linked list, remove the n-th node from the end of list
 * and return its head.
 * <p>
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * Explanation:
 * After removing the second node from the end, the linked list
 * becomes 1->2->3->5.
 * <p>
 * Note:
 * Given n will always be valid.
 */
public class Solver {
    ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        if (size == n) {
            return head.next;
        }
        return recursive(head, 0, size - n - 1);
    }

    ListNode recursive(ListNode current, int count, int size) {
        if (count < size) {
            recursive(current.next, ++count, size);
            return current;
        } else {
            current.next = current.next.next;
            return current;
        }
    }

    int getSize(ListNode node) {
        int i = 0;
        while (node != null) {
            node = node.next;
            i++;
        }
        return i;
    }

    /**
     * Definition for singly-linked list.
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
