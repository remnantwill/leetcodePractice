package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/check-if-it-is-a-straight-line/
 */
public class CheckIfItIsAStraightLine1232 {

    public boolean checkStraightLine(int[][] coordinates) {
        int deltaX = coordinates[0][0];
        int deltaY = coordinates[0][1];
        int n = coordinates.length;
        for (int i = 0; i < n; i++) {
            coordinates[i][0] -= deltaX;
            coordinates[i][1] -= deltaY;
        }
        int A = coordinates[1][0];
        int B = -coordinates[1][1];
        for (int i = 2; i < n; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if (A * x + B * y != 0) {
                return false;
            }
        }

        return true;
    }

}
