package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-03 22:33:39
 */
public class ReverseList206_1 {

    public ListNode reverseList(ListNode head) {

        ListNode tail = null;
        ListNode prevNode = null;
        tail = head;
        while (tail != null) {
            ListNode tempNext = tail.next;
            tail.next = prevNode;
            prevNode = tail;
            tail = tempNext;
        }

        return prevNode;
    }

    @Test
    public void testReverseList() {
        ListNode node = new ListNode(1);
        ListNode tail = node;
        for (int i = 2; i < 10; i++) {
            ListNode tmpNextNode = new ListNode(i);
            tail.next = tmpNextNode;
            tail = tmpNextNode;
        }

        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }

        tempNode = reverseList(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }

    }
}
