package algorithms.easy;

import Bean.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ReverseLinkedList206.class)
@RunWith(SpringRunner.class)
public class ReverseLinkedList206Test {

    @Autowired
    private ReverseLinkedList206 instance;

    @Test
    public void reverseListIITest() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode ans = instance.reverseListII(head);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
