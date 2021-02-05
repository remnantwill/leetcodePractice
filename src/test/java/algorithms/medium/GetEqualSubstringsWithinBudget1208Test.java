package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = GetEqualSubstringsWithinBudget1208.class)
@RunWith(SpringRunner.class)
public class GetEqualSubstringsWithinBudget1208Test {

    @Autowired
    private GetEqualSubstringsWithinBudget1208 instance;

    @Test
    public void equalSubstringTest() {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int ans = instance.equalSubstring(s, t, maxCost);
        System.out.println(ans);
    }

    @Test
    public void equalSubstringTestII() {
        String s = "abcd";
        String t = "bcdf";
        int maxCost = 3;
        int ans = instance.equalSubstringII(s, t, maxCost);
        System.out.println(ans);
    }
}
