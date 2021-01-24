package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2021/1/23
 */
public class ReverseList206_10 {
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

    public ListNode reverseList2(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode tmpNode = head.next;
            head.next = prev;
            prev = head;
            head = tmpNode;
        }
        return prev;
    }
}
