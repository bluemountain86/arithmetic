package com.wangb.arith.list.reverseknode;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-06 11:46:50
 */
public class ReverseKNodes25_1 {
    public ListNode reverseKNode(ListNode head, int k) {

        ListNode currNode = null;
        ListNode preNode = null;
        currNode = head;

        while (currNode.next != null) {

            for (int i = 0; i < k; i++) {

                while (currNode != null) {

                }

            }

        }

        return preNode;
    }

    private ListNode reverseNode(ListNode head) {
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
    public void testReverseKNode() {
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

        tempNode = reverseKNode(node, 3);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }

    }

}
