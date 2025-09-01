
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode res = new ListNode(-1);
        res.next = head;
        //这里从res开始计算，是为了处理【1,2】n等于2的边界case
        ListNode p1 = res;
        ListNode p2 = res;
        for(int i = 0 ; i <=n ; i++){
            p2 = p2.next;
        }
        while(p2 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return res.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
