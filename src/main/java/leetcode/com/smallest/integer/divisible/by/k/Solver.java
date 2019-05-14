package leetcode.com.smallest.integer.divisible.by.k;

/**
 * A solution for https://leetcode.com/problems/smallest-integer-divisible-by-k/
 * <p>
 * Given a positive integer K, you need find the smallest positive integer N
 * such that N is divisible by K, and N only contains the digit 1.
 * <p>
 * Return the length of N.  If there is no such N, return -1.
 * <p>
 * Example 1:
 * Input: 1
 * Output: 1
 * Explanation: The smallest answer is N = 1, which has length 1.
 * <p>
 * Example 2:
 * Input: 2
 * Output: -1
 * Explanation: There is no such positive integer N divisible by 2.
 * <p>
 * Example 3:
 * Input: 3
 * Output: 3
 * Explanation: The smallest answer is N = 111, which has length 3.
 * <p>
 * Note:
 * 1 <= K <= 10^5
 */
class Solver {
    int smallestRepunitDivByK(int K) {
        if ((K % 2 == 0) || (K % 5 == 0)) {
            return -1;
        }
        int next;
        int i = 1;
        int current = 1;

        while (current < K) {
            current = Integer.parseInt(current + "1");
            i++;
        }
        while (current % K != 0) {
            next = current % K;
            current = Integer.parseInt(next + "1");
            i++;
        }
        return i;
    }
}
