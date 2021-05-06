package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/decode-xored-array/
 */
public class DecodeXORedArray1720 {

    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ans = new int[n + 1];
        ans[0] = first;
        for (int i = 1; i < ans.length; i++) {
            ans[i] = encoded[i - 1] ^ ans[i - 1];
        }
        return ans;
    }

}
