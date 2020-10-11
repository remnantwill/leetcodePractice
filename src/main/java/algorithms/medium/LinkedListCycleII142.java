package algorithms.medium;

import Bean.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/linked-list-cycle-ii/
 */
public class LinkedListCycleII142 {

    /**
     * self solution
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        if (head == null || head.next == null) {
            return null;
        }
        while (true) {
            if (head == null || head.next == null) {
                return null;
            }
            if (!set.add(head)) {
                return head;
            } else {
                head = head.next;
            }
        }
    }

    /**
     * official hashSet solution
     * @param head
     * @return
     */
    public ListNode detectCycleII(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<>();
        while (pos != null) {
            if (visited.contains(pos)) {
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }

    /**
     * official fast slow pointer solution
     * @param head
     * @return
     */
    public ListNode detectCycleIII(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return null;
            }
            if (fast == slow) {
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    }

}
