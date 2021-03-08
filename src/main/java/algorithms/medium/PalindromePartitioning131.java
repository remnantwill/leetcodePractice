package algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/palindrome-partitioning/
 */
public class PalindromePartitioning131 {

    boolean[][] f;
    int[][] f2;
    List<List<String>> ret = new ArrayList<>();
    List<String> ans = new ArrayList<>();
    int n;

    /**
     * solution I: backTracking + dp preprocessing
     * @param s
     * @return
     */
    public List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(f[i], true);
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                f[i][j] = s.charAt(i) == s.charAt(j) && f[i + 1][j - 1];
            }
        }
        dfs(s, 0);
        return ret;
    }

    private void dfs(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int j = i; j < n; j++) {
            if (f[i][j]) {
                ans.add(s.substring(i, j + 1));
                dfs(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }

    /**
     * solution II: Backtracking + memory search
     * @param s
     * @return
     */
    public List<List<String>> partitionII(String s) {
        n = s.length();
        f2 = new int[n][n];
        dfs2(s, 0);
        return ret;
    }

    private void dfs2(String s, int i) {
        if (i == n) {
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int j = i; j < n; j++) {
            if (isPalindrome(s, i, j) == 1) {
                ans.add(s.substring(i, j + 1));
                dfs2(s, j + 1);
                ans.remove(ans.size() - 1);
            }
        }
    }

    private int isPalindrome(String s, int i, int j) {
        if (f2[i][j] != 0) {
            return f2[i][j];
        }
        if (i >= j) {
            f2[i][j] = 1;
        } else if (s.charAt(i) == s.charAt(j)) {
            f2[i][j] = isPalindrome(s, i + 1, j - 1);
        } else {
            return -1;
        }
        return f2[i][j];
    }

}
