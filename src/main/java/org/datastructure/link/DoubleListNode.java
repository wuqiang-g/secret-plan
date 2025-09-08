package org.datastructure.link;

/**
 * 双链表节点
 * 相较于单链表：
 *  优点：对链表尾部操作更方便
 *  缺点：多维护一个节点指针
 */
public class DoubleListNode {

    int val;

    DoubleListNode pre,next;

    DoubleListNode(int  val){
        this.val = val;
    }
}
