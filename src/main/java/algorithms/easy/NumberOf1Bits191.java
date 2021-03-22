package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/number-of-1-bits/
 */
public class NumberOf1Bits191 {

    /**
     * solution I: cycle check binary bits
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ans++;
            }
        }
        return ans;
    }

    /**
     * solution II: bit operation optimization
     * @param n
     * @return
     */
    public int hammingWeightII(int n) {
        int ans = 0;
        while (n != 0) {
            n &= (n - 1);
            ans++;
        }
        return ans;
    }

}
