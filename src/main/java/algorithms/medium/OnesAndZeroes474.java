package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/ones-and-zeroes/
 */
public class OnesAndZeroes474 {

    /**
     * solution I: dp
     * @param strs
     * @param m
     * @param n
     * @return
     */
    public int findMaxForm(String[] strs, int m, int n) {
        int l = strs.length;
        int[][][] dp = new int[l + 1][m + 1][n + 1];
        for (int i = 1; i <= l; i++) {
            int[] zerosOnes = getZerosOnes(strs[i - 1]);
            int zeros = zerosOnes[0];
            int ones = zerosOnes[1];
            for (int j = 0; j <= m; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[i][j][k] = dp[i - 1][j][k];
                    if (j >= zeros && k >= ones) {
                        dp[i][j][k] = Math.max(dp[i][j][k], dp[i - 1][j - zeros][k - ones] + 1);
                    }
                }
            }
        }
        return dp[l][m][n];
    }

    private int[] getZerosOnes(String str) {
        int[] zerosOnes = new int[2];
        for (int i = 0; i < str.length(); i++) {
            zerosOnes[str.charAt(i) - '0']++;
        }
        return zerosOnes;
    }

    /**
     * solution I opt
     * @param strs
     * @param m
     * @param n
     * @return
     */
    public int findMaxFormOpt(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        int l = strs.length;
        for (int i = 0; i < l; i++) {
            int[] zerosOnes = getZerosOnes(strs[i]);
            int zeros = zerosOnes[0];
            int ones = zerosOnes[1];
            for (int j = m; j >= zeros; j--) {
                for (int k = n; k >= ones; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeros][k - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }

}
