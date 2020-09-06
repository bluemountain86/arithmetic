package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-06 12:59:16
 */
public class LinkedListCycle141_3 {
    public boolean listIsCycle(ListNode head) {
        if (head == null) {
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
        ListNode node = new ListNode(1);
        ListNode tail = node;
        ListNode index4 = null;
        for (int i = 2; i < 10; i++) {
            ListNode tmpNextNode = new ListNode(i);
            tail.next = tmpNextNode;
            tail = tmpNextNode;

            if (i == 4) {
                index4 = tmpNextNode;
            }

        }

        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
        System.out.println("----------------testListIsCycle1---------------");
        System.out.println(listIsCycle(node));

        System.out.println("----------------testListIsCycle2---------------");
        tail.next = index4;
        System.out.println(listIsCycle(node));

    }
}
