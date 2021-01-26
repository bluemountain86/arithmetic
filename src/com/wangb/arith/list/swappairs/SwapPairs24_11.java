package com.wangb.arith.list.swappairs;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2021/1/26
 */
public class SwapPairs24_11 {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode curr = result;
        ListNode swapNode1 = null;
        ListNode swapNode2 = null;
        while (curr.next != null && curr.next.next != null) {
            swapNode1 = curr.next;
            swapNode2 = curr.next.next;

            swapNode1.next = swapNode2.next;
            swapNode2.next = swapNode1;

            curr.next = swapNode2;
            curr = swapNode1;
        }

        return result.next;
    }
}
