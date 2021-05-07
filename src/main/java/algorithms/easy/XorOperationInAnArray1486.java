package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/xor-operation-in-an-array/
 */
public class XorOperationInAnArray1486 {

    /**
     * solution I: simulate
     *
     * @param n
     * @param start
     * @return
     */
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= start + 2 * i;
        }
        return ans;
    }

    /**
     * solution II: math
     *
     * @param n
     * @param start
     * @return
     */
    public int xorOperationII(int n, int start) {
        int s = start >> 1;
        int e = n & start & 1;
        int ret = sumXor(s - 1) ^ sumXor(s + n - 1);
        return ret << 1 | e;
    }

    private int sumXor(int x) {
        if (x % 4 == 0) {
            return x;
        }
        if (x % 4 == 1) {
            return 1;
        }
        if (x % 4 == 2) {
            return x + 1;
        }
        return 0;
    }

    /**
     * own solution
     *
     * @param n
     * @param start
     * @return
     */
    public int xorOperationOwn(int n, int start) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
        }
        int ans = arr[0];
        for (int i = 1; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

}
