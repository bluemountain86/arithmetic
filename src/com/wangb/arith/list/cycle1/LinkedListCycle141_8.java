package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wangbin
 * @Date 2021/3/8
 */
public class LinkedListCycle141_8 {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (nodeSet.contains(head)) {
                return true;
            }
            nodeSet.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slower = head.next;
        ListNode faster = head.next.next;

        while (slower != faster) {
            if(faster == null || faster.next == null) {
                return false;
            }
            slower = slower.next;
            faster = faster.next.next;
        }

        return true;
    }
}
