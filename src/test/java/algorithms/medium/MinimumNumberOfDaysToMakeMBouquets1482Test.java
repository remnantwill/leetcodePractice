package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MinimumNumberOfDaysToMakeMBouquets1482.class)
@RunWith(SpringRunner.class)
public class MinimumNumberOfDaysToMakeMBouquets1482Test {

    @Autowired
    private MinimumNumberOfDaysToMakeMBouquets1482 instance;

    @Test
    public void minDaysTest() {
        int[] bloomDay = new int[]{1,10,3,10,2};
        int m = 3, k = 1;
        int ans = instance.minDays(bloomDay, m, k);
        System.out.println(ans);
    }
}
