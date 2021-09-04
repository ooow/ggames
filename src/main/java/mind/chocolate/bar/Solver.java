package mind.chocolate.bar;

import java.util.Arrays;

/**
 * Let's say, you have a chocolate bar that has a specified number for each cell. The number
 * represents a sweetness of the cell in a range from 0 to 9. You faced friends and want to share
 * the chocolate, but you do not want to offend anyone, so you need to follow the next rule: All
 * your friends must have a sum of the sweetness of their cells greater than yours. Find a maximum
 * sweetness you can have without breaking the rule.
 *
 * <p>
 * The chocolate bar is represented in an array of integers {@param int[] chocolate} where every
 * item is a sweetness of the cell. Amount of friends is represented by an integer {@param int
 * friends}.
 *
 * <p>
 * Examples:
 * <ul>
 *      <li> Input: chocolate = int[]{1, 2, 3}, friends = 3
 *      <li> Output: 1
 * </ul>
 * <ul>
 *      <li> Input: chocolate = int[]{2, 2, 3, 5}, friends = 3
 *      <li> Output: Output: 3 // First friend gets in sum sweetness of 5, second 4, you 3.
 * </ul>
 * <ul>
 *      <li> Input: chocolate = int[]{2, 4, 8, 1, 5, 4, 2, 9, 4, 2, 0, 3}, 4), friends = 4
 *      <li> Output: Output: 10
 * </ul>
 *
 * <p>
 * Return -1 when it's not possible to split the chocolate according to the rules.
 */
class Solver {
    // O(N + M^2)
    int getSweetestPeace(int[] chocolate, int friends) {
        if (chocolate.length < friends) {
            return -1; // Chocolate contains not enough cells to share with all friends.
        }
        int sum = Arrays.stream(chocolate).sum();
        if (sum == 0) {
            return 0; // Sum of all cell's sweetness is zero.
        }
        int max = sum / friends;
        if (sum % 2 == 0) {
            max--;
        }
        for (int i = max; i >= 0; i--) {
            if (isSumPossible(i, chocolate)) {
                return i;
            }
        }
        return -1; // Chocolate could not be split according to the rules.
    }

    boolean isSumPossible(int k, int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == k) {
                return true;
            }
            if (array[i] < k && isSumPossible(k - array[i], Arrays.copyOfRange(array, 0, i))) {
                return true;
            }
        }
        return false;
    }
}
