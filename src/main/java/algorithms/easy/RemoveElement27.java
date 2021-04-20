package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/remove-element/
 */
public class RemoveElement27 {

    /**
     * solution I: double pointer
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

    /**
     * solution II: optimized double pointer
     * @param nums
     * @param val
     * @return
     */
    public int removeElementII(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;
    }

}
