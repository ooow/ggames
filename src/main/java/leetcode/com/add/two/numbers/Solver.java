package leetcode.com.add.two.numbers;

/**
 * A solution for https://leetcode.com/problems/add-two-numbers/
 * <p>
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except
 * the number 0 itself.
 * <p>
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Solver {
    // 2, 4, 3
    // 5, 6, 4
    // 7, 0, 8  < -- result
    //       1 in mind

    ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = recursion(new ListNode(-1), l1, l2, 0);
        return res.next;
    }

    ListNode recursion(ListNode current, ListNode l1, ListNode l2, int inMind) {
        if (l1 != null || l2 != null) {
            ListNode l1Next = null;
            ListNode l2Next = null;
            int sum = inMind;
            if (l1 != null) {
                sum += l1.val;
                l1Next = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2Next = l2.next;
            }
            int currentVal = sum % 10;
            inMind = sum / 10;
            current.next =
                    recursion(new ListNode(currentVal), l1Next, l2Next, inMind);
            return current;
        } else {
            if (inMind != 0) {
                current.next = new ListNode(inMind);
            }
            return current;
        }
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

// First implementation.
//   ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        List<ListNode> res = new ArrayList<>();
//        int inMind = 0;
//
//        while (l1 != null || l2 != null) {
//            int val1 = 0;
//            if (l1 != null) {
//                val1 = l1.val;
//                l1 = l1.next;
//            }
//
//            int val2 = 0;
//            if (l2 != null) {
//                val2 = l2.val;
//                l2 = l2.next;
//            }
//            int sum = val1 + val2 + inMind;
//            int currentVal = sum % 10;
//            inMind = sum / 10;
//            res.add(new ListNode(currentVal));
//        }
//
//        if (inMind != 0) {
//            res.get(res.size() - 1).next = new ListNode(inMind);
//        }
//
//        for (int i = 0; i < res.size() - 1; i++) {
//            res.get(i).next = res.get(i + 1);
//        }
//
//        res.get(0);
//  }
