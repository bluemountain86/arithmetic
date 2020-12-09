package com.wangb.arith.list.swappairs;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class SwapPairs24_7 {
    public ListNode swapPairs(ListNode head) {
        ListNode resultNode = new ListNode(0);
        resultNode.next = head;
        ListNode tmpNode = resultNode;
        while (tmpNode.next != null && tmpNode.next.next != null) {
            ListNode swapNode1 = tmpNode.next;
            ListNode swapNode2 = tmpNode.next.next;

            swapNode1.next = swapNode2.next;
            swapNode2.next = swapNode1;

            tmpNode.next = swapNode2;
            tmpNode = swapNode1;
        }
        return resultNode.next;
    }
}