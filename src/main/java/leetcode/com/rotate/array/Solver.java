package leetcode.com.rotate.array;

/**
 * A solution for https://leetcode.com/problems/rotate-array/
 * Given an array, rotate the array to the right by k steps,
 * where k is non-negative.
 * <p>
 * Example 1:
 * Input: [1,2,3,4,5,6,7] and k = 3
 * Output: [5,6,7,1,2,3,4]
 * <p>
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * <p>
 * Example 2:
 * Input: [-1,-100,3,99] and k = 2
 * Output: [3,99,-1,-100]
 * <p>
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 */
public class Solver {
    int[] rotate(int[] nums, int k) {
        if (k > nums.length) {
            return nums;
        }
        int[] res = new int[nums.length];
        int i = nums.length - k;
        int j = 0;

        while (i < nums.length) {
            res[j] = nums[i];
            i++;
            j++;
        }
        for (int l = 0; l < nums.length - k; l++) {
            res[j] = nums[l];
            j++;
        }
        return res;
    }
}
