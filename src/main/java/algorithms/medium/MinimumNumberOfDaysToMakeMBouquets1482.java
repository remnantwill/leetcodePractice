package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/minimum-number-of-days-to-make-m-bouquets/
 */
public class MinimumNumberOfDaysToMakeMBouquets1482 {

    public int minDays(int[] bloomDay, int m, int k) {
        if (m > bloomDay.length / k) {
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = 0;
        for (int value : bloomDay) {
            low = Math.min(low, value);
            high = Math.max(high, value);
        }
        while (low < high) {
            int days = low + (high - low) / 2;
            if (canMake(bloomDay, days, m, k)) {
                high = days;
            } else {
                low = days + 1;
            }
        }
        return low;
    }

    private boolean canMake(int[] bloomDay, int days, int m, int k) {
        int bouquets = 0;
        int flowers = 0;
        for (int value : bloomDay) {
            if (value <= days) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }

}
