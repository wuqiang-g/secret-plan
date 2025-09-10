package org.datastructure.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 优先队列，只是和队列一样的api,底层实现和队列没关系，底层实现是顶堆。poll 顶部维护最值。
 */
public class PriorityQueueDemo {

    public static void main(String[] args) {
        /**
         * 默认自然排序，小顶堆 1 2 3 4
         */
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        minHeap.offer(3);
        minHeap.offer(2);
        minHeap.offer(1);
        minHeap.offer(4);


        // poll 1先出
        minHeap.poll();

        //查看队首元素 2
        Integer peek = minHeap.peek();

        /**
         * 创建大顶堆
         */
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }
}
