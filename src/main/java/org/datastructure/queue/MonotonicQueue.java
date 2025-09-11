package org.datastructure.queue;

import java.util.LinkedList;
import java.util.Objects;

/**
 * 单调队列，先进先出特性，对头是最值。
 * 和优先级队列的区别，我能按最值出（优先级也能），并且能按先进的最值先出（优先级不能）
 */
public class MonotonicQueue {
    //原始数据
    LinkedList<Integer> q = new LinkedList<>();
    //最大值队列
    LinkedList<Integer> minQ = new LinkedList<>();
    //最小值队列
    LinkedList<Integer> maxQ = new LinkedList<>();

    public void offer(Integer n){
        q.addLast(n);
        /**
         * 这里是核心。
         */
        while (!maxQ.isEmpty() && maxQ.peekLast() < n){
            //队列里面比n小的都从后面删除
            maxQ.pollLast();
        }
        while (!minQ.isEmpty() && minQ.peekLast() > n){
            //队列里面比n大的都从后面删除
            minQ.pollLast();
        }
    }

    public Integer poll(){
        Integer deleteValue = q.pollFirst();

        /**
         * 这里是核心。
         */
        if (Objects.equals(deleteValue, maxQ.peekFirst())){
            //这里为什么要判断后再出能,因为不等于deleteValue，在offer的时候就被删除了。
            maxQ.pollFirst();
        }
        if (Objects.equals(deleteValue, minQ.peekFirst())){
            minQ.pollFirst();
        }
        return deleteValue;
    }

    public Integer max(){
        return maxQ.peek();
    }

    public Integer min(){
        return minQ.peek();
    }

    public Integer size(){
        return q.size();
    }
}
