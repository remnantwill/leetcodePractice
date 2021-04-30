package algorithms.hard;

/**
 * https://leetcode-cn.com/problems/find-in-mountain-array/
 */
public class FindInMountainArray1095 {

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = binarySearchPeak(mountainArr);
        if (target == mountainArr.get(peak)) {
            return peak;
        }
        int ans = binarySearchAns(mountainArr, 0, peak, target, true);
        if (ans != -1) {
            return ans;
        }
        return binarySearchAns(mountainArr, peak + 1, n - 1, target, false);
    }

    private int binarySearchAns(MountainArray mountainArr, int left, int right, int target, boolean flag) {
        if (!flag) {
            target *= -1;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = mountainArr.get(mid) * (flag ? 1 : -1);
            if (midVal == target) {
                return mid;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private int binarySearchPeak(MountainArray mountainArr) {
        int left = 0;
        int right = mountainArr.length() - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

}

interface MountainArray {
    int get(int index);

    int length();
}
