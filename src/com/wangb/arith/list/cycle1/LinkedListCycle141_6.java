package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wangbin
 * @Date 2020/12/9
 */
public class LinkedListCycle141_6 {
    public boolean listIsCycle1(ListNode head) {
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
        return true;
    }

    public boolean listIsCycle2(ListNode head) {
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
}
