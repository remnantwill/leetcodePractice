package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = Candy135.class)
@RunWith(SpringRunner.class)
public class Candy135Test {

    @Autowired
    private Candy135 instance;

    @Test
    public void candyTest() {
        int[] ratings = new int[] { 1, 0, 2 };
        int ans = instance.candy(ratings);
        System.out.println(ans);
    }

    @Test
    public void candyTestII() {
        int[] ratings = new int[] { 1, 3, 5, 3, 2, 1 };
        int ans = instance.candyII(ratings);
        System.out.println(ans);
    }
}
