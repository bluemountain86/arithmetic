package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-08 22:56:39
 */
public class ReverseList206_4 {
    public ListNode reverseListIter(ListNode head) {

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
    public void testReverseListIter() {
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

        tempNode = reverseListIter(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
    }

}
