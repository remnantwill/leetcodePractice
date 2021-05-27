package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/hamming-distance/
 */
public class HammingDistance461 {

    /**
     * solution I: Built-in bit counting function
     * @param x
     * @param y
     * @return
     */
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    /**
     * solution II: Shift to achieve bit count
     * @param x
     * @param y
     * @return
     */
    public int hammingDistanceII(int x, int y) {
        int s = x ^ y;
        int ans = 0;
        while (s != 0) {
            ans += s & 1;
            s >>= 1;
        }
        return ans;
    }

    /**
     * solution III: Brian Kernighan algorithm
     * @param x
     * @param y
     * @return
     */
    public int hammingDistanceIII(int x, int y) {
        int s = x ^ y;
        int ans = 0;
        while (s != 0) {
            s &= s - 1;
            ans++;
        }
        return ans;
    }

}
