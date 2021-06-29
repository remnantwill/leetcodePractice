package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 */
public class JianZhiOffer38 {

    List<String> list;
    boolean[] vis;

    /**
     * solution I: backtrack
     * @param s
     * @return
     */
    public String[] permutation(String s) {
        list = new ArrayList<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        vis = new boolean[n];
        Arrays.sort(arr);
        StringBuffer perm = new StringBuffer();
        backtrack(arr, 0, n, perm);
        int size = list.size();
        String[] ans = new String[size];
        for (int i = 0; i < size; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    private void backtrack(char[] arr, int i, int n, StringBuffer perm) {
        if (i == n) {
            list.add(perm.toString());
            return;
        }
        for (int j = 0; j < n; j++) {
            if (vis[j] || (j > 0 && !vis[j - 1] && arr[j - 1] == arr[j])) {
                continue;
            }
            perm.append(arr[j]);
            vis[j] = true;
            backtrack(arr, i + 1, n, perm);
            perm.deleteCharAt(perm.length() - 1);
            vis[j] = false;
        }
    }

}
