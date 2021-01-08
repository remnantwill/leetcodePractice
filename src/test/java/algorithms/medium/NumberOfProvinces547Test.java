package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NumberOfProvinces547.class)
@RunWith(SpringRunner.class)
public class NumberOfProvinces547Test {

    @Autowired
    private NumberOfProvinces547 instance;

    @Test
    public void findCircleNumTest() {
        int[][] isConnected = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        int ans = instance.findCircleNum(isConnected);
        System.out.println(ans);
    }
}
