package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/sort-array-by-parity-ii/
 */
public class SortArrayByParityII922 {

    /**
     * solution I: twice traversal
     * @param A
     * @return
     */
    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int[] ans = new int[n];
        int i = 0;
        for (int x : A) {
            if (x % 2 == 0) {
                ans[i] = x;
                i += 2;
            }
        }
        i = 1;
        for (int x : A) {
            if (x % 2 == 1) {
                ans[i] = x;
                i += 2;
            }
        }
        return ans;
    }

    /**
     * solution II: double pointer
     * @param A
     * @return
     */
    public int[] sortArrayByParityII2(int[] A) {
        int n = A.length;
        int j = 1;
        for (int i = 0; i < n; i += 2) {
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1) {
                    j += 2;
                }
                swap(A, i, j);
            }
        }
        return A;
    }

    private void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
