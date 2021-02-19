package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MaxConsecutiveOnesIII1004.class)
@RunWith(SpringRunner.class)
public class MaxConsecutiveOnesIII1004Test {

    @Autowired
    private MaxConsecutiveOnesIII1004 instance;

    @Test
    public void longestOnesTest() {
        int[] A = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int K = 2;
        int ans = instance.longestOnes(A, K);
        System.out.println(ans);
    }

    @Test
    public void longestOnesTestII() {
        int[] A = new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int K = 2;
        int ans = instance.longestOnesII(A, K);
        System.out.println(ans);
    }
}
