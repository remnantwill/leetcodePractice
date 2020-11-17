package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RelativeSortArray1122.class)
@RunWith(SpringRunner.class)
public class RelativeSortArray1122Test {

    @Autowired
    private RelativeSortArray1122 instance;

    @Test
    public void relativeSortArrayTest() {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ans = instance.relativeSortArray(arr1, arr2);
        System.out.println(CommonUtil.printArrayInLine(ans));
    }

    @Test
    public void relativeSortArrayIITest() {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ans = instance.relativeSortArrayII(arr1, arr2);
        System.out.println(CommonUtil.printArrayInLine(ans));
    }
}
