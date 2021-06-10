package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CoinChangeII518.class)
@RunWith(SpringRunner.class)
public class CoinChangeII518Test {

    @Autowired
    private CoinChangeII518 instance;

    @Test
    public void changeTest() {
        int amount = 5;
        int[] coins = new int[] { 1, 2, 5 };
        int ans = instance.change(amount, coins);
        System.out.println(ans);
    }
}
