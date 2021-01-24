package com.wangb.arith.list.swappairs;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class SwapPairs24_10 {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode curr = result;
        // 1->2->3->4->null
        // curr.next->1->2->3->4->null


        // 2->3->4->null
        // 1->3->4->null
        // 2->1->3->4->null


        // 2->1->3->4->null
        // curr.next->

        //2->1->4->3->null
        while (curr.next != null && curr.next.next != null) {
            ListNode tmpNode1 = curr.next;
            ListNode tmpNode2 = curr.next.next;

            tmpNode1.next = tmpNode2.next;
            tmpNode2.next = tmpNode1;

            // result.next指向新的head
            curr.next = tmpNode2;
            curr = tmpNode1;
        }
        return result.next;
    }

    @Test
    public void testSwapPairs() {
        System.out.println("----------------testSwapPairs---------------");
        ListNode node = new ListNode(1);
        ListNode tail = node;
        for (int i = 2; i < 5; i++) {
            ListNode tmpNextNode = new ListNode(i);
            tail.next = tmpNextNode;
            tail = tmpNextNode;
        }

        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }

        tempNode = swapPairs(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
    }
}