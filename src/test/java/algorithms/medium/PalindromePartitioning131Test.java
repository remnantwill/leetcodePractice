package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = PalindromePartitioning131.class)
@RunWith(SpringRunner.class)
public class PalindromePartitioning131Test {

    @Autowired
    private PalindromePartitioning131 instance;

    @Test
    public void partitionTest() {
        String s = "aab";
        List<List<String>> ans = instance.partition(s);
        for (List<String> an : ans) {
            String ret = CommonUtil.printStrListInLine(an);
            System.out.println(ret);
        }
    }
}
