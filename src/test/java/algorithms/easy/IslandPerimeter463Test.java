package algorithms.easy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = IslandPerimeter463.class)
@RunWith(SpringRunner.class)
public class IslandPerimeter463Test {

    @Autowired
    IslandPerimeter463 instance;

    @Test
    public void islandPerimeterTest() {
        int[][] intput = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
//        int[][] intput = {{0}};
        int res = instance.islandPerimeter(intput);
        System.out.println(res);
    }
}
