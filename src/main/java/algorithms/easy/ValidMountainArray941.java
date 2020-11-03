package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/valid-mountain-array/
 */
public class ValidMountainArray941 {

    public boolean validMountainArray(int[] A) {
        int n = A.length;
        int i = 0;
        while (i < n - 1 && A[i] < A[i + 1]) {
            i++;
        }
        if (i == 0 || i == n - 1) {
            return false;
        }
        while (i < n - 1 && A[i] > A[i + 1]) {
            i++;
        }
        return i == n - 1;
    }

    /**
     * own solution
     * @param A
     * @return
     */
    public boolean validMountainArrayOwn(int[] A) {
        int n = A.length;
        int p1 = 0, p2 = 1;
        if (p2 >= n || A[p1] >= A[p2]) {
            return false;
        }
        while (p2 < n && A[p1] < A[p2]) {
            p1++;
            p2++;
        }
        if (p2 < n && A[p1] <= A[p2]) {
            return false;
        }
        while (p2 < n && A[p1] > A[p2]) {
            p1++;
            p2++;
        }
        if (p2 == n && A[p1 - 1] > A[p2 - 1]) {
            return true;
        }
        return false;
    }

}
