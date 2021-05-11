package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/decode-xored-permutation/
 */
public class DecodeXORedPermutation1734 {

    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total ^= i;
        }
        int odd = 0;
        for (int i = 1; i < n - 1; i += 2) {
            odd ^= encoded[i];
        }
        int[] perms = new int[n];
        perms[0] = total ^ odd;
        for (int i = 0; i < n - 1; i++) {
            perms[i + 1] = perms[i] ^ encoded[i];
        }
        return perms;
    }

}
