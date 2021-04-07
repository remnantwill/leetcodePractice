package algorithms.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/rabbits-in-forest/
 */
public class RabbitsInForest781 {

    public int numRabbits(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int answer : answers) {
            map.put(answer, map.getOrDefault(answer, 0) + 1);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer y = entry.getKey();
            Integer x = entry.getValue();
            ans += (x + y) / (y + 1) * (y + 1);
        }
        return ans;
    }

}
