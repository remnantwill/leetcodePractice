package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/power-of-two/
 */
public class PowerOfTwo231 {

    /**
     * solution I: bit expression
     * @param n
     * @return
     */
    public boolean isPowerOfTwo(int n) {
//        return n > 0 && (n & (n - 1)) == 0;
        return n > 0 && (n & -n) == n;
    }

    /**
     * solution II: Determine whether it is a divisor of the maximum power of 2
     * @param n
     * @return
     */
    public boolean isPowerOfTwoII(int n) {
        final int BIG = 1 << 30;
        return n > 0 && BIG % n == 0;
    }

}
