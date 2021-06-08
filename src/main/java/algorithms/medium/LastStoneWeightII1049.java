package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/last-stone-weight-ii/
 */
public class LastStoneWeightII1049 {

    /**
     * solution I: dp
     * @param stones
     * @return
     */
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int n = stones.length;
        int m = sum / 2;
        boolean[][] dp = new boolean[n + 1][m + 1];
        dp[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j < stones[i]) {
                    dp[i + 1][j] = dp[i][j];
                } else {
                    dp[i + 1][j] = dp[i][j] || dp[i][j - stones[i]];
                }
            }
        }
        for (int j = m; ; j--) {
            if (dp[n][j]) {
                return sum - 2 * j;
            }
        }
    }

    /**
     * solution I opt
     * @param stones
     * @return
     */
    public int lastStoneWeightIIOpt(int[] stones) {
        int sum = 0;
        for (int weight : stones) {
            sum += weight;
        }
        int m = sum / 2;
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;
        for (int weight : stones) {
            for (int j = m; j >= weight; j--) {
                dp[j] = dp[j] || dp[j - weight];
            }
        }
        for (int j = m; ; j--) {
            if (dp[j]) {
                return sum - 2 * j;
            }
        }
    }

}
