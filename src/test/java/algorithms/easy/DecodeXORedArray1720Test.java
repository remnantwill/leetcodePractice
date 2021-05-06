package algorithms.easy;

import Util.CommonUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DecodeXORedArray1720.class)
@RunWith(SpringRunner.class)
public class DecodeXORedArray1720Test {

    @Autowired
    private DecodeXORedArray1720 instance;

    @Test
    public void decodeTest() {
        int[] encoded = {1, 2, 3};
        int first = 1;
        int[] ans = instance.decode(encoded, first);
        String s = CommonUtil.printArrayInLine(ans);
        System.out.println(s);
    }
}
