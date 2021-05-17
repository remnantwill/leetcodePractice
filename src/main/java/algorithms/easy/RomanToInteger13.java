package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/roman-to-integer/
 */
public class RomanToInteger13 {

    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Integer num = symbolValues.get(s.charAt(i));
            if (i < n - 1 && num < symbolValues.get(s.charAt(i + 1))) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        return ans;
    }

}
