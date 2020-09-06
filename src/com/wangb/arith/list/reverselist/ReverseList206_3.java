package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-05 11:12:20
 */
public class ReverseList206_3 {

    /**
     * 采用迭代方式反转链表
     *
     * @param head
     * @return
     */
    public ListNode reverseListIter(ListNode head) {
        ListNode currNode = head;
        ListNode preNode = null;
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

        tempNode = reverseListIter(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
    }

    /**
     * 采用递归方式反转链表
     *
     * @param head
     * @return
     */
    public ListNode reverseListRec(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode revertNode = reverseListRec(head.next);

        head.next.next = head;

        head.next = null;

        return revertNode;
    }

    @Test
    public void testReverseListRec() {
        System.out.println("----------------testReverseListRec---------------");
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

        tempNode = reverseListRec(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
    }
}
