package algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/task-scheduler/
 */
public class TaskScheduler621 {

    /**
     * solution I: simulation
     * @param tasks
     * @param n
     * @return
     */
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            char ch = tasks[i];
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        int m = freq.size();
        List<Integer> nextValid = new ArrayList<>();
        List<Integer> rest = new ArrayList<>();
        Set<Map.Entry<Character, Integer>> entrySet = freq.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            Integer value = entry.getValue();
            nextValid.add(1);
            rest.add(value);
        }
        int time = 0;
        for (int i = 0; i < tasks.length; i++) {
            ++time;
            int minNextValid = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                if (rest.get(j) != 0) {
                    minNextValid = Math.min(minNextValid, nextValid.get(j));
                }
            }
            time = Math.max(time, minNextValid);
            int best = -1;
            for (int j = 0; j < m; j++) {
                if (rest.get(j) > 0 && nextValid.get(j) <= time) {
                    if (best == -1 || nextValid.get(j) > nextValid.get(best)) {
                        best = j;
                    }
                }
            }
            nextValid.set(best, time + n + 1);
            rest.set(best, rest.get(best) - 1);
        }
        return time;
    }

}
