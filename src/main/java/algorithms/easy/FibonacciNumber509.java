package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/fibonacci-number/
 */
public class FibonacciNumber509 {

    /**
     * solution I: dp
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

    /**
     * solution II: Matrix fast power
     *
     * @param n
     * @return
     */
    public int fibII(int n) {
        if (n < 2) {
            return n;
        }
        int[][] m = new int[][]{ { 1, 1 }, { 1, 0 } };
        int[][] ret = pow(m, n - 1);
        return ret[0][0];
    }

    private int[][] pow(int[][] a, int n) {
        int[][] ret = new int[][] { { 1, 0 }, { 0, 1 } };
        while (n > 0) {
            if ((n & 1) == 1) {
                ret = multiply(a, ret);
            }
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    private int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }

    /**
     * solution III: General term formula
     * @param n
     * @return
     */
    public int fibIII(int n) {
        if (n < 2) {
            return n;
        }
        double sqrt5 = Math.sqrt(5);
        double fibN = Math.pow(((1 + sqrt5) / 2), n) - Math.pow(((1 - sqrt5) / 2), 2);
        return (int) Math.round(fibN / sqrt5);
    }

}
