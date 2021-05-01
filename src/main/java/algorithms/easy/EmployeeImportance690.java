package algorithms.easy;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/employee-importance/
 */
public class EmployeeImportance690 {


    Map<Integer, Employee> map = new HashMap<>();

    /**
     * solution II: dfs
     * @param employees
     * @param id
     * @return
     */
    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            map.put(employee.id, employee);
        }
        return dfs(id);
    }

    private int dfs(int id) {
        Employee employee = map.get(id);
        int totalImp = employee.importance;
        if (employee.subordinates != null && employee.subordinates.size() != 0) {
            for (Integer subIds : employee.subordinates) {
                totalImp += dfs(subIds);
            }
        }
        return totalImp;
    }

    /**
     * solution II: bfs
     * @param employees
     * @param id
     * @return
     */
    public int getImportanceII(List<Employee> employees, int id) {
        Map<Integer, Employee> mapII = new HashMap<>();
        for (Employee employee : employees) {
            mapII.put(employee.id, employee);
        }
        int total = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(id);
        while (!queue.isEmpty()) {
            Integer curId = queue.poll();
            Employee employee = mapII.get(curId);
            total += employee.importance;
            List<Integer> subList = employee.subordinates;
            for (Integer subId : subList) {
                queue.offer(subId);
            }
        }
        return total;
    }

    private static class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}