package org.datastructure.api;

import java.util.Stack;

/**
 * 栈  后进 先出
 */
public class StackApi {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //入栈
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //获取栈顶元素 = 3
        System.out.println(stack.peek());


        //出栈 3 2 1
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
