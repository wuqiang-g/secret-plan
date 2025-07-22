
//leetcode submit region begin(Prohibit modification and deletion)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        //虚拟左右头节点
        ListNode min = new ListNode(-1);
        ListNode max = new ListNode(-1);

        ListNode cur = head;
        //这里注意，需要通过移动指针去操作，不能直接操作min max节点
        ListNode p1 = min;
        ListNode p2 = max;

        while (cur != null){
            if (cur.val < x){
                p1.next = cur;
                p1 = p1.next;
            }else {
                p2.next = cur;
                p2 = p2.next;
            }
            //这里容易有问题，如果直接往后移动，但是不断开原来节点的话，有成环可能
            //cur = cur.next;
            //可以采用头结点往后移，断开原来的节点
            head = cur.next;
            cur.next = null;
            cur = head;
        }

        p1.next = max.next;
        return min.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
