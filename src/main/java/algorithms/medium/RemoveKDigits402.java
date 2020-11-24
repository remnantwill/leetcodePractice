package algorithms.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/remove-k-digits/
 */
public class RemoveKDigits402 {

    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < num.length(); i++) {
            char digit = num.charAt(i);
            if (!deque.isEmpty() && k > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                k--;
            }
            deque.offerLast(digit);
        }
        for (int i = 0; i < k; i++) {
            deque.pollLast();
        }
        StringBuilder ans = new StringBuilder();
        boolean leadingZero = true;
        while (!deque.isEmpty()) {
            Character digit = deque.pollFirst();
            if (leadingZero && digit == '0') {
                continue;
            }
            ans.append(digit);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }

}
