package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/delete-and-earn/
 */
public class DeleteAndEarn740 {

    /**
     * solution I: dp
     * @param nums
     * @return
     */
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int val : nums) {
            maxVal = Math.max(maxVal, val);
        }
        int[] sums = new int[maxVal + 1];
        for (int val : nums) {
            sums[val] += val;
        }
        return rob(sums);
    }

    private int rob(int[] nums) {
        int size = nums.length;
        int first = nums[0];
        int second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < size; i++) {
            int temp = second;
            second = Math.max(first + nums[i], second);
            first = temp;
        }
        return second;
    }

    /**
     * solution II: sort + dp
     * @param nums
     * @return
     */
    public int deleteAndEarnII(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int size = 1;
        int ans = 0;
        List<Integer> sums = new ArrayList<>();
        sums.add(nums[0]);
        for (int i = 1; i < n; i++) {
            int val = nums[i];
            if (val == nums[i - 1]) {
                sums.set(size - 1, sums.get(size - 1) + val);
            } else if (val == nums[i - 1] + 1) {
                sums.add(val);
                size++;
            } else {
                ans += rob(sums);
                sums.clear();
                sums.add(val);
                size = 1;
            }
        }
        ans += rob(sums);
        return ans;
    }

    private int rob(List<Integer> nums) {
        int size = nums.size();
        int first = nums.get(0);
        int second = Math.max(nums.get(0), nums.get(1));
        for (int i = 2; i < size; i++) {
            int temp = second;
            second = Math.max(first + nums.get(i), second);
            first = temp;
        }
        return second;
    }

}
