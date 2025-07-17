package org.example.list;

/**
 * <a href="https://labuladong.online/algo/data-structure-basic/linkedlist-basic/#%E5%8F%8C%E9%93%BE%E8%A1%A8%E7%9A%84%E5%9F%BA%E6%9C%AC%E6%93%8D%E4%BD%9C">双链表</a>
 */
public class DoubleListDemo {

    public static void main(String[] args) {
        //初始化
        DoubleListNode head = createLinkedList(new int[] {1, 2, 3, 4, 5});

        //尾结点
        DoubleListNode tail = null;
        //头节点遍历
        for (DoubleListNode p = head ; p != null ; p = p.next){
            System.out.println(p.val);
            tail = p;
        }
        System.out.println("-------------------------------");

        //尾结点遍历
        for (DoubleListNode p = tail ; p != null ; p = p.pre){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //头部加节点
        DoubleListNode newNode = new DoubleListNode(0);
        newNode.next = head;
        head.pre = newNode;
        head = newNode;
        for (DoubleListNode p = head ; p != null ; p = p.next){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //尾部加节点
        DoubleListNode newNode2 = new DoubleListNode(777);
        tail.next = newNode2;
        newNode2.pre = tail;
        tail = newNode2;
        for (DoubleListNode p = head ; p != null ; p = p.next){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //中间加节点
        DoubleListNode cur = head;
        for (int i = 0 ; i < 2 ; i ++){
            cur = cur.next;
        }
        DoubleListNode newNode3 = new DoubleListNode(888);
        newNode3.next = cur.next;
        newNode3.pre = cur;

        cur.next.pre = newNode3;
        cur.next = newNode3;
        for (DoubleListNode p = head ; p != null ; p = p.next){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //头部删节点
        DoubleListNode toDel = head;
        head = head.next;
        toDel.next = null;
        head.pre = null;
        for (DoubleListNode p = head ; p != null ; p = p.next){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //尾部删节点
        DoubleListNode toDel2 = tail;
        tail = tail.pre;
        tail.next = null;
        toDel2.pre = null;
        for (DoubleListNode p = head ; p != null ; p = p.next){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //中间删节点
        DoubleListNode toDel3 = head;
        for (int i = 0 ; i < 2 ; i ++){
            toDel3 = toDel3.next;
        }
        toDel3.pre.next = toDel3.next;
        toDel3.next.pre = toDel3.pre;
        toDel3.pre = null;
        toDel3.next = null;
        for (DoubleListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

    }

    public static DoubleListNode createLinkedList(int[] arr) {
        DoubleListNode head = new DoubleListNode(arr[0]);
        //这里的关键点事，需要在循环前，用一个cur节点操作，而不是能用head节点操作
        DoubleListNode cur = head;
        for (int i = 1; i < arr.length; i++){
            DoubleListNode newNode = new DoubleListNode(arr[i]);
            cur.next = newNode;
            newNode.pre = cur;
            cur = cur.next;
        }
        return head;
    }
}
