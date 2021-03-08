package com.wangb.arith.list.cycle2;

import com.wangb.arith.list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wangbin
 * @Date 2021/3/8
 */
public class LinkedListCycle142_5 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        Set<ListNode> listSet = new HashSet<>();
        while (head != null) {
            if (listSet.contains(head)) {
                return head;
            }
            listSet.add(head);
            head = head.next;
        }
        return null;
    }
}
