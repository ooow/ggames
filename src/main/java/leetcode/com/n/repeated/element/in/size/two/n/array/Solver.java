package leetcode.com.n.repeated.element.in.size.two.n.array;

import java.util.HashSet;
import java.util.Set;

/**
 * A solution for https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * <p>
 * In a array A of size 2N, there are N+1 unique elements, and exactly one
 * of these elements is repeated N times.
 * <p>
 * Return the element repeated N times.
 * <p>
 * <p>
 * Example 1:
 * Input: [1,2,3,3]
 * Output: 3
 * <p>
 * Example 2:
 * Input: [2,1,2,5,3,2]
 * Output: 2
 * <p>
 * Example 3:
 * Input: [5,1,5,2,5,3,5,4]
 * Output: 5
 * <p>
 * Note:
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length is even
 */
class Solver {
    int repeatedNTimes(int[] A) {
        Set<Integer> store = new HashSet<>();
        int i = 0;
        while (!store.contains(A[i])) {
            store.add(A[i]);
            i++;
        }

        return A[i];
    }
}
