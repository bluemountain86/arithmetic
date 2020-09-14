package com.wangb.arith.list.cycle2;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-05 17:25:30
 */
public class LinkedListCycle142_1 {
    public ListNode listCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }
        Set<ListNode> nodeMap = new HashSet<ListNode>();
        ListNode tmpNode = head;
        while (tmpNode != null) {
            if (nodeMap.contains(tmpNode)) {
                return tmpNode;
            }
            nodeMap.add(tmpNode);
            tmpNode = tmpNode.next;
        }
        return null;
    }

    @Test
    public void testListCycle() {
        System.out.println("----------------testListIsCycle---------------");
        ListNode node = new ListNode(1);
        ListNode tail = node;
        ListNode index4 = null;
        for (int i = 2; i < 10; i++) {
            ListNode tmpNextNode = new ListNode(i);
            tail.next = tmpNextNode;
            tail = tmpNextNode;

            if (i == 4) {
                index4 = tmpNextNode;
            }

        }
//        tail.next = index4;

//        ListNode tempNode = node;
//        while (tempNode != null) {
//            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
//            tempNode = tempNode.next;
//        }
        ListNode cycleNode = listCycle(node);
        System.out.println(cycleNode != null ? ("tail connects to node value " + cycleNode.val) : "no cycle");

    }

}
