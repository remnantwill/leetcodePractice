package algorithms.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/reverse-substrings-between-each-pair-of-parentheses/
 */
public class ReverseSubstringsBetweenEachPairOfParentheses1190 {

    /**
     * solution I: stack
     * @param s
     * @return
     */
    public String reverseParentheses(String s) {
        Deque<String> stack = new LinkedList<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(ans.toString());
                ans.setLength(0);
            } else if (c == ')') {
                ans.reverse();
                ans.insert(0, stack.pop());
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }

    /**
     * solution II: pre-handle parenthesis
     * @param s
     * @return
     */
    public String reverseParenthesesII(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int n = s.length();
        int[] pair = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                Integer j = stack.pop();
                pair[i] = j;
                pair[j] = i;
            }
        }
        StringBuilder ans = new StringBuilder();
        int index = 0;
        int steps = 1;
        while (index < n) {
            if (s.charAt(index) == '(' || s.charAt(index) == ')') {
                index = pair[index];
                steps = -steps;
            } else {
                ans.append(s.charAt(index));
            }
            index += steps;
        }
        return ans.toString();
    }

}
