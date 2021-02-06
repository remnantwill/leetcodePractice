package algorithms.medium;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/maximum-points-you-can-obtain-from-cards/
 */
public class MaximumPointsYouCanObtainFromCards1423 {

    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;
        int sum = 0;
        for (int i = 0; i < windowSize; i++) {
            sum += cardPoints[i];
        }
        int minSum = sum;
        for (int i = windowSize; i < n; i++) {
            sum += cardPoints[i] - cardPoints[i - windowSize];
            minSum = Math.min(minSum, sum);
        }
        return Arrays.stream(cardPoints).sum() - minSum;
    }

}
