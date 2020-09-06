package com.wangb.arith.list.swappairs;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-04 22:41:57
 */
public class SwapPairs24_1 {
    /**
     * 给定 1->2->3->4, 你应该返回 2->1->4->3.
     *
     * @param head
     * @return ListNode
     */
    public ListNode swapPairs(ListNode head) {

        ListNode preNode = new ListNode(0);

        preNode.next = head;

        ListNode tmpNode = preNode;

        while (tmpNode.next != null && tmpNode.next.next != null) {

            ListNode swap1 = tmpNode.next;
            ListNode swap2 = tmpNode.next.next;
            tmpNode.next = swap2;
            swap1.next = swap2.next;
            swap2.next = swap1;
            tmpNode = swap1;
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
