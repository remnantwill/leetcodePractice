package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ValidMountainArray941.class)
@RunWith(SpringRunner.class)
public class ValidMountainArray941Test {

    @Autowired
    ValidMountainArray941 instance;

    @Test
    public void validMountainArrayTest() {
//        int[] input = {0,3,2,1};
//        int[] input = {3,5,5};
//        int[] input = {2,1};
//        int[] input = {2};
        int[] input = {0,1,2,3,4,5,6,7,8,9};
        boolean res = instance.validMountainArray(input);
        System.out.println(res);
    }
}
