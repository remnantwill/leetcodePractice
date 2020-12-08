package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = SplitArrayIntoFibonacciSequence842.class)
@RunWith(SpringRunner.class)
public class SplitArrayIntoFibonacciSequence842Test {

    @Autowired
    private SplitArrayIntoFibonacciSequence842 instance;

    @Test
    public void splitIntoFibonacciTest() {
        String S = "123456579";
        List<Integer> ans = instance.splitIntoFibonacci(S);
        System.out.println(CommonUtil.printListInLine(ans));
    }
}
