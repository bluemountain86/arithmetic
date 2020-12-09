package com.wangb.arith.list.cycle2;

import com.wangb.arith.list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class LinkedListCycle142_2 {
    public ListNode listCycle(ListNode head) {
        Set<ListNode> nodeSet = new HashSet<>();
        while (head != null) {
            if (nodeSet.contains(head)) {
                return head;
            }
            nodeSet.add(head);
            head = head.next;
        }
        return null;
    }
}
