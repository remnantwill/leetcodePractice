package algorithms.easy;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/find-pivot-index/
 */
public class FindPivotIndex724 {

    public int pivotIndex(int[] nums) {
        int total = Arrays.stream(nums).sum();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (2 * sum + nums[i] == total) {
                return i;
            }
            sum += nums[i];
        }
        return -1;
    }

}
