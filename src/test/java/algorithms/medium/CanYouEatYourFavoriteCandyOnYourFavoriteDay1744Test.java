package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CanYouEatYourFavoriteCandyOnYourFavoriteDay1744.class)
@RunWith(SpringRunner.class)
public class CanYouEatYourFavoriteCandyOnYourFavoriteDay1744Test {

    @Autowired
    private CanYouEatYourFavoriteCandyOnYourFavoriteDay1744 instance;

    @Test
    public void canEatTest() {
        int[] candiesCount = new int[] { 7, 4, 5, 3, 8 };
        int[][] queries = new int[][] { { 0, 2, 2 }, { 4, 2, 4 }, { 2, 13, 1000000000 } };
        boolean[] ans = instance.canEat(candiesCount, queries);
        for (boolean an : ans) {
            System.out.println(an);
        }
    }
}
