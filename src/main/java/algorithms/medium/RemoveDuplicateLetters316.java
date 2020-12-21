package algorithms.medium;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * https://leetcode-cn.com/problems/remove-duplicate-letters/
 */
public class RemoveDuplicateLetters316 {

    public String removeDuplicateLetters(String s) {
        int length = s.length();
        char[] chars = s.toCharArray();
        int[] lastIndexes = new int[26];
        for (int i = 0; i < length; i++) {
            lastIndexes[chars[i] - 'a'] = i;
        }
        Deque<Character> stack = new ArrayDeque<>();
        boolean[] visited = new boolean[26];
        for (int i = 0; i < length; i++) {
            if (visited[chars[i] - 'a']) {
                continue;
            }
            while (!stack.isEmpty() && stack.peekLast() > chars[i] && lastIndexes[stack.peekLast() - 'a'] > i) {
                Character top = stack.removeLast();
                visited[top - 'a'] = false;
            }
            stack.offer(chars[i]);
            visited[chars[i] - 'a'] = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : stack) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

}
