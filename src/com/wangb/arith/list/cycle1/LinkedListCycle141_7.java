package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2021/1/24
 */
public class LinkedListCycle141_7 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slower = head;
        ListNode faster = head.next;
        while (slower != faster) {
            if (faster == null || faster.next == null) {
                return false;
            }
            slower = slower.next;
            faster = faster.next.next;
        }
        return false;
    }
}
