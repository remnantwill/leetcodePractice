package algorithms.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/evaluate-reverse-polish-notation/
 */
public class EvaluateReversePolishNotation150 {

    /**
     * solution I: stack
     * @param tokens
     * @return
     */
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String token = tokens[i];
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                Integer num2 = stack.pop();
                Integer num1 = stack.pop();
                switch (token) {
                case "+":
                    stack.push(num1 + num2);
                    break;
                case "-":
                    stack.push(num1 - num2);
                    break;
                case "*":
                    stack.push(num1 * num2);
                    break;
                case "/":
                    stack.push(num1 / num2);
                    break;
                default:
                }
            }
        }
        return stack.pop();
    }

    private boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }

    /**
     * solution II: array simulated stack
     * @param tokens
     * @return
     */
    public int evalRPNII(String[] tokens) {
        int n = tokens.length;
        int[] simStack = new int[(n + 1) / 2];
        int index = -1;
        for (int i = 0; i < n; i++) {
            String token = tokens[i];
            switch (token) {
            case "+":
                index--;
                simStack[index] += simStack[index + 1];
                break;

            case "-":
                index--;
                simStack[index] -= simStack[index + 1];
                break;
            case "*":
                index--;
                simStack[index] *= simStack[index + 1];
                break;
            case "/":
                index--;
                simStack[index] /= simStack[index + 1];
                break;
            default:
                index++;
                simStack[index] = Integer.parseInt(token);
            }
        }
        return simStack[index];
    }

}
