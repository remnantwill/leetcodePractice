package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1dArray1480 {

    /**
     * official solution
     * @param nums
     * @return
     */
    public int[] runningSum(int[] nums) {
        int length = nums.length;
        for (int i = 1; i < length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    /**
     * own solution
     * @param nums
     * @return
     */
    public int[] runningSumOwn(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        ans[0] = nums[0];
        for (int i = 1; i < length; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }

}
