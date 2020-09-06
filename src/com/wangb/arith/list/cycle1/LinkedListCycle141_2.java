package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-05 17:02:34
 */
public class LinkedListCycle141_2 {
    public boolean listIsCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slower = head;
        ListNode faster = head.next;

        while (slower != faster) {
            if (faster == null || faster.next == null) {
                return false;
            }

            slower = slower.next;
            faster = faster.next.next;
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
//        tail.next = index4;

//        ListNode tempNode = node;
//        while (tempNode != null) {
//            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
//            tempNode = tempNode.next;
//        }

        System.out.println(listIsCycle(node));

    }

}
