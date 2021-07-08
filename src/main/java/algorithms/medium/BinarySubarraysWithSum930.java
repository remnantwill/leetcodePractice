package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/binary-subarrays-with-sum/
 */
public class BinarySubarraysWithSum930 {

    /**
     * solution I: hash table
     * @param nums
     * @param goal
     * @return
     */
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ret = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        int sum = 0;
        for (int num : nums) {
            cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            sum += num;
            ret += cnt.getOrDefault(sum - goal, 0);
        }
        return ret;
    }

    /**
     * solution II: sliding window
     * @param nums
     * @param goal
     * @return
     */
    public int numSubarraysWithSumII(int[] nums, int goal) {
        int n = nums.length;
        int sum1 = 0, sum2 = 0;
        int left1 = 0, left2 = 0;
        int right = 0, ret = 0;
        while (right < n) {
            sum1 += nums[right];
            while (left1 <= right && sum1 > goal) {
                sum1 -= nums[left1];
                left1++;
            }
            sum2 += nums[right];
            while (left2 <= right && sum2 >= goal) {
                sum2 -= nums[left2];
                left2++;
            }
            ret += left2 - left1;
            right++;
        }
        return ret;
    }

}
