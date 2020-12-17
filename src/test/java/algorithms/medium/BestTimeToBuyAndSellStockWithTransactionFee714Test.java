package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BestTimeToBuyAndSellStockWithTransactionFee714.class)
@RunWith(SpringRunner.class)
public class BestTimeToBuyAndSellStockWithTransactionFee714Test {

    @Autowired
    private BestTimeToBuyAndSellStockWithTransactionFee714 instance;

    @Test
    public void maxProfitTest() {
        int[] prices = new int[] { 1, 3, 2, 8, 4, 9 };
        int fee = 2;
        int ans = instance.maxProfit(prices, fee);
        System.out.println(ans);
    }

}
