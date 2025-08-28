
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode cur = res;
        ListNode p1 = l1;
        ListNode p2 = l2;
        int cycle = 0;
        //这里有一个为空，就不需要两个相加了
        while (p1 != null ||  p2 != null || cycle > 0){
            int total = cycle;
            if (p1 != null){
                total += p1.val;
                p1 = p1.next;
            }
            if (p2 != null){
                total += p2.val;
                p2 = p2.next;
            }
            int val = total % 10;
            cycle = total / 10;
            cur.next = new ListNode(val);
            cur = cur.next;
        }
        return res.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
