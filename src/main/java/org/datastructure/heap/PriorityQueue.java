package org.datastructure.heap;

/**
 * 优先级队列，数据结构是二叉堆
 * 封装有入队列和出队列api,入队和出队，都会重排序O(logN)，保持堆结构
 */
public class PriorityQueue {

    // 在二叉堆堆顶插入一个元素，时间复杂度 O(logN)
    // N 为当前二叉堆中的元素个数
    void push(int x){

    }

    // 返回堆顶元素，时间复杂度 O(1)
    // 该堆顶元素就是二叉堆中的最大值或最小值，取决于是最大堆还是最小堆
    int peek(){
        return 1;
    }

    // 删除堆顶元素，时间复杂度 O(logN)
    int pop(){
        return 2;
    }

    // 返回堆中元素的个数，时间复杂度 O(1)
    int size(){
        return 3;
    }
}
