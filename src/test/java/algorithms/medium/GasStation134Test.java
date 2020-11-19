package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GasStation134.class)
@RunWith(SpringRunner.class)
public class GasStation134Test {

    @Autowired
    private GasStation134 instance;

    @Test
    public void canCompleteCircuitTest() {
        int[] gas = new int[] { 1, 2, 3, 4, 5 };
        int[] cost = new int[] { 3, 4, 5, 1, 2 };
        int ans = instance.canCompleteCircuit(gas, cost);
        System.out.println(ans);
    }
}
