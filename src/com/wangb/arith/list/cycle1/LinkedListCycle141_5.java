package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class LinkedListCycle141_5 {
    public boolean listIsCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slower = head;
        ListNode faster = head.next;
        while (faster != slower) {
            if (faster == null || faster.next == null) {
                return false;
            }
            slower = slower.next;
            faster = faster.next.next;
        }
        return true;
    }
}
