package algorithms.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootTest(classes = EvaluateDivision399.class)
@RunWith(SpringRunner.class)
public class EvaluateDivision399Test {

    @Autowired
    private EvaluateDivision399 instance;

    @Test
    public void calcEquationTest() {
        List<List<String>> equations = new ArrayList<>();
        List<String> e1 = new ArrayList<>(Arrays.asList("a", "b"));
        List<String> e2 = new ArrayList<>(Arrays.asList("b","c"));
        equations.addAll(Arrays.asList(e1, e2));
        double[] values = {2.0,3.0};
        List<String> q1 = new ArrayList<>(Arrays.asList("a","c"));
        List<String> q2 = new ArrayList<>(Arrays.asList("b","a"));
        List<String> q3 = new ArrayList<>(Arrays.asList("a","e"));
        List<String> q4 = new ArrayList<>(Arrays.asList("a","a"));
        List<String> q5 = new ArrayList<>(Arrays.asList("x","x"));
        List<List<String>> queries = new ArrayList<>(Arrays.asList(q1, q2, q3, q4, q5));

        double[] ans = instance.calcEquation(equations, values, queries);
        for (double an : ans) {
            System.out.println(an);
        }
    }
}
