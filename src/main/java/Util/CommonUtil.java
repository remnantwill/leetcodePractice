package Util;

import java.util.List;

public class CommonUtil {
    public static String printArrayInLine(int[] input) {
        if (input == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length; i++) {
            if (i != input.length - 1) {
                sb.append(input[i]);
                sb.append(", ");
            } else {
                sb.append(input[i]);
            }
        }
        return sb.toString();
    }

    public static String printListInLine(List<Integer> input) {
        if (input == null) {
            return null;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.size(); i++) {
            if (i != input.size() - 1) {
                sb.append(input.get(i));
                sb.append(", ");
            } else {
                sb.append(input.get(i));
            }
        }
        return sb.toString();
    }
}
