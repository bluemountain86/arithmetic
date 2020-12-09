package com.wangb.arith.list.swappairs;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/9
 */
public class SwapPairs24_8 {
    public ListNode swapPairs(ListNode head) {
        ListNode resultNode = new ListNode(0);
        resultNode.next = head;
        ListNode curNode = resultNode;

        while (curNode.next != null && curNode.next.next != null) {
            ListNode swapNode1 = curNode.next;
            ListNode swapNode2 = curNode.next.next;

            swapNode1.next = swapNode2.next;
            swapNode2.next = swapNode1;

            curNode.next = swapNode2;
            curNode = swapNode1;

        }

        return resultNode.next;
    }
}
