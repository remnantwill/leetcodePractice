package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CountPrimes204.class)
@RunWith(SpringRunner.class)
public class CountPrimes204Test {

    @Autowired
    private CountPrimes204 instance;

    @Test
    public void countPrimesTest() {
        int n = 10;
//        int n = 2;
        int ans = instance.countPrimes(n);
        System.out.println(ans);
    }

}
