package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2021/1/26
 */
public class ReverseList206_11 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmpNode = curr.next;
            curr.next = prev;

            prev = curr;
            curr = tmpNode;
        }
        return prev;
    }
}
