package algorithms.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/
 */
public class NumberOfEquivalentDominoPairs1128 {

    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Pair, Integer> map = new HashMap<>();
        int count = 0;
        for (int[] domino : dominoes) {
            Pair key = new Pair(domino[0], domino[1]);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Integer value : map.values()) {
            count += (value * (value - 1)) / 2;
        }
        return count;

    }

    /**
     * solution II: combine
     * @param dominoes
     * @return
     */
    public int numEquivDominoPairsII(int[][] dominoes) {
        int[] nums = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1]
                    : domino[1] * 10 + domino[0];
            ret += nums[val];
            nums[val]++;
        }
        return ret;
    }

    private class Pair {
        private int key;
        private int value;
        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Pair pair = (Pair) o;
            return (key == pair.key && value == pair.value)
                    || (key == pair.value && value == pair.key);
        }

        @Override
        public int hashCode() {
            if (key > value) {
                return value * 10 + key;
            }
            return key * 10 + value;
        }
    }

    /**
     * solution: force, exceed time limit
     * @param dominoes
     * @return
     */
    public int numEquivDominoPairsForce(int[][] dominoes) {
        int n = dominoes.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (dominoes[i][0] == dominoes[j][0]
                        && dominoes[i][1] == dominoes[j][1]) {
                    count++;
                } else if (dominoes[i][0] == dominoes[j][1]
                        && dominoes[i][1] == dominoes[j][0]) {
                    count++;
                }
            }
        }
        return count;
    }

}
