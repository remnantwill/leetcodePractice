package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MinCostClimbingStairs746.class)
@RunWith(SpringRunner.class)
public class MinCostClimbingStairs746Test {

    @Autowired
    private MinCostClimbingStairs746 instance;

    @Test
    public void minCostClimbingStairsTest() {
        int[] cost = new int[] { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };
        int ans = instance.minCostClimbingStairs(cost);
        System.out.println(ans);
    }
}
