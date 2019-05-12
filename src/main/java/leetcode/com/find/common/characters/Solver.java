package leetcode.com.find.common.characters;

import java.util.ArrayList;
import java.util.List;

/**
 * A solution for https://leetcode.com/problems/find-common-characters
 * <p>
 * Given an array A of strings made only from lowercase letters, return a
 * list of all characters that show up in all strings within the list
 * (including duplicates).  For example, if a character occurs 3 times in all
 * strings but not 4 times, you need to include that character three times
 * in the final answer.
 * <p>
 * You may return the answer in any order.
 * <p>
 * Example 1:
 * Input: ["bella","label","roller"]
 * Output: ["e","l","l"]
 * <p>
 * Example 2:
 * Input: ["cool","lock","cook"]
 * Output: ["c","o"]
 * <p>
 * Note:
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] is a lowercase letter
 */
class Solver {
    List<String> commonChars(String[] array) {
        String key = findKey(array);
        List<String> res = new ArrayList<>();

        for (Character c : key.toCharArray()) {
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                String str = array[i];
                int indexOfC = str.indexOf(c);
                if (indexOfC != -1) {
                    counter++;
                    array[i] = str.substring(0, indexOfC) +
                            str.substring(indexOfC + 1);
                }
            }
            if (counter == array.length - 1) {
                res.add(String.valueOf(c));
            }
        }

        return res;
    }

    /**
     * Returns a first string with minimal length.
     */
    private static String findKey(String[] array) {
        int minKeyIndex = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < minKeyIndex) {
                minKeyIndex = i;
            }
        }
        String res = array[minKeyIndex];
        array[minKeyIndex] = "A"; // Exclude key string.
        return res;
    }
}
