package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = LemonadeChange860.class)
@RunWith(SpringRunner.class)
public class LemonadeChange860Test {

    @Autowired
    private LemonadeChange860 instance;

    @Test
    public void lemonadeChangeTest() {
//        int[] bills = new int[] { 5, 5, 5, 10, 20 };
        int[] bills = new int[] { 5,5,10,10,20 };
        boolean ans = instance.lemonadeChange(bills);
        System.out.println(ans);
    }
}
