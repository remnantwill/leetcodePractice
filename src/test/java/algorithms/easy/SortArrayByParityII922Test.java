package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static Util.CommonUtil.printArrayInLine;

@SpringBootTest(classes = SortArrayByParityII922.class)
@RunWith(SpringRunner.class)
public class SortArrayByParityII922Test {

    @Autowired
    private SortArrayByParityII922 instance;

    @Test
    public void sortArrayByParityIITest() {
        int[] input = {2,3,1,1,4,0,0,4,3,3};
        int[] res = instance.sortArrayByParityII2(input);
        StringBuffer sb = new StringBuffer();
        System.out.println(printArrayInLine(res));
    }
}
