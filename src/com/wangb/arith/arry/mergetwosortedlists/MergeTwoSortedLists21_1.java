package com.wangb.arith.arry.mergetwosortedlists;

import com.wangb.arith.list.ListNode;

import java.util.List;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-16 19:44:08
 */
public class MergeTwoSortedLists21_1 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(-1);
        ListNode preNode = resultNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                preNode.next = l1;
                l1 = l1.next;
            } else {
                preNode.next = l2;
                l2 = l2.next;
            }
            preNode = preNode.next;
        }
        preNode.next = l1 == null ? l2 : l1;

        return resultNode.next;
    }
}
