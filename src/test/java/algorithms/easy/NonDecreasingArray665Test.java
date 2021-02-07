package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NonDecreasingArray665.class)
@RunWith(SpringRunner.class)
public class NonDecreasingArray665Test {

    @Autowired
    private NonDecreasingArray665 instance;

    @Test
    public void checkPossibilityTest() {
//        int[] nums = new int[] { 4,2,3 };
        int[] nums = new int[] { 3, 4, 2, 3 };
        boolean ans = instance.checkPossibility(nums);
        System.out.println(ans);
    }
}
