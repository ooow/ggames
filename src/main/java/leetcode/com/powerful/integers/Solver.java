package leetcode.com.powerful.integers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * A solution for https://leetcode.com/problems/powerful-integers/
 * <p>
 * Given two positive integers x and y, an integer is powerful if it is
 * equal to x^i + y^j for some integers i >= 0 and j >= 0.
 * <p>
 * Return a list of all powerful integers that have value less than or
 * equal to bound. You may return the answer in any order.  In your answer,
 * each value should occur at most once.
 * <p>
 * Example 1:
 * Input: x = 2, y = 3, bound = 10
 * Output: [2,3,4,5,7,9,10]
 * Explanation:
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 * <p>
 * Example 2:
 * Input: x = 3, y = 5, bound = 15
 * Output: [2,4,6,8,10,14]
 * <p>
 * Note:
 * 1 <= x <= 100
 * 1 <= y <= 100
 * 0 <= bound <= 10^6
 */
class Solver {
    List<Integer> powerfulIntegers(int x, int y, int bound) {
        Set<Integer> xPow = new HashSet<>();
        Set<Integer> yPow = new HashSet<>();
        Set<Integer> res = new TreeSet<>();

        int i = 0;
        while (Math.pow(x, i) <= bound) {
            xPow.add((int) Math.pow(x, i));
            i++;
        }

        i = 0;
        while (Math.pow(y, i) <= bound) {
            yPow.add((int) Math.pow(y, i));
            i++;
        }

        for (int j : xPow) {
            for (int k : yPow) {
                int sum = j + k;
                if (sum <= bound) {
                    res.add(sum);
                }
            }
        }

        return new ArrayList<>(res);
    }
}
