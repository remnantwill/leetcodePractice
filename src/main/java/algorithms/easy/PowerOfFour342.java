package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/power-of-four/
 */
public class PowerOfFour342 {

    /**
     * solution I: Position of 1 in binary representation
     *
     * @param n
     * @return
     */
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && ((n & 0xaaaaaaaa) == 0);
    }

    /**
     * solution II: Modulus properties
     *
     * @param n
     * @return
     */
    public boolean isPowerOfFourII(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n % 3) == 1;
    }

}
