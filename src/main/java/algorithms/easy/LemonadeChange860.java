package algorithms.easy;

/**
 * https://leetcode-cn.com/problems/lemonade-change/
 */
public class LemonadeChange860 {

    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for (int bill : bills) {
            if (bill == 5) {
                fives++;
            } else if (bill == 10) {
                if (fives != 0) {
                    fives--;
                    tens++;
                } else {
                    return false;
                }
            } else {
                if (fives != 0 && tens != 0) {
                    fives--;
                    tens--;
                } else if (fives >= 3) {
                    fives -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
