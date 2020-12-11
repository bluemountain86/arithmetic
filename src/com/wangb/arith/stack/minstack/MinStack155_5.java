package com.wangb.arith.stack.minstack;

import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class MinStack155_5 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public MinStack155_5() {

    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || minStack.peek() >= x) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (minStack.peek() >= stack.pop()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
