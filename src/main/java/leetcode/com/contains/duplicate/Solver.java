package leetcode.com.contains.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * A solution for https://leetcode.com/problems/contains-duplicate
 * <p>
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in
 * the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 * <p>
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 * <p>
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 */
class Solver {
    boolean containsDuplicate(int[] array) {
        Integer[] arr = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        return set.size() != array.length;
    }
}
