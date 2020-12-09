package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class ReverseList206_8 {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode tmpNode = curNode.next;

            curNode.next = preNode;

            preNode = curNode;

            curNode = tmpNode;
        }

        return preNode;
    }
}
