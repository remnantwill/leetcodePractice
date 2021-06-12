package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/perfect-squares/
 */
public class PerfectSquares279 {

    /**
     * solution I: dp
     * @param n
     * @return
     */
    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }

}
