package algorithms;

/**
 * https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 */

public class BitwiseAndOfNumbersRange201 {

    // shift
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }

    // Brian Kernighan Algorithm
    public int brianKernighanAlgorithm (int m, int n) {
        while (m < n) {
            n = n & (n - 1);
        }
        return n;
    }
}