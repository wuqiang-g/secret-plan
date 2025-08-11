package org.datastructure.heap;

/**
 * 二叉堆：能够动态排序的数据结构 ，二叉树结构的延伸
 * <a href="https://labuladong.online/algo/data-structure-basic/binary-heap-basic/">...</a>
 * 性质1：特殊的二叉树，该树的任意节点的值大于等于（小于等于）其左右子树所有节点的值,这样的二叉树称之为大（小）顶堆
 * 性质2：一个二叉堆的左右子堆，也是二叉堆，堆排序算法常用该性质。
 * api: 下沉（sink） 和  上浮(swim) 插入而删除节点，始终维持堆的性质
 * 应用场景：优先级队列，堆排序算法
 *  优先级队列：api类似队列，出对和入对，区别是，输出有序
 */
public class HeapDemo {
}
