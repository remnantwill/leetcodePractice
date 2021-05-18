package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
 */
public class CountTripletsThatCanFormTwoArraysOfEqualXOR1442 {

    /**
     * solution I: triple loop
     * @param arr
     * @return
     */
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int[] s = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] ^ arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j; k < n; k++) {
                    if (s[i] == s[k + 1]) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    /**
     * solution II: double loop
     * @param arr
     * @return
     */
    public int countTripletsII(int[] arr) {
        int n = arr.length;
        int[] s = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] ^ arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (s[i] == s[k + 1]) {
                    ans += k - i;
                }
            }
        }
        return ans;
    }

    /**
     * solution III: hash map (one loop)
     * @param arr
     * @return
     */
    public int countTripletsIII(int[] arr) {
        int n = arr.length;
        int[] s = new int[n + 1];
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] ^ arr[i];
        }
        int ans = 0;
        Map<Integer, Integer> cntMap = new HashMap<>();
        Map<Integer, Integer> totalMap = new HashMap<>();
        for (int k = 0; k < n; k++) {
            if (cntMap.containsKey(s[k + 1])) {
                ans += cntMap.get(s[k + 1]) * k - totalMap.get(s[k + 1]);
            }
            cntMap.put(s[k], cntMap.getOrDefault(s[k], 0) + 1);
            totalMap.put(s[k], totalMap.getOrDefault(s[k], 0) + k);

        }
        return ans;
    }

    /**
     * solution III opt
     * @param arr
     * @return
     */
    public int countTripletsIIIOpt(int[] arr) {
        int n = arr.length;
        int ans = 0;
        int s = 0;
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> total = new HashMap<>();
        for (int k = 0; k < n; k++) {
            int val = arr[k];
            if (cnt.containsKey(s ^ val)) {
                ans += cnt.get(s ^ val) * k - total.get(s ^ val);
            }
            cnt.put(s, cnt.getOrDefault(s, 0) + 1);
            total.put(s, total.getOrDefault(s, 0) + k);
            s ^= val;
        }
        return ans;
    }

}
