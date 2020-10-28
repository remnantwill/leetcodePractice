package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = UniqueNumberOccurrences1207.class)
@RunWith(SpringRunner.class)
public class UniqueNumberOccurrences1207Test {

    @Autowired
    private UniqueNumberOccurrences1207 instance;

    @Test
    public void uniqueOccurrencesTest() {
//        int[] input = {1,2,2,1,1,3};
        int[] input = {1,2};
        boolean result = instance.uniqueOccurrences(input);
        System.out.println(result);
    }

}
