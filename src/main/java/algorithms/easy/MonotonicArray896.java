package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/monotonic-array/
 */
public class MonotonicArray896 {

    /**
     * solution I: two times traversal
     * @param A
     * @return
     */
    public boolean isMonotonic(int[] A) {
        return isSorted(A, true) || isSorted(A, false);
    }

    private boolean isSorted(int[] A, boolean increasing) {
        int n = A.length;
        if (increasing) {
            for (int i = 0; i < (n - 1); i++) {
                if (A[i] > A[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < (n - 1); i++) {
                if (A[i] < A[i + 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * solution II: one times traversal
     * @param A
     * @return
     */
    public boolean isMonotonicII(int[] A) {
        boolean inc = true;
        boolean dec = true;
        int n = A.length;
        for (int i = 0; i < (n - 1); i++) {
            if (A[i] > A[i + 1]) {
                inc = false;
            }
            if (A[i] < A[i + 1]) {
                dec = false;
            }
        }
        return inc || dec;
    }

}
