package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = SearchA2DMatrix74.class)
@RunWith(SpringRunner.class)
public class SearchA2DMatrix74Test {

    @Autowired
    private SearchA2DMatrix74 instance;

    @Test
    public void searchMatrixTest() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = instance.searchMatrix(matrix, 3);
        System.out.println(ans);
    }

    @Test
    public void searchMatrixTestII() {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        boolean ans = instance.searchMatrixII(matrix, 3);
        System.out.println(ans);
    }
}
