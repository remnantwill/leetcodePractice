package algorithms.easy;

import java.util.Map;

/**
 * https://leetcode-cn.com/problems/get-maximum-in-generated-array/
 */
public class GetMaximumInGeneratedArray1646 {

    public int getMaximumGenerated(int n) {
        if (n == 0) {
            return 0;
        }
        int ans = 1;
        int len = n + 1;
        int[] nums = new int[len];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 1; i < len; i++) {
            if (2 * i >= 2 && 2 * i <= n) {
                nums[2 * i] = nums[i];
                ans = Math.max(ans, nums[2 * i]);
            }
            if (2 * i + 1 >= 2 && 2 * i + 1 <= n) {
                nums[2 * i + 1] = nums[i] + nums[i + 1];
                ans = Math.max(ans, nums[2 * i + 1]);
            }
        }
        return ans;
    }

}
