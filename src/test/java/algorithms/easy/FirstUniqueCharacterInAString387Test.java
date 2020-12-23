package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = FirstUniqueCharacterInAString387.class)
@RunWith(SpringRunner.class)
public class FirstUniqueCharacterInAString387Test {

    @Autowired
    private FirstUniqueCharacterInAString387 instance;

    @Test
    public void firstUniqCharTest() {
        String s = "loveleetcode";
        int ans = instance.firstUniqChar(s);
        System.out.println(ans);
    }

    @Test
    public void firstUniqCharTestII() {
        String s = "loveleetcode";
        int ans = instance.firstUniqCharII(s);
        System.out.println(ans);
    }

    @Test
    public void firstUniqCharTestIII() {
        String s = "loveleetcode";
        int ans = instance.firstUniqCharIII(s);
        System.out.println(ans);
    }
}
