package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = AddToArrayFormOfInteger989.class)
@RunWith(SpringRunner.class)
public class AddToArrayFormOfInteger989Test {

    @Autowired
    private AddToArrayFormOfInteger989 instance;

    @Test
    public void addToArrayFormTest() {
//        int[] A = new int[] { 1, 2, 0, 0 };
//        int K = 34;
        int[] A = new int[] { 2,7,4 };
        int K = 181;
//        int[] A = new int[] { 9,9,9,9,9,9,9,9,9,9 };
//        int K = 1;
        List<Integer> ans = instance.addToArrayForm(A, K);
        System.out.println(CommonUtil.printListInLine(ans));
    }

    @Test
    public void addToArrayFormTestII() {
        int[] A = new int[] { 2,7,4 };
        int K = 181;
//        int[] A = new int[] { 9,9,9,9,9,9,9,9,9,9 };
//        int K = 1;
        List<Integer> ans = instance.addToArrayFormII(A, K);
        System.out.println(CommonUtil.printListInLine(ans));
    }
}
