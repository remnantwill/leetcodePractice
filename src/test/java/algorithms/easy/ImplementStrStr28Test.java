package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ImplementStrStr28.class)
@RunWith(SpringRunner.class)
public class ImplementStrStr28Test {

    @Autowired
    private ImplementStrStr28 instance;

    @Test
    public void strStrTest() {
        String haystack = "hello", needle = "ll";
        int ans = instance.strStr(haystack, needle);
        System.out.println(ans);
    }

    @Test
    public void strStrIITest() {
        String haystack = "hello", needle = "ll";
        int ans = instance.strStrII(haystack, needle);
        System.out.println(ans);
    }
}
