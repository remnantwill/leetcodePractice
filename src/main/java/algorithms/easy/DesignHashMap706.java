package algorithms.easy;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * https://leetcode-cn.com/problems/design-hashmap/
 */
public class DesignHashMap706 {
}


class MyHashMap {

    private final int BASE = 769;
    private LinkedList<Pair>[] data;

    /** Initialize your data structure here. */
    public MyHashMap() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; i++) {
            data[i] = new LinkedList<>();
        }
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        int h = hash(key);
        for (Pair next : data[h]) {
            if (next.getKey() == key) {
                next.setValue(value);
                return;
            }
        }
        data[h].offerLast(new Pair(key, value));
    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        int h = hash(key);
        Iterator<Pair> iterator = data[h].iterator();
        while (iterator.hasNext()) {
            Pair next = iterator.next();
            if (next.getKey() == key) {
                return next.getValue();
            }
        }
        return -1;
    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        int h = hash(key);
        Iterator<Pair> iterator = data[h].iterator();
        while (iterator.hasNext()) {
            Pair next = iterator.next();
            if (next.getKey() == key) {
                data[h].remove(next);
                return;
            }
        }
    }

    private int hash(int key) {
        return key % BASE;
    }

    private class Pair {

        private int key;
        private int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */