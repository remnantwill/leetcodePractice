package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PerfectSquares279.class)
@RunWith(SpringRunner.class)
public class PerfectSquares279Test {

    @Autowired
    private PerfectSquares279 instance;

    @Test
    public void numSquaresTest() {
        int n = 12;
        int ans = instance.numSquares(n);
        System.out.println(ans);
    }
}
