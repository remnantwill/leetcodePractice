package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SortIntegersByTheNumberOf1Bits1356.class)
@RunWith(SpringRunner.class)
public class SortIntegersByTheNumberOf1Bits1356Test {

    @Autowired
    private SortIntegersByTheNumberOf1Bits1356 instance;

    @Test
    public void sortByBitsTest() {
        int[] arr = {0,1,2,3,4,5,6,7,8};
//        int[] res = instance.sortByBits(arr);
        int[] res = instance.sortByBitsII(arr);
        for (int re : res) {
            System.out.println(re);
        }
    }
}
