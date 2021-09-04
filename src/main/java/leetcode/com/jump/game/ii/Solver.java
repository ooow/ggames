package leetcode.com.jump.game.ii;

import java.util.Arrays;

/**
 * A solution for https://leetcode.com/problems/jump-game-ii/
 * <p>
 * Given an array of non-negative integers nums, you are initially positioned at the first index of
 * the array.
 * <p>
 * Each element in the array represents your maximum jump length at that position.
 * <p>
 * Your goal is to reach the last index in the minimum number of jumps.
 * <p>
 * You can assume that you can always reach the last index.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,1,1,4] Output: 2 Explanation: The minimum number of jumps to reach the last
 * index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index. Example 2:
 * <p>
 * Input: nums = [2,3,0,1,4] Output: 2
 */
public class Solver {
    int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        nums[nums.length - 1] = 0;
        int sum = nums[0];
        if (sum >= nums.length - 1) {
            return 1;
        }
        if (sum > 1 && nums[1] > 1 || nums[nums.length - 2] > 1) {
            sum--;
        }
        Arrays.sort(nums);
        int i = nums[nums.length - 1] == sum ? nums.length - 2 : nums.length - 1;
        int j = 1;
        while (sum < nums.length - 1) {
            sum += nums[i];
            j++;
            i--;
        }
        return j;
    }
}

//    int jump(int[] nums) {
//        if (nums.length <= 1) {
//            return 0;
//        }
//        int sum = nums[0];
//        int i = 1;
//        int j = 1;
//        while (sum < nums.length - 1) {
//            sum += nums[i];
//            if (nums[i] != 0) {
//                j++;
//                if (nums[i - 1] > 1 && nums[i] > 1) {
//                    sum--;
//                }
//            }
//            i++;
//        }
//        return j;
//    }
