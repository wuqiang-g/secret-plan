
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
        ListNode cur = head;
        ListNode p1 = new ListNode(-1);
        ListNode p2 = new ListNode(-1);
        ListNode cur1 = p1;
        ListNode cur2 = p2;

        while(cur != null){
            if(cur.val < x){
                cur1.next = cur;
                cur1 = cur1.next;
            }else{
                cur2.next = cur;
                cur2 = cur2.next;
            }
            ListNode temp = cur;
            cur = cur.next;
            temp.next = null;
        }

        cur1.next = p2.next;
        return p1.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
