package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/counting-bits/
 */
public class CountingBits338 {

    /**
     * solution I: direct calculation
     * @param num
     * @return
     */
    public int[] countBits(int num) {
        int[] bits = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            bits[i] = countOnes(i);
        }
        return bits;
    }

    private int countOnes(int x) {
        int ones = 0;
        while (x > 0) {
            x &= (x - 1);
            ones++;
        }
        return ones;
    }

    /**
     * solution II: dp - the most significant bit
     * @param num
     * @return
     */
    public int[] countBitsII(int num) {
        int[] bits = new int[num + 1];
        int highBit = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }

    /**
     * solution III: dp - the least significant bit
     * @param num
     * @return
     */
    public int[] countBitsIII(int num) {
        int[] bits = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            bits[i] = bits[i >> 1] + (i & 1);
        }
        return bits;
    }

    /**
     * solution IV: dp - the least set bit
     * @param num
     * @return
     */
    public int[] countBitsIV(int num) {
        int[] bits = new int[num + 1];
        for (int i = 1; i <= num; i++) {
            bits[i] = bits[i & (i - 1)] + 1;
        }
        return bits;
    }

}
