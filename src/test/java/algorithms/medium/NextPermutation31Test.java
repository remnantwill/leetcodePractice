package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NextPermutation31.class)
@RunWith(SpringRunner.class)
public class NextPermutation31Test {

    @Autowired
    private NextPermutation31 instance;

    @Test
    public void nextPermutationTest() {
//        int[] input = { 1, 2, 3 };
        int[] input = { 3,2,1 };
//        int[] input = { 1,2 };
        instance.nextPermutation(input);
    }
}
