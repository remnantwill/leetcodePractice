package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/spiral-matrix-ii/
 */
public class SpiralMatrixII59 {

    /**
     * solution I: simulation
     * @param n
     * @return
     */
    public int[][] generateMatrix(int n) {
        int maxNum = n * n;
        int currNum = 1;
        int[][] matrix = new int[n][n];
        int[][] directions = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int directionIndex = 0;
        int row = 0;
        int column = 0;
        while (currNum <= maxNum) {
            matrix[row][column] = currNum;
            currNum++;
            int nextRow = row + directions[directionIndex][0];
            int nextColumn = column + directions[directionIndex][1];
            if (nextRow < 0 || nextRow >= n || nextColumn < 0 || nextColumn >= n || matrix[nextRow][nextColumn] != 0) {
                directionIndex = (directionIndex + 1) % 4;
            }
            row = row + directions[directionIndex][0];
            column = column + directions[directionIndex][1];
        }
        return matrix;
    }

    /**
     * solution II: simulation by layer
     * @param n
     * @return
     */
    public int[][] generateMatrixII(int n) {
        int num = 1;
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                matrix[top][column] = num;
                num++;
            }
            for (int row = top + 1; row <= bottom; row++) {
                matrix[row][right] = num;
                num++;
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    matrix[bottom][column] = num;
                    num++;
                }
                for (int row = bottom; row > top; row--) {
                    matrix[row][left] = num;
                    num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }

}
