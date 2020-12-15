package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = MonotoneIncreasingDigits738.class)
@RunWith(SpringRunner.class)
public class MonotoneIncreasingDigits738Test {

    @Autowired
    private MonotoneIncreasingDigits738 instance;

    @Test
    public void monotoneIncreasingDigitsTest() {
        int N = 332;
        int ans = instance.monotoneIncreasingDigits(N);
        System.out.println(ans);
    }
}
