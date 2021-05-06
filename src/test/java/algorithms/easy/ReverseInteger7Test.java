package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReverseInteger7.class)
@RunWith(SpringRunner.class)
public class ReverseInteger7Test {

    @Autowired
    private ReverseInteger7 instance;

    @Test
    public void reverseTest() {
        int x = 123;
        int ans = instance.reverse(x);
        System.out.println(ans);
    }
}
