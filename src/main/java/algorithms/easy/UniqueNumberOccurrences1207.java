package algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/unique-number-of-occurrences/
 */
public class UniqueNumberOccurrences1207 {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Set<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            set.add(e.getValue());
        }
        if (set.size() != map.size()) {
            return false;
        }
        return true;
    }

}
