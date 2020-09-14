package com.wangb.arith.list.cycle1;

import com.wangb.arith.list.ListNode;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-06 12:59:16
 */
public class LinkedListCycle141_4 {
    public boolean listIsCycle1(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slower = head;
        ListNode faster = head.next;

        while (slower != faster) {
            if (faster == null || faster.next == null) {
                return false;
            }
            slower = slower.next;
            faster = faster.next.next;
        }

        return true;
    }

    @Test
    public void testListIsCycle1() {
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

        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
        System.out.println("----------------testListIsCycle1---------------");
        System.out.println(listIsCycle1(node));

        System.out.println("----------------testListIsCycle2---------------");
        tail.next = index4;
        System.out.println(listIsCycle1(node));

    }

    public boolean listIsCycle2(ListNode head) {

        ListNode tmpNode = head;

        Set<ListNode> nodeSet = new HashSet<>();

        while (!nodeSet.contains(tmpNode)) {
            if (tmpNode == null) {
                return false;
            }
            nodeSet.add(tmpNode);
            tmpNode = tmpNode.next;
        }

        return true;
    }

    @Test
    public void testListIsCycle2() {
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

        ListNode tempNode = node;
        while (tempNode != null) {
            System.out.print(tempNode.val + (tempNode.next == null ? "-->null" : "-->"));
            tempNode = tempNode.next;
        }
        System.out.println("----------------testListIsCycle1---------------");
        System.out.println(listIsCycle2(node));

        System.out.println("----------------testListIsCycle2---------------");
        tail.next = index4;
        System.out.println(listIsCycle2(node));

    }

}
