package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = SummaryRanges228.class)
@RunWith(SpringRunner.class)
public class SummaryRanges228Test {

    @Autowired
    private SummaryRanges228 instance;

    @Test
    public void summaryRangesTest() {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        List<String> strings = instance.summaryRanges(nums);
        System.out.println(strings);
    }
}
