package com.wangb.arith.list.mergetwosortedlists;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/9
 */
public class MergeTwoSortedLists21_6 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergedNode = new ListNode(-1);
        ListNode curNode = mergedNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }

        curNode.next = l1 == null ? l2 : l1;
        return mergedNode.next;
    }
}
