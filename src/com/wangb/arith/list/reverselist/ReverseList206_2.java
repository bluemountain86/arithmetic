package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-04 22:23:26
 */
public class ReverseList206_2 {
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;
        while(currNode != null) {
            ListNode tmpNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = tmpNode;
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

