package org.datastructure.map;

/**
 * 顺序固定的map
 * 用一个双向链表，来固定输入顺序和输出顺序，通过头节点来顺序遍历map
 */
public class MyLinkHashMap {
    //保存数据的table
    Node [] table = new Node[]{};

    //双向链表
    Node head;
    Node tail;
}


class Node{
    //原始k & v
    String k;
    String v;

    //带头尾节点
    Node next;
    Node pre;
}
