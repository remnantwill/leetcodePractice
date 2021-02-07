package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/non-decreasing-array/
 */
public class NonDecreasingArray665 {

    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            int x = nums[i];
            int y = nums[i + 1];
            if (x > y) {
                count++;
                if (count > 1) {
                    return false;
                }
                if (i > 0 && y < nums[i - 1]) {
                    nums[i + 1] = x;
                }
            }
        }
        return true;
    }

}
