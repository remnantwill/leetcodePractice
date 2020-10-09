package algorithms.easy;

import Bean.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 */
public class LinkedListCycle141 {

    /**
     * hashSet solution
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (!set.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /**
     * slow and fast pointer solution
     * @param head
     * @return
     */
    public boolean hasCycleII(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
