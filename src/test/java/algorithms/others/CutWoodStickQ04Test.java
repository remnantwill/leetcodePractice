package algorithms.others;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = CutWoodStickQ04.class)
@RunWith(SpringRunner.class)
public class CutWoodStickQ04Test {

    @Autowired
    private CutWoodStickQ04 instance;

    @Test
    public void cutBarTest() {
        int m = 3, n = 20;
//        int m = 5, n = 100;
        int ans = instance.cutBar(m, n);
        System.out.println(ans);
    }

    @Test
    public void cutBarTestII() {
        int m = 3, n = 20;
//        int m = 5, n = 100;
        int ans = instance.cutBarII(m, n);
        System.out.println(ans);
    }

}
