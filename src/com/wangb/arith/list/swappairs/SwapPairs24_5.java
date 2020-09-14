package com.wangb.arith.list.swappairs;

import com.sun.xml.internal.ws.resources.TubelineassemblyMessages;
import com.wangb.arith.list.ListNode;
import org.junit.Test;

public class SwapPairs24_5 {
    public ListNode swapPairs(ListNode head) {
        ListNode preNode = new ListNode(0);
        preNode.next = head;
        ListNode tmpNode = preNode;

        while(tmpNode.next != null && tmpNode.next.next != null) {
            ListNode swapNode1 = tmpNode.next;
            ListNode swapNode2 = tmpNode.next.next;

            swapNode1.next = swapNode2.next;
            swapNode2.next = swapNode1;

            tmpNode.next = swapNode2;
            tmpNode = swapNode1;
        }

        return preNode.next;
    }

    @Test
    public void testSwapPairs() {
        System.out.println("----------------testSwapPairs---------------");
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

        tempNode = swapPairs(node);
        System.out.println();
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
    }
}
