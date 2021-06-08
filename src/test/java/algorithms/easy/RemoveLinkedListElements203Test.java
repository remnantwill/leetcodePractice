package algorithms.easy;

import Bean.ListNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = RemoveLinkedListElements203.class)
@RunWith(SpringRunner.class)
public class RemoveLinkedListElements203Test {

    @Autowired
    private RemoveLinkedListElements203 instance;

    @Test
    public void removeElementsIITest() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        int val = 2;
        ListNode ans = instance.removeElementsII(head, val);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
