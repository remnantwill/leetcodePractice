package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BestTimeToBuyAndSellStockII122.class)
@RunWith(SpringRunner.class)
public class BestTimeToBuyAndSellStockII122Test {

    @Autowired
    private BestTimeToBuyAndSellStockII122 instance;

    @Test
    public void maxProfitTest() {
        int[] input = new int[]{7,1,5,3,6,4};
        int res = instance.maxProfit(input);
        System.out.println(res);
    }

    @Test
    public void maxProfitIITest() {
        int[] input = new int[]{7,1,5,3,6,4};
        int res = instance.maxProfitII(input);
        System.out.println(res);
    }
}
