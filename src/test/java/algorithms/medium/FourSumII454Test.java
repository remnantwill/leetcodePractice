package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FourSumII454.class)
@RunWith(SpringRunner.class)
public class FourSumII454Test {

    @Autowired
    private FourSumII454 instance;

    @Test
    public void fourSumCountTest() {
        int[] A = new int[] { 1, 2 };
        int[] B = new int[] { -2, -1 };
        int[] C = new int[] { -1, 2 };
        int[] D = new int[] { 0, 2 };
        int ans = instance.fourSumCount(A, B, C, D);
        System.out.println(ans);
    }
}
