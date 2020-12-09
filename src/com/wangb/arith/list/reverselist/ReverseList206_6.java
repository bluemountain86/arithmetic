package com.wangb.arith.list.reverselist;

import com.wangb.arith.list.ListNode;

/**
 * @Author wangbin
 * @Date 2020/12/8
 */
public class ReverseList206_6 {
    public ListNode reverseList(ListNode head) {
        ListNode pruNode = null;
        ListNode currNode = head;
        while (currNode != null) {
            ListNode tmpNode = currNode.next;
            currNode.next = pruNode;
            pruNode = currNode;
            currNode = tmpNode;
        }
        return pruNode;
    }
}
