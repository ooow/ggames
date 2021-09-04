package leetcode.com.jump.game.ii;

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
        int jumps = 0;
        int current = 0;
        int next = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            next = Math.max(next, i + nums[i]);
            if (i == current) {
                jumps++;
                current = next;
            }
        }
        return jumps;
    }
}
