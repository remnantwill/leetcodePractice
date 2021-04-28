package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SumSquareNumbers633.class)
@RunWith(SpringRunner.class)
public class SumSquareNumbers633Test {

    @Autowired
    private SumSquareNumbers633 instance;

    @Test
    public void judgeSquareSumTest() {
        int c = 4;
        boolean ans = instance.judgeSquareSum(c);
        System.out.println(ans);
    }

    @Test
    public void judgeSquareSumTestIII() {
        int c = 4;
        boolean ans = instance.judgeSquareSumIII(c);
        System.out.println(ans);
    }

}
