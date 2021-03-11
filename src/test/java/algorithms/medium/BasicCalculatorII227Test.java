package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BasicCalculatorII227.class)
@RunWith(SpringRunner.class)
public class BasicCalculatorII227Test {

    @Autowired
    private BasicCalculatorII227 instance;

    @Test
    public void calculateTest() {
        String s = "4 + 2 * 3";
        int ans = instance.calculate(s);
        System.out.println(ans);
    }
}
