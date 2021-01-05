package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FibonacciNumber509.class)
@RunWith(SpringRunner.class)
public class FibonacciNumber509Test {

    @Autowired
    private FibonacciNumber509 instance;

    @Test
    public void fibTest() {
        int n = 4;
        int ans = instance.fib(n);
        System.out.println(ans);
    }

    @Test
    public void fibTestII() {
        int n = 4;
        int ans = instance.fibII(n);
        System.out.println(ans);
    }

    @Test
    public void fibTestIII() {
        int n = 4;
        int ans = instance.fibIII(n);
        System.out.println(ans);
    }

}
