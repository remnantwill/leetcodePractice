package algorithms.hard;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = PalindromePartitioningII132.class)
@RunWith(SpringRunner.class)
public class PalindromePartitioningII132Test {

    @Autowired
    private PalindromePartitioningII132 instance;

    @Test
    public void minCutTest() {
        String s = "aab";
        int ans = instance.minCut(s);
        System.out.println(ans);
    }
}
