package algorithms.easy;

import Bean.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList234 {
    /**
     * solution I: array with double pointer
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> valList = new ArrayList<>();
        ListNode currentNode = head;
        while (currentNode != null) {
            valList.add(currentNode.val);
            currentNode = currentNode.next;
        }
        int front = 0, back = valList.size() - 1;
        while (front < back) {
            if (!valList.get(front).equals(valList.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }

    private ListNode frontPointer;
    /**
     * solution II: stack
     * @param head
     * @return
     */
    public boolean isPalindromeII(ListNode head) {
        frontPointer = head;
        return checkRecursively(head);
    }

    private boolean checkRecursively(ListNode currentNode) {
        if (currentNode != null) {
            if (!checkRecursively(currentNode.next)) {
                return false;
            }
            if (frontPointer.val != currentNode.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

    /**
     * solution III: slow/fast pointer
     * @param head
     * @return
     */
    public boolean isPalindromeIII(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode firstHalfEnd = findFirstHalfEnd(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        ListNode p1 = head, p2 = secondHalfStart;
        boolean ans = true;
        while (ans && p2 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        firstHalfEnd.next = reverseList(secondHalfStart);
        return ans;
    }

    private ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode nextTmp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTmp;
        }
        return prev;
    }

    private ListNode findFirstHalfEnd(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
