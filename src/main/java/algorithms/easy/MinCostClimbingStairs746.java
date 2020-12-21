package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/min-cost-climbing-stairs/
 */
public class MinCostClimbingStairs746 {

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int prev = 0, curr = 0;
        for (int i = 2; i <= n; i++) {
            int next = Math.min(curr + cost[i - 1], prev + cost[i - 2]);
            prev = curr;
            curr = next;
        }
        return curr;
    }

}
