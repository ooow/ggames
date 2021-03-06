package leetcode.com.maximize.sum.of.array.after.k.negations;

/**
 * A solution for https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 * <p>
 * Given an array A of integers, we must modify the array in the following way:
 * we choose an i and replace A[i] with -A[i], and we repeat this process
 * K times in total.  (We may choose the same index i multiple times.)
 * <p>
 * Return the largest possible sum of the array after modifying it in this way.
 * <p>
 * Example 1:
 * Input: A = [4,2,3], K = 1
 * Output: 5
 * Explanation: Choose indices (1,) and A becomes [4,-2,3].
 * <p>
 * Example 2:
 * Input: A = [3,-1,0,2], K = 3
 * Output: 6
 * Explanation: Choose indices (1, 2, 2) and A becomes [3,1,0,2].
 * <p>
 * Example 3:
 * Input: A = [2,-3,-1,5,-4], K = 2
 * Output: 13
 * Explanation: Choose indices (1, 4) and A becomes [2,3,-1,5,4].
 * <p>
 * Note:
 * 1 <= A.length <= 10000
 * 1 <= K <= 10000
 * -100 <= A[i] <= 100
 */
class Solver {
    int largestSumAfterKNegations(int[] A, int K) {
        while (K != 0) {
            int minIndex = findMinIndex(A);
            int current = A[minIndex];
            if (current == 0) {
                return arraySum(A);
            }
            A[minIndex] = current * -1;
            K--;
        }

        return arraySum(A);
    }

    private int findMinIndex(int[] array) {
        int min = 100; // Maximum possible value;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private int arraySum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}
