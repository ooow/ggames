package leetcode.com.two.sum;

import java.util.HashMap;

/**
 * A solution for https://leetcode.com/problems/two-sum/
 * <p>
 * Given an array of integers, return indices of the two numbers such that
 * they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
class Solver {
    int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> store = new HashMap<>();

        int i = 0;
        store.put(target - nums[i], i);
        i++;
        while (!store.containsKey(nums[i])) {
            store.put(target - nums[i], i);
            i++;
        }

        return new int[]{store.get(nums[i]), i};
    }
}
