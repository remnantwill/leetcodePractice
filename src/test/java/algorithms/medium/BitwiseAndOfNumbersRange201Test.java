package algorithms.medium;

import algorithms.medium.BitwiseAndOfNumbersRange201;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = BitwiseAndOfNumbersRange201.class)
@RunWith(SpringRunner.class)
class BitwiseAndOfNumbersRange201Test {

    @Autowired
    private BitwiseAndOfNumbersRange201 bitwiseAndOfNumbersRange201;

    @Test
    void testRepeatedSubstringPattern() {
        int result = bitwiseAndOfNumbersRange201.rangeBitwiseAnd(5, 7);
        System.out.println(result);
    }

    @Test
    void testBrianKernighanAlgorithm() {
        int result = bitwiseAndOfNumbersRange201.brianKernighanAlgorithm(5, 7);
        System.out.println(result);
    }
}
