package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReorganizeString767.class)
@RunWith(SpringRunner.class)
public class ReorganizeString767Test {

    @Autowired
    private ReorganizeString767 instance;

    @Test
    public void reorganizeStringTest() {
        String S = "aaababaacbb";
        String ans = instance.reorganizeString(S);
        System.out.println(ans);
    }

    @Test
    public void reorganizeStringTestII() {
        String S = "ebbbcccecc";
        String ans = instance.reorganizeStringII(S);
        System.out.println(ans);
    }
}
