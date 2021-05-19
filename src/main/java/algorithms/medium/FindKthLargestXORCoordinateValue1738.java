package algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-kth-largest-xor-coordinate-value/
 */
public class FindKthLargestXORCoordinateValue1738 {

    /**
     * solution I: two-dimensional prefix-sum + sort
     *
     * @param matrix
     * @param k
     * @return
     */
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pre[i][j] = pre[i][j - 1] ^ pre[i - 1][j] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                list.add(pre[i][j]);
            }
        }
        list.sort((o1, o2) -> o2 - o1);
        return list.get(k - 1);
    }

    /**
     * solution II: two-dimensional prefix sum + quick select algorithm
     *
     * @param matrix
     * @param k
     * @return
     */
    public int kthLargestValueII(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pre = new int[m + 1][n + 1];
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                pre[i][j] = pre[i][j - 1] ^ pre[i - 1][j] ^ pre[i - 1][j - 1] ^ matrix[i - 1][j - 1];
                list.add(pre[i][j]);
            }
        }
        nthElement(list, 0, k - 1, list.size() - 1);
        return list.get(k - 1);
    }

    private void nthElement(List<Integer> list, int left, int kth, int right) {
        if (left == right) {
            return;
        }
        int pivot = (int) (left + Math.random() * (right - left + 1));
        swap(list, pivot, right);
        int sepl = left - 1;
        int sepr = left - 1;
        for (int i = left; i <= right; i++) {
            if (list.get(i) > list.get(right)) {
                swap(list, ++sepr, i);
                swap(list, ++sepl, sepr);
            } else if (list.get(i) == list.get(right)) {
                swap(list, ++sepr, i);
            }
        }
        if (sepl < left + kth && left + kth <= sepr) {
            return;
        } else if (left + kth <= sepl) {
            nthElement(list, left, kth, sepl);
        } else {
            nthElement(list, sepr + 1, kth - (sepr - left + 1), right);
        }
    }

    private void swap(List<Integer> list, int index1, int index2) {
        Integer tmp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, tmp);
    }

}
