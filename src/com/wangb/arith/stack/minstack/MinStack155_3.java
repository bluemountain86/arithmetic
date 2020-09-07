package com.wangb.arith.stack.minstack;

import org.junit.Test;

import java.util.Stack;

/**
 * @author wangbin
 * @program: arithmetic
 * @description:
 * @date 2020-09-07 21:13:01
 */
public class MinStack155_3 {

    private Stack<Integer> stack = new Stack<Integer>();

    private Stack<Integer> minStack = new Stack<Integer>();

    public MinStack155_3() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    @Override
    public String toString() {
        return "stack:" + stack.toString() + "\n" + "minstack:" + minStack;
    }

    @Test
    public void testMinStack() {
        MinStack155_3 minStack = new MinStack155_3();

        minStack.push(1);
        minStack.push(-1);
        minStack.push(2);
        minStack.push(-3);
        minStack.push(-3);
        minStack.push(9);
        System.out.println(minStack);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
    }
}
