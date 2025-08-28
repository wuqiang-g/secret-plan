
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode same = new ListNode(-101);
        ListNode notSame = new ListNode(-101);
        ListNode p1 = same;
        ListNode p2 = notSame;
        ListNode cur = head;
        while (cur != null){
            //和后面相等  或者 和相等链表里面的相等
            if ((null != cur.next && cur.val == cur.next.val) || cur.val == p1.val){
                p1.next = cur;
                p1 = p1.next;
            }else {
                p2.next = cur;
                p2 = p2.next;
            }
            cur = cur.next;
            p1.next = null;
            p2.next = null;
        }
        return notSame.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
