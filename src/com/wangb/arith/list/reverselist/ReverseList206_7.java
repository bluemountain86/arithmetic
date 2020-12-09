package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class ReverseList206_7 {
    public ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return preNode;
    }
}
