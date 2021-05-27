package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReverseSubstringsBetweenEachPairOfParentheses1190.class)
@RunWith(SpringRunner.class)
public class ReverseSubstringsBetweenEachPairOfParentheses1190Test {

    @Autowired
    private ReverseSubstringsBetweenEachPairOfParentheses1190 instance;

    @Test
    public void reverseParenthesesTest() {
        String s = "(u(love)i)";
        String ans = instance.reverseParentheses(s);
        System.out.println(ans);
    }

    @Test
    public void reverseParenthesesTestII() {
        String s = "(u(love)i)";
        String ans = instance.reverseParenthesesII(s);
        System.out.println(ans);
    }

}
