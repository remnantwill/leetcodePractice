package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/binary-search/
 */
public class BinarySearch704 {

    /**
     * solution I: binary search
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * solution II: recursive
     * @param nums
     * @param target
     * @return
     */
    public int searchII(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        return recursion(left, right, nums, target);
    }

    private int recursion(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int mid = left + (right - left + 1) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                return recursion(left, right, nums, target);
            } else {
                right = mid - 1;
                return recursion(left, right, nums, target);
            }
        }
        return -1;
    }

}
