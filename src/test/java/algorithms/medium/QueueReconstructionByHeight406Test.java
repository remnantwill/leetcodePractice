package algorithms.medium;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = QueueReconstructionByHeight406.class)
@RunWith(SpringRunner.class)
public class QueueReconstructionByHeight406Test {

    @Autowired
    private QueueReconstructionByHeight406 instance;

    @Test
    public void reconstructQueueTest() {
        int[][] input = new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};

        int[][] res = instance.reconstructQueue(input);
        for (int[] re : res) {
            String out = CommonUtil.printArrayInLine(re);
            System.out.println(out);
        }
    }

    @Test
    public void reconstructQueueIITest() {
        int[][] input = new int[][] {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};

        int[][] res = instance.reconstructQueueII(input);
        for (int[] re : res) {
            String out = CommonUtil.printArrayInLine(re);
            System.out.println(out);
        }
    }
}
