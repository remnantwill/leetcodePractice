package algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/relative-sort-array/
 */
public class RelativeSortArray1122 {

    /**
     * solution I: custom sort
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : arr1) {
            list.add(num);
        }
        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        list.sort((x, y) -> {
            if (map.containsKey(x) || map.containsKey(y)) {
                return map.getOrDefault(x, 1001) - map.getOrDefault(y, 1001);
            }
            return x - y;
        });
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = list.get(i);
        }
        return arr1;
    }

    /**
     * solution II: counting sort
     * @param arr1
     * @param arr2
     * @return
     */
    public int[] relativeSortArrayII(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int i : arr1) {
            upper = Math.max(upper, i);
        }
        int[] frequency = new int[upper + 1];
        for (int x : arr1) {
            ++frequency[x];
        }
        int index = 0;
        int[] ans = new int[arr1.length];
        for (int x : arr2) {
            for (int i = 0; i < frequency[x]; i++) {
                ans[index++] = x;
            }
            frequency[x] = 0;
        }
        for (int x = 0; x <= upper; x++) {
            for (int i = 0; i < frequency[x]; i++) {
                ans[index++] = x;
            }
        }
        return ans;
    }

}