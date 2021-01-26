package com.wangb.arith.list.mergetwosortedlists;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2021/1/26
 */
public class MergeTwoSortedLists21_7 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode resultNode = new ListNode('0');
        ListNode currNode = resultNode;

        while (l1 != null && l2 != null) {

            if (l1.val <= l2.val) {
                currNode.next = l1;
                l1 = l1.next;
            } else {
                currNode.next = l2;
                l2 = l2.next;
            }
            currNode = currNode.next;
        }

        currNode.next = l1 == null ? l2 : l1;

        return resultNode.next;
    }
}
