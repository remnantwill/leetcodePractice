package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/longest-turbulent-subarray/
 */
public class LongestTurbulentSubarray978 {

    /**
     * solution I : dp
     * @param arr
     * @return
     */
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return n;
        }
        int increased = 1;
        int decreased = 1;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                increased = decreased + 1;
                decreased = 1;
            } else if (arr[i] < arr[i - 1]) {
                decreased = increased + 1;
                increased = 1;
            } else {
                decreased = 1;
                increased = 1;
            }
            ans = Math.max(ans, Math.max(decreased, increased));
        }
        return ans;
    }

    /**
     * solution II: double pointer
     * @param arr
     * @return
     */
    public int maxTurbulenceSizeII(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return n;
        }
        int left = 0;
        int right = 1;
        boolean pre = false;
        int ans = 1;
        while (right < n) {
            boolean current = arr[right] > arr[right - 1];
            if (right == 1 || current == pre) {
                left = right - 1;
            }
            if (arr[right] == arr[right - 1]) {
                left = right;
            }
            right++;
            ans = Math.max(ans, right - left);
            pre = current;
        }
        return ans;
    }

}
