package algorithms.medium;

import Bean.ListNode;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = AddTwoNumbers2.class)
@RunWith(SpringRunner.class)
class AddTwoNumbers2Test {

    @Autowired
    private AddTwoNumbers2 addTwoNumbers2;

    @Test
    void testRepeatedSubstringPattern() {
        ListNode l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3)));
        ListNode l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));
        ListNode result = addTwoNumbers2.addTwoNumbers(l1, l2);
        System.out.println(result.toString());
    }
}
