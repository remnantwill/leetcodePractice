package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MinimumNumberOfKConsecutiveBitFlips995.class)
@RunWith(SpringRunner.class)
public class MinimumNumberOfKConsecutiveBitFlips995Test {

    @Autowired
    private MinimumNumberOfKConsecutiveBitFlips995 instance;

    @Test
    public void minKBitFlipsTest() {
        int[] A = new int[] { 0, 1, 0 };
        int K = 1;
        int ans = instance.minKBitFlips(A, K);
        System.out.println(ans);
    }
}
