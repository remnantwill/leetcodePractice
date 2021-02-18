package algorithms.hard;

/**
 * https://leetcode-cn.com/problems/minimum-number-of-k-consecutive-bit-flips/
 */
public class MinimumNumberOfKConsecutiveBitFlips995 {

    /**
     * solution I: difference array
     * @param A
     * @param K
     * @return
     */
    public int minKBitFlips(int[] A, int K) {
        int n = A.length;
        int[] diff = new int[n + 1];
        int ans = 0;
        int revCnt = 0;
        for (int i = 0; i < n; i++) {
            revCnt ^= diff[i];
            if (A[i] == revCnt) {
                if (i + K > n) {
                    return -1;
                }
                ++ans;
                revCnt ^= 1;
                diff[i + K] ^= 1;
            }
        }
        return ans;
    }

    /**
     * solution II: sliding window
     * @param A
     * @param K
     * @return
     */
    public int minKBitFlipsII(int[] A, int K) {
        int n = A.length;
        int ans = 0;
        int revCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i >= K && A[i - K] > 1) {
                revCnt ^= 1;
                A[i - K] -= 2;
            }
            if (A[i] == revCnt) {
                if (i + K > n) {
                    return -1;
                }
                ++ans;
                revCnt ^= 1;
                A[i] += 2;
            }
        }
        return ans;
    }

}
