package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/sum-of-square-numbers/
 */
public class SumSquareNumbers633 {

    /**
     * solution I: using sqrt
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a < c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }

    /**
     * solution II: double pointer
     *
     * @param c
     * @return
     */
    public boolean judgeSquareSumII(int c) {
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }

    /**
     * solution III: math
     * @param c
     * @return
     */
    public boolean judgeSquareSumIII(int c) {
        for (int base = 2; base * base <= c; base++) {
            if (c % base != 0) {
                continue;
            }
            int exp = 0;
            while (c % base == 0) {
                c /= base;
                exp++;
            }
            if (base % 4 == 3 && exp % 2 != 0) {
                return false;
            }
        }
        return c % 4 != 3;
    }

}
