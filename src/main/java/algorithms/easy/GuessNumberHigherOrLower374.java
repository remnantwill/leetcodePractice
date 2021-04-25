package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/guess-number-higher-or-lower/
 */
public class GuessNumberHigherOrLower374 {

    private int pick;

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int ret = guess(mid);
            if (ret == -1) {
                right = mid - 1;
            } else if (ret == 1) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private int guess(int num) {
        if (pick < num) {
            return -1;
        } else if (pick > num) {
            return 1;
        } else {
            return 0;
        }
    }

}
