package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/rotate-image/
 */
public class RotateImage48 {

    /**
     * solution I: using assistant matrix
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = newMatrix[i][j];
            }
        }
    }

    /**
     * solution II: rotate in original place
     * @param matrix
     */
    public void rotateII(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n / 2); i++) {
            for (int j = 0; j < ((n + 1) / 2); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }

    /**
     * solution III: Use flip instead of rotate
     * @param matrix
     */
    public void rotateIII(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < (n / 2); i++) {
            for (int j = 0; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = tmp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

}
