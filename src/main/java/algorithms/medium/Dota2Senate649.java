package algorithms.medium;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/dota2-senate/
 */
public class Dota2Senate649 {

    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiantQueue = new LinkedList<>();
        Queue<Integer> direQueue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            char c = senate.charAt(i);
            if (c == 'R') {
                radiantQueue.offer(i);
            } else {
                direQueue.offer(i);
            }
        }
        while (!radiantQueue.isEmpty() && !direQueue.isEmpty()) {
            Integer radiantIdx = radiantQueue.poll();
            Integer direIdx = direQueue.poll();
            if (radiantIdx < direIdx) {
                radiantQueue.offer(radiantIdx + n);
            } else {
                direQueue.offer(direIdx + n);
            }
        }
        return radiantQueue.isEmpty() ? "Dire" : "Radiant";
    }
}
