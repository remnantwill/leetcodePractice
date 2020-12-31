package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NonoverlappingIntervals435.class)
@RunWith(SpringRunner.class)
public class NonoverlappingIntervals435Test {

    @Autowired
    private NonoverlappingIntervals435 instance;

    @Test
    public void eraseOverlapIntervalsTest() {
        int[][] intervals = new int[][] { { 1, 100 }, { 11, 22 }, { 1, 11 }, { 2, 12 } };
        int ans = instance.eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }

    @Test
    public void eraseOverlapIntervalsTestII() {
        int[][] intervals = new int[][] { { 1, 100 }, { 11, 22 }, { 1, 11 }, { 2, 12 } };
        int ans = instance.eraseOverlapIntervalsII(intervals);
        System.out.println(ans);
    }

}
