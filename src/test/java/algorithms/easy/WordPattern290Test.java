package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = WordPattern290.class)
@RunWith(SpringRunner.class)
public class WordPattern290Test {

    @Autowired
    private WordPattern290 instance;

    @Test
    public void wordPatternTest() {
//        String pattern = "abba", str = "dog cat cat dog";
//        String pattern = "abba", str = "dog cat cat fish";
//        String pattern = "abba", str = "dog dog dog dog";
//        String pattern = "aaaa", str = "dog cat cat dog";
//        String pattern = "aba", str = "dog cat cat";
        String pattern = "aaa", str = "aa aa aa aa";
        boolean ans = instance.wordPattern(pattern, str);
        System.out.println(ans);
    }
}
