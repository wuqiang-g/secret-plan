
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
        //这里创建一个虚拟头结点,避免删除头结点
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode p1 = dummy;
        ListNode p2 = dummy;
        for (int i = 0; i < n; i++){
            p2 = p2.next;
        }
        while (p2.next != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
