package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

public class ReverseList206_5 {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode tmpNode = currNode.next;
            currNode.next = preNode;
            preNode = currNode;
            currNode = tmpNode;
        }

        return preNode;
    }

    @Test
    public void testReverseList() {
        System.out.println("----------------testReverseListIter---------------");
        ListNode node = new ListNode(1);
        ListNode tail = node;
        for (int i = 2; i < 4; i++) {
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
