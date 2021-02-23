package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/grumpy-bookstore-owner/
 */
public class GrumpyBookstoreOwner1052 {

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int total = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                total += customers[i];
            }
        }
        int increase = 0;
        for (int i = 0; i < X; i++) {
            increase += grumpy[i] * customers[i];
        }
        int maxIncrease = increase;
        for (int i = X; i < n; i++) {
            increase = increase - grumpy[i - X] * customers[i - X] + grumpy[i] * customers[i];
            maxIncrease = Math.max(maxIncrease, increase);
        }
        return total + maxIncrease;
    }

}
