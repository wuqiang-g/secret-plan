
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
    public int kthToLast(ListNode head, int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        int i = 1;
        while(i <= k){
            p2 = p2.next;
            i++;
        }
        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1.val;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
