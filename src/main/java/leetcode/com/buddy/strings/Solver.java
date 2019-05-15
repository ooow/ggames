package leetcode.com.buddy.strings;

import java.util.ArrayList;
import java.util.List;

/**
 * A solution for https://leetcode.com/problems/buddy-strings/
 * <p>
 * Given two strings A and B of lowercase letters, return true if and only
 * if we can swap two letters in A so that the result equals B.
 * <p>
 * Example 1:
 * Input: A = "ab", B = "ba"
 * Output: true
 * <p>
 * Example 2:
 * Input: A = "ab", B = "ab"
 * Output: false
 * <p>
 * Example 3:
 * Input: A = "aa", B = "aa"
 * Output: true
 * <p>
 * Example 4:
 * Input: A = "aaaaaaabc", B = "aaaaaaacb"
 * Output: true
 * <p>
 * Example 5:
 * Input: A = "", B = "aa"
 * Output: false
 * <p>
 * Note:
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A and B consist only of lowercase letters.
 */
class Solver {
    boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        if (A.equals(B)) {
            for (int j = 0; j < A.length(); j++) {
                if (A.indexOf(A.charAt(j), j + 1) != -1) {
                    return true;
                }
            }
            return false;
        }
        List<Integer> dif = new ArrayList<>();
        int i = 0;
        while (dif.size() <= 2 && i < A.length()) {
            if (A.charAt(i) != B.charAt(i)) {
                dif.add(i);
            }
            i++;
        }
        return i == A.length()
                && A.charAt(dif.get(0)) == B.charAt(dif.get(1))
                && A.charAt(dif.get(1)) == B.charAt(dif.get(0));
    }
}
