
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
    public ListNode middleNode(ListNode head) {
        //快慢指针，一个走一步，一个走两步，循环结束条件简单画图一下
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        if (p2.next == null){
            return p1;
        }else {
            return p1.next;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
