package algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/add-to-array-form-of-integer/
 */
public class AddToArrayFormOfInteger989 {

    /**
     * solution I
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> ans = new ArrayList<>();
        int n = A.length;
        for (int i = n - 1; i >= 0; --i) {
            int sum = A[i] + K % 10;
            K /= 10;
            if (sum >= 10) {
                K++;
                sum -= 10;
            }
            ans.add(sum);
        }
        for (; K > 0; K /= 10) {
            ans.add(K);
        }
        Collections.reverse(ans);
        return ans;
    }

    /**
     * solution II
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayFormII(int[] A, int K) {
        List<Integer> ans = new ArrayList<>();
        int n = A.length;
        for (int i = n - 1; i >= 0 || K > 0; --i, K /= 10) {
            if (i >= 0) {
                K += A[i];
            }
            ans.add(K % 10);
        }
        Collections.reverse(ans);
        return ans;
    }

}
