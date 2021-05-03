package algorithms.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/brick-wall/
 */
public class BrickWall554 {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (List<Integer> bricks : wall) {
            int n = bricks.size();
            int sum = 0;
            for (int i = 0; i < n - 1; i++) {
                sum += bricks.get(i);
                cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            }
        }
        int maxCnt = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            maxCnt = Math.max(maxCnt, entry.getValue());
        }
        return wall.size()  - maxCnt;
    }

}
