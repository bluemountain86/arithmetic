package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-05 16:01:04
 */
public class LinkedListCycle141_1 {
    public boolean listIsCycle(ListNode head) {

        if(head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast) {

            if(fast == null || fast.next == null) {
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }

    @Test
    public void testListIsCycle() {
        System.out.println("----------------testListIsCycle---------------");
        ListNode node = new ListNode(1);
        ListNode tail = node;
        ListNode index4 = null;
        for (int i = 2; i < 10; i++) {
            ListNode tmpNextNode = new ListNode(i);
            tail.next = tmpNextNode;
            tail = tmpNextNode;

            if(i == 4) {
                index4 = tmpNextNode;
            }

        }
        tail.next = index4;

//        ListNode tempNode = node;
//        while (tempNode != null) {
//            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
//            tempNode = tempNode.next;
//        }

        System.out.println(listIsCycle(node));

    }

}
