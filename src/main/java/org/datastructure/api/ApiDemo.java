package org.datastructure.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * java 常用数据结构
 * <a href="https://labuladong.online/algo/programming-language-basic/java/#%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84">...</a>
 */
public class ApiDemo {
    public static void main(String[] args) {
        //1.动态数组ArrayList
        ArrayList<Integer> integers = new ArrayList<>();

        // 初始化一个包含元素 1, 3, 5 的 ArrayList nums
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5));

        nums.add(20);

        nums.add(3,999);

        Integer i = nums.get(nums.size() - 1);

        nums.remove(nums.size() -1);

        nums.set(0,777);

        nums.remove(2);

        Collections.swap(nums,0,1);

        //2. 双链表LinkedList
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        //头插入
        list.addFirst(0);
        //尾插入
        list.addLast(6);
        //头删除
        list.removeFirst();
        //尾删除
        list.removeLast();

        //3.队列  先进先出，可用LinkedList实现
        LinkedList<Integer> queue = new LinkedList<>();

        //入队
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        //出队 1先出
        queue.poll();

        //查看队首元素
        Integer peek = queue.peek();
        //查看队首元素
        Integer i1 = queue.peekFirst();
        //查看队尾元素
        Integer i2 = queue.peekLast();


        //4.栈 先进后出

        // 初始化一个空的整型栈 s
        Stack<Integer> s = new Stack<>();

        // 向栈顶添加元素
        s.push(10);
        s.push(20);
        s.push(30);

        // 删除栈顶元素
        s.pop();

        // 检查栈是否为空，输出：false
        System.out.println(s.isEmpty());

        // 获取栈的大小，输出：3
        System.out.println(s.size());

        // 获取栈顶元素，输出：30
        System.out.println(s.peek());
    }
}
