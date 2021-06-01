package algorithms.medium;

/**
 * https://leetcode-cn.com/problems/can-you-eat-your-favorite-candy-on-your-favorite-day/
 */
public class CanYouEatYourFavoriteCandyOnYourFavoriteDay1744 {

    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        int n = candiesCount.length;
        long[] sums = new long[n];
        sums[0] = candiesCount[0];
        for (int i = 1; i < n; i++) {
            sums[i] = sums[i - 1] + candiesCount[i];
        }
        int q = queries.length;
        boolean[] ans = new boolean[q];
        for (int i = 0; i < q; i++) {
            int[] query = queries[i];
            int favoriteType = query[0];
            int favoriteDay = query[1];
            int dailyCap = query[2];
            long x1 = favoriteDay + 1;
            long y1 = (long) (favoriteDay + 1) * dailyCap;
            long x2 = favoriteType == 0 ? 1 : sums[favoriteType - 1] + 1;
            long y2 = sums[favoriteType];
            ans[i] = !(x1 > y2 || y1 < x2);
        }
        return ans;
    }

}
