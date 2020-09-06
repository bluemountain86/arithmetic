package com.wangb.arith.list.cycle2;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-05 17:25:30
 */
public class LinkedListCycle142_1 {
    public int listCycle(ListNode head) {
        int pos = -1;
        if (head == null || head.next == null) {
            return pos;
        }

        Map<ListNode, Integer> nodeMap = new HashMap<>();

        ListNode tmpNode = head;

        int index = 0;

        while (tmpNode != null) {
            if (nodeMap.containsKey(tmpNode)) {
                pos = nodeMap.get(tmpNode);
                break;
            } else {
                nodeMap.put(tmpNode, index);
                index++;
                tmpNode = tmpNode.next;
            }
        }

        return pos;
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

            if(i == 4) {
                index4 = tmpNextNode;
            }

        }
        tail.next = index4;

//        ListNode tempNode = node;
//        while (tempNode != null) {
//            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
//            tempNode = tempNode.next;
//        }
        int pos = listCycle(node);
        System.out.println(pos >= 0 ? ("tail connects to node index " + pos) : "no cycle");

    }

}
