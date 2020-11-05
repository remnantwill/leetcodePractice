package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = WordLadder127.class)
@RunWith(SpringRunner.class)
public class WordLadder127Test {

    @Autowired
    private WordLadder127 instance;

    @Test
    public void ladderLengthTest() {
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        String beginWord = "hit", endWord = "cog";
        int ans = instance.ladderLength(beginWord, endWord, wordList);
        System.out.println(ans);
    }
}
