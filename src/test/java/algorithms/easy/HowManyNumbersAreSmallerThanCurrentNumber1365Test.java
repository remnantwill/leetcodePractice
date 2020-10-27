package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = HowManyNumbersAreSmallerThanCurrentNumber1365.class)
@RunWith(SpringRunner.class)
public class HowManyNumbersAreSmallerThanCurrentNumber1365Test {

    @Autowired
    private HowManyNumbersAreSmallerThanCurrentNumber1365 instance;

    @Test
    public void testSmallerNumbersThanCurrent() {
        int[] input = {8,1,2,2,3};
//        int[] res = instance.smallerNumbersThanCurrentII(input);
        int[] res = instance.smallerNumbersThanCurrentIII(input);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
