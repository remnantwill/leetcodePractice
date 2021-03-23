package algorithms.medium;

import Bean.NestedInteger;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/flatten-nested-list-iterator/
 */
public class FlattenNestedListIterator341 {
}

/**
 * solution I: dfs
 */
class NestedIterator implements Iterator<Integer> {

    private List<Integer> vals;
    private Iterator<Integer> curr;

    public NestedIterator(List<NestedInteger> nestedList) {
        vals = new ArrayList<>();
        dfs(nestedList);
        curr = vals.iterator();
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                vals.add(nestedInteger.getInteger());
            } else {
                dfs(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return curr.next();
    }

    @Override
    public boolean hasNext() {
        return curr.hasNext();
    }
}

/**
 * solution II: stack
 */
class NestedIteratorII implements Iterator<Integer> {

    private Deque<Iterator<NestedInteger>> stack;

    public NestedIteratorII(List<NestedInteger> nestedList) {
        stack = new LinkedList<>();
        stack.push(nestedList.iterator());

    }

    @Override
    public Integer next() {
        return stack.peek().next().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            Iterator<NestedInteger> it = stack.peek();
            if (!it.hasNext()) {
                stack.pop();
                continue;
            }
            NestedInteger nest = it.next();
            if (nest.isInteger()) {
                List<NestedInteger> list = new ArrayList<>();
                list.add(nest);
                stack.push(list.iterator());
                return true;
            }
            stack.push(nest.getList().iterator());
        }
        return false;
    }
}