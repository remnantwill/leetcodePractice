package algorithms.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/basic-calculator-ii/
 */
public class BasicCalculatorII227 {

    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        int n = s.length();
        int num = 0;
        char preSign = '+';
        for (int i = 0; i < n; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if (!Character.isDigit(s.charAt(i)) && s.charAt(i) != ' ' || i == n - 1) {
                switch (preSign) {
                case '+':
                    stack.push(num);
                    break;
                case '-':
                    stack.push(-num);
                    break;
                case '*':
                    stack.push(stack.pop() * num);
                    break;
                default:
                    stack.push(stack.pop() / num);
                }
                preSign = s.charAt(i);
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }
        return ans;
    }

}
