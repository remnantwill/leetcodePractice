package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/xor-queries-of-a-subarray/
 */
public class XORQueriesOfASubarray1310 {

    /**
     * solution I: Prefix XOR
     *
     * @param arr
     * @param queries
     * @return
     */
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] xors = new int[n + 1];
        for (int i = 0; i < n; i++) {
            xors[i + 1] = xors[i] ^ arr[i];
        }
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; i++) {
            ans[i] = xors[queries[i][0]] ^ xors[queries[i][1] + 1];
        }
        return ans;
    }

    /**
     * ownSolution
     *
     * @param arr
     * @param queries
     * @return
     */
    public int[] xorQueriesOwn(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int start = query[0];
            int end = query[1];
            int xorValue = arr[start];
            for (int j = start + 1; j <= end; j++) {
                xorValue ^= arr[j];
            }
            ans[i] = xorValue;
        }
        return ans;
    }

}
