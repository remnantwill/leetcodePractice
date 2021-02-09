package algorithms.hard;

/**
 * https://leetcode-cn.com/problems/subarrays-with-k-different-integers/
 */
public class SubarraysWithKDifferentIntegers992 {

    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostKDistinct(A, K) - atMostKDistinct(A, K - 1);
    }

    private int atMostKDistinct(int[] A, int K) {
        int len = A.length;
        int[] freq = new int[len + 1];
        int right = 0;
        int left = 0;
        int count = 0;
        int ans = 0;
        while (right < len) {
            if (freq[A[right]] == 0) {
                count++;
            }
            freq[A[right]]++;
            right++;
            while (count > K) {
                freq[A[left]]--;
                if (freq[A[left]] == 0) {
                    count--;
                }
                left++;
            }
            ans += right - left;
        }
        return ans;
    }

}
