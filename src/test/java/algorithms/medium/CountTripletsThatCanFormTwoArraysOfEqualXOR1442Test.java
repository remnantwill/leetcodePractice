package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CountTripletsThatCanFormTwoArraysOfEqualXOR1442.class)
@RunWith(SpringRunner.class)
public class CountTripletsThatCanFormTwoArraysOfEqualXOR1442Test {

    @Autowired
    private CountTripletsThatCanFormTwoArraysOfEqualXOR1442 instance;

    @Test
    public void countTripletsTest() {
        int[] arr = new int[] { 2, 3, 1, 6, 7 };
        int ans = instance.countTriplets(arr);
        System.out.println(ans);
    }

    @Test
    public void countTripletsTestII() {
        int[] arr = new int[] { 2, 3, 1, 6, 7 };
        int ans = instance.countTripletsII(arr);
        System.out.println(ans);
    }

}
