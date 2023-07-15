package mind.shuffle.array.array;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * Given an array, shuffle it like mixing first half with the second one.
 * <p>
 * Example:
 * Given array = [2, 5, 1, 3, 4, 7]
 * result = [2, 3, 5, 4, 1, 7]
 * <p>
 * One more example:
 * Given array = [1, 1, 2, 2]
 * result = [1, 2, 1, 2]
 * <p>
 * One more example:
 * Given array = [1, 2, 3, 4]
 * result = [1, 3, 2, 4]
 * <p>
 * Note: Assume that array length is always even number.
 */
final class Solver {
    public List<Integer> shuffle(int[] nums, int n) {
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                results.add(nums[i / 2]);
            } else {
                int nextIndex = i / 2 + n;
                if (nextIndex < nums.length) {
                    results.add(nums[nextIndex]);
                }
            }
        }
        return results;
    }
}
