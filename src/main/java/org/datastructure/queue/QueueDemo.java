package org.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列、先进先出。尾部加元素，头部出元素
 */
public class QueueDemo {

    public static void main(String[] args) {
        //队列是一个接口，这里用双向链表实现
        Queue<Integer> queue = new LinkedList<>();

        /**
         * 入队 offer
         */
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        /**
         * 出队 poll sout  = 1
         */
        Integer poll = queue.poll();

        /**
         * 查看队首元素 sout = 2
         */
        Integer peek = queue.peek();
    }
}
