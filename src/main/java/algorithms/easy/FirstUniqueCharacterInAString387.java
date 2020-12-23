package algorithms.easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * https://leetcode-cn.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString387 {

    /**
     * solution I: Use hash table to store frequency
     * @param s
     * @return
     */
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    /**
     * solution II: Use hash tables to store indexes
     * @param s
     * @return
     */
    public int firstUniqCharII(String s) {
        Map<Character, Integer> position = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (position.containsKey(c)) {
                position.put(c, -1);
            } else {
                position.put(c, i);
            }
        }
        int first = n;
        for (Map.Entry<Character, Integer> entry : position.entrySet()) {
            Integer pos = entry.getValue();
            if (pos != -1 && pos < first) {
                first = pos;
            }
        }
        if (first == n) {
            first = -1;
        }
        return first;
    }

    /**
     * solution III: queue
     * @param s
     * @return
     */
    public int firstUniqCharIII(String s) {
        Map<Character, Integer> position = new HashMap<>();
        Queue<Pair> queue = new LinkedList<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!position.containsKey(c)) {
                position.put(c, i);
                queue.offer(new Pair(c, i));
            } else {
                position.put(c, -1);
                while (!queue.isEmpty() && position.get(queue.peek().ch) == -1) {
                    queue.poll();
                }
            }
        }
        return queue.isEmpty() ? -1 : queue.poll().pos;
    }

    /**
     * own solution
     * @param s
     * @return
     */
    public int firstUniqCharOwn(String s) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            count[chars[i] - 'a']++;
        }
        for (int i = 0; i < chars.length; i++) {
            if (count[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

}

class Pair {
    char ch;
    int pos;

    public Pair(char ch, int pos) {
        this.ch = ch;
        this.pos = pos;
    }
}
