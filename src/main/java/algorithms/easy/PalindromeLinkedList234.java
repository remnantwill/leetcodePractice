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
}
