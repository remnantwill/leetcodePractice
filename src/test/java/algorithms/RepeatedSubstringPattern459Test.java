package algorithms;

import Bean.TreeNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RepeatedSubstringPattern459.class)
@RunWith(SpringRunner.class)
class RepeatedSubstringPattern459Test {

    @Autowired
    private RepeatedSubstringPattern459 repeatedSubstringPattern459;

    @Test
    void testRepeatedSubstringPattern() {
        boolean match = repeatedSubstringPattern459.repeatedSubstringPattern("abcdabcd");
        System.out.println(match);
    }

    @Test
    void testRepeatedSubstringPattern2() {
        boolean match = repeatedSubstringPattern459.repeatedSubstringPattern2("abcdabcd");
        System.out.println(match);
    }

}
