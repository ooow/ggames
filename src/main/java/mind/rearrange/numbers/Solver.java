package mind.rearrange.numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an unsorted integer array containing many duplicate elements, rearrange it such that the
 * same element appears together and the relative order of the first occurrence of each element
 * remains unchanged.
 * <p>
 * Example
 * Input: [1, 2, 3, 1, 2, 1]
 * Output: [1, 1, 1, 2, 2, 3]
 * <p>
 * One more example:
 * Input: [5, 4, 5, 5, 3, 1, 2, 2, 4]
 * Output: [5, 5, 5, 4, 4, 3, 1, 2, 2]
 */
public class Solver {
  public int[] rearrange(int[] array) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int current : array) {
      if (map.containsKey(current)) {
        map.put(current, map.get(current) + 1);
      } else {
        map.put(current, 1);
      }
    }

    ArrayList<Integer> res = new ArrayList<>();

    for (int current : array) {
      if (map.containsKey(current)) {
        for (int i = 0; i < map.get(current); i++) {
          res.add(current);
        }
        map.remove(current);
      }
    }

    return res.stream().mapToInt(Integer::intValue).toArray();
  }
}
