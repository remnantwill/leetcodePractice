package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/longest-continuous-increasing-subsequence/
 */
public class LongestContinuousIncreasingSubsequence674 {

    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] <= nums[i - 1]) {
                start = i;
            }
            ans = Math.max(ans, i - start + 1);
        }
        return ans;
    }

}
