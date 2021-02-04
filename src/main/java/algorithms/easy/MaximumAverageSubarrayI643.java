package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/maximum-average-subarray-i/
 */
public class MaximumAverageSubarrayI643 {

    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int maxSum;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        return 1.0 * maxSum / k;
    }

}
