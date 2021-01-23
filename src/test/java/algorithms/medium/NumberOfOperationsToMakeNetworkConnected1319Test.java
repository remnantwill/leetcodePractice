package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = NumberOfOperationsToMakeNetworkConnected1319.class)
@RunWith(SpringRunner.class)
public class NumberOfOperationsToMakeNetworkConnected1319Test {

    @Autowired
    private NumberOfOperationsToMakeNetworkConnected1319 instance;

    @Test
    public void makeConnectedTest() {
        int n = 4;
        int[][] connections = new int[][] { { 0, 1 }, { 0, 2 }, { 1, 2 } };
        int ans = instance.makeConnected(n, connections);
        System.out.println(ans);
    }

    @Test
    public void makeConnectedTestII() {
        int n = 4;
        int[][] connections = new int[][] { { 0, 1 }, { 0, 2 }, { 1, 2 } };
        int ans = instance.makeConnectedII(n, connections);
        System.out.println(ans);
    }
}
