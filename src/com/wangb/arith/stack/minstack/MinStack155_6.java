package com.wangb.arith.stack.minstack;

import java.util.Stack;

/**
 * @Author wangbin
 * @Date 2020/12/11
 */
public class MinStack155_6 {

    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minSack = new Stack<>();

    public MinStack155_6() {

    }

    public void push(int x) {
        stack.push(x);
        if (stack.empty() || minSack.peek() >= x) {
            minSack.push(x);
        }
    }

    public void pop() {
        if (stack.pop() <= minSack.peek()) {
            minSack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minSack.peek();
    }
}
