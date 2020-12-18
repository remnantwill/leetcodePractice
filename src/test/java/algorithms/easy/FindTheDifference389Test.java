package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FindTheDifference389.class)
@RunWith(SpringRunner.class)
public class FindTheDifference389Test {

    @Autowired
    private FindTheDifference389 instance;

    @Test
    public void findTheDifferenceTest() {
        String s = "abcd", t = "abcde";
        char ans = instance.findTheDifference(s, t);
        System.out.println(ans);
    }

    @Test
    public void findTheDifferenceTestII() {
        String s = "abcd", t = "abcde";
        char ans = instance.findTheDifferenceII(s, t);
        System.out.println(ans);
    }

    @Test
    public void findTheDifferenceTestIII() {
        String s = "abcd", t = "abcde";
        char ans = instance.findTheDifferenceIII(s, t);
        System.out.println(ans);
    }

    @Test
    public void findTheDifferenceTestOwn() {
        String s = "abcd", t = "abcde";
        char ans = instance.findTheDifferenceOwn(s, t);
        System.out.println(ans);
    }
}
