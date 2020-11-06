package algorithms.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class SortIntegersByTheNumberOf1Bits1356 {

    /**
     * solution I: violence
     * @param arr
     * @return
     */
    public int[] sortByBits(int[] arr) {
        int[] bit = new int[10001];
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
            bit[i] = get(i);
        }
        list.sort((o1, o2) -> {
            if (bit[o1] != bit[o2]) {
                return bit[o1] - bit[o2];
            } else {
                return o1 - o2;
            }
        });
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    private int get(int i) {
        int res = 0;
        while (i != 0) {
            res += i % 2;
            i /= 2;
        }
        return res;
    }

    /**
     * solution II: recursive pre-processing
     * @param arr
     * @return
     */
    public int[] sortByBitsII(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
        }
        int[] bit = new int[10001];
        for (int i = 1; i <= 10000; ++i) {
            bit[i] = bit[i >> 1] + (i & 1);
        }
        list.sort((o1, o2) -> {
            if (bit[o1] != bit[o2]) {
                return bit[o1] - bit[o2];
            } else {
                return o1 - o2;
            }
        });
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = list.get(i);
        }
        return arr;
    }

}
