package com.wangb.arith.stack.minstack;

import org.junit.Test;

import java.util.Stack;

public class MinStack155_4 {

    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> minStack = new Stack<Integer>();

    public MinStack155_4() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (stack.pop() <= minStack.peek()) {
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
        MinStack155_1 minStack = new MinStack155_1();

        minStack.push(1);
        minStack.push(-1);
        minStack.push(-2);
        minStack.push(3);
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
