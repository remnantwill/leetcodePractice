package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PowerOfTwo231.class)
@RunWith(SpringRunner.class)
public class PowerOfTwo231Test {

    @Autowired
    private PowerOfTwo231 instance;

    @Test
    public void isPowerOfTwoTest() {
        int n = 1;
        boolean ans = instance.isPowerOfTwo(n);
        System.out.println(ans);
    }

}
