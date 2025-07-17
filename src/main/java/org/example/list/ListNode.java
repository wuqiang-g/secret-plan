package org.example.list;

/**
 * 单链表
 * 优点：节省空间，无限扩容
 * 缺点：顺序访问慢。
 */
public class ListNode {

    int val;

    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
