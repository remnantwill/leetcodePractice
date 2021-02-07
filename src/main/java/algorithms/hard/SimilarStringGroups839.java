package algorithms.hard;

/**
 * https://leetcode-cn.com/problems/similar-string-groups/
 */
public class SimilarStringGroups839 {
    int[] f;
    public int numSimilarGroups(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = i;
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int fi = find(i);
                int fj = find(j);
                if (fi == fj) {
                    continue;
                }
                if (check(strs[i], strs[j], m)) {
                    f[fi] = fj;
                }
            }
        }
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (f[i] == i) {
                ret++;
            }
        }
        return ret;
    }

    private boolean check(String str1, String str2, int m) {
        int count = 0;
        for (int i = 0; i < m; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                count++;
            }
            if (count > 2) {
                return false;
            }
        }
        return true;
    }

    private int find(int i) {
        return f[i] == i ? i : (f[i] = find(f[i]));
    }

}
