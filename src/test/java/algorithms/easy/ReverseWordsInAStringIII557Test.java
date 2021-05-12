package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReverseWordsInAStringIII557.class)
@RunWith(SpringRunner.class)
public class ReverseWordsInAStringIII557Test {

    @Autowired
    private ReverseWordsInAStringIII557 instance;

    @Test
    public void reverseWordsTest() {
        String s = "Let's take LeetCode contest";
        String ans = instance.reverseWords(s);
        System.out.println(ans);
    }
}
