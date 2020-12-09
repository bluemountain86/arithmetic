package com.wangb.arith.list.mergetwosortedlists;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class MergeTwoSortedLists21_5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultListNode = new ListNode(Integer.MIN_VALUE);
        ListNode head = resultListNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 == null ? l2 : l1;
        return resultListNode.next;
    }

    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val <= l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}
