package org.datastructure.api;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列 先进先出
 * 特别注意：因为用LinkedList，所以queue也可以用集合的add 和 remove api
 * 区别：
 * 特性	            add(E e)	                     offer(E e)
 * 失败时（队列满）	抛出异常 (IllegalStateException)	 返回 false
 * 设计目的	        基于“集合”的接口（继承自Collection） 专为“队列”设计
 */
public class QueueApi {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        //队尾部加入元素
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        //获取队头元素 =1
        System.out.println(queue.peek());

        //删除队头元素 del 1
        queue.poll();
        // = 2
        System.out.println(queue.peek());

    }
}
