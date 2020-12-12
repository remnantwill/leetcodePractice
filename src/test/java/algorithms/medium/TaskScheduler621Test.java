package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = TaskScheduler621.class)
@RunWith(SpringRunner.class)
public class TaskScheduler621Test {

    @Autowired
    private TaskScheduler621 instance;

    @Test
    public void leastIntervalTest() {
        char[] tasks = new char[] { 'A', 'A', 'A', 'B', 'B', 'B' };
        int n = 2;
        int ans = instance.leastInterval(tasks, n);
        System.out.println(ans);
    }
}
