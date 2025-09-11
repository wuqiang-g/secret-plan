package org.datastructure.stack;

import java.util.Stack;

/**
 * 后进先出的结构
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        /**
         * 入栈 push
         */
        stack.push(1);
        stack.push(2);
        stack.push(3);

        /**
         * 出栈 pop sout = 3
         */
        Integer pop = stack.pop();

        /**
         * 查看栈顶元素 sout = 2
         */
        Integer peek = stack.peek();
    }
}
