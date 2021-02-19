package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones-iii/
 */
public class MaxConsecutiveOnesIII1004 {

    /**
     * solution I: binary search
     * @param A
     * @param K
     * @return
     */
    public int longestOnes(int[] A, int K) {
        int n = A.length;
        int[] P = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            P[i] = P[i - 1] + (1 - A[i - 1]);
        }
        int ans = 0;
        for (int right = 0; right < n; right++) {
            int left = binarySearch(P, P[right + 1] - K);
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    /**
     * solution II: double pointer (sliding window)
     * @param A
     * @param K
     * @return
     */
    public int longestOnesII(int[] A, int K) {
        int n = A.length;
        int left = 0;
        int lSum = 0;
        int rSum = 0;
        int ans = 0;
        for (int right = 0; right < n; right++) {
            rSum += 1 - A[right];
            while (lSum < rSum - K) {
                lSum += 1 - A[left];
                ++left;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    private int binarySearch(int[] P, int target) {
        int low = 0;
        int high = P.length - 1;
        while (low < high) {
            int mid = (high - low) / 2 + low;
            if (P[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

}
