package org.example.list;

public class ListDemo {

    public static void main(String[] args) {

        ListNode head = createLinkedList(new int[] {1, 2, 3, 4, 5});

        //1.遍历访问单链表
        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }

        System.out.println("-------------------------------");

        //2.头部插入节点
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        head = newHead;
        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }

        System.out.println("-------------------------------");

        //3.尾部插入节点
        ListNode cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = new ListNode(6);
        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }

        System.out.println("-------------------------------");

        ListNode cur2 = head;
        //4.中间插入节点
        for (int i = 0 ; i < 2 ; i ++){
            cur2 = cur2.next;
        }
        ListNode newNode2 = new ListNode(777);
        newNode2.next = cur2.next;
        cur2.next = newNode2;
        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }

        System.out.println("-------------------------------");

        //5.删除中间节点
        ListNode cur3 = head;
        for (int i = 0 ; i < 2 ; i ++){
            cur3 = cur3.next;
        }
        cur3.next = cur3.next.next;

        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }

        System.out.println("-------------------------------");

        //6.删除尾部节点
        ListNode cur4 = head;
        while(cur4.next.next != null){
            cur4 = cur4.next;
        }
        cur4.next = null;
        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

        //7.删除头部节点
        head = head.next;
        for (ListNode p = head ; p != null ; p = p.next ){
            System.out.println(p.val);
        }
        System.out.println("-------------------------------");

    }

    /**
     * 初始化一个单链表
     * @param arr
     * @return
     */
    public static ListNode createLinkedList(int[] arr) {
        ListNode head = new ListNode(arr[0]);

        ListNode cur = head;
        for (int i = 1; i < arr.length; i++){
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }

        return head;
    }
}
