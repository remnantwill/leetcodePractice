package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/longest-mountain-in-array/
 */
public class LongestMountainInArray845 {

    /**
     * solution I: enumerate peak (dynamic programming)
     * @param A
     * @return
     */
    public int longestMountain(int[] A) {
        int n = A.length;
        if (n == 0) {
            return 0;
        }
        int[] left = new int[n];
        for (int i = 1; i < n - 1; ++i) {
            left[i] = A[i - 1] < A[i] ? left[i - 1] + 1 : 0;
        }
        int[] right = new int[n];
        for (int i = n - 2; i >= 0; --i) {
            right[i] = A[i + 1] < A[i] ? right[i + 1] + 1 : 0;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] > 0 && right[i] > 0) {
                ans = Math.max(ans, left[i] + right[i] + 1);
            }
        }
        return ans;
    }

    /**
     * solution II: enumerate foot (double pointer)
     * @param A
     * @return
     */
    public int longestMountainII(int[] A) {
        int n = A.length;
        if (n == 0) {
            return 0;
        }
        int ans = 0;
        int left = 0;
        while (left + 2 < n) {
            int right = left + 1;
            if (A[left] < A[left + 1]) {
                while (right + 1 < n && A[right] < A[right + 1]) {
                    ++right;
                }
                if (right < n - 1 && A[right] > A[right + 1]) {
                    while (right + 1 < n && A[right] > A[right + 1]) {
                        ++right;
                    }
                    ans = Math.max(ans, right - left + 1);
                } else {
                    ++right;
                }
            }
            left = right;
        }
        return ans;
    }


    /**
     * own solution (failed and discarded)
     */
    //    public int longestMountain(int[] A) {
//        int p1, p2, p3 = 0, p4 = 0, count = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (i != 0 && i + 1 < A.length && (A[i - 1] < A[i] && A[i+1] < A[i])) {
//                int j = 1;
//                p1 = i;
//                p2 = i;
//                while (i - j >= 0 && i + j <= A.length
//                        && (A[i - j] < A[i] && A[i + j] < A[i])
//                        && (A[i - j + 1] > A[i - j] && A[i + j - 1] > A[i + j])) {
//                    p1--;
//                    p2++;
//                    j++;
//                }
//                if ((p2 - p1) > (p4 - p3)) {
//                    p3 = p1;
//                    p4 = p2;
//                }
//            }
//        }
//        if (p3 != p4) {
//            for (int i = p3; i <= p4; i++) {
//                count++;
//            }
//        }
//        return count;
//    }

}
