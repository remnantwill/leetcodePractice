package algorithms.medium;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/capacity-to-ship-packages-within-d-days/
 */
public class CapacityToShipPackagesWithinDDays1011 {

    public int shipWithinDays(int[] weights, int D) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();
        while (left < right) {
            int mid = left + (right - left) / 2;
            int need = 1;
            int cur = 0;
            for (int weight : weights) {
                if (cur + weight > mid) {
                    need++;
                    cur = 0;
                }
                cur += weight;
            }
            if (need <= D) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

}
