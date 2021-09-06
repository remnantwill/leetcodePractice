package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/
 */
public class SumOfAllOddLengthSubarrays1588 {

    /**
     * solution I: force
     * @param arr
     * @return
     */
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n; length += 2) {
                int end = start + length - 1;
                for (int i = start; i <= end; i++) {
                    sum += arr[i];
                }
            }
        }
        return sum;
    }

    /**
     * solution: prefix sum
     * @param arr
     * @return
     */
    public int sumOddLengthSubarraysII(int[] arr) {
        int n = arr.length;
        int[] prefixSums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSums[i + 1] = prefixSums[i] + arr[i];
        }
        int sum = 0;
        for (int start = 0; start < n; start++) {
            for (int length = 1; start + length <= n; length += 2) {
                int end = start + length - 1;
                sum += prefixSums[end + 1] - prefixSums[start];
            }
        }
        return sum;
    }

    /**
     * solution III: math
     * @param arr
     * @return
     */
    public int sumOddLengthSubarraysIII(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int leftCount = i;
            int rightCount = n - i - 1;
            int leftOdd = (leftCount + 1) / 2;
            int rightOdd = (rightCount + 1) / 2;
            int leftEven = leftCount / 2 + 1;
            int rightEven = rightCount / 2 + 1;
            sum += arr[i] * (leftOdd * rightOdd + leftEven * rightEven);
        }
        return sum;
    }

}
