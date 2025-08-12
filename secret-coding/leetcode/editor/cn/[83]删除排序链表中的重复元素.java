
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
        if (head == null){
            return null;
        }
        //112344
        ListNode res = new ListNode(-101);
        res.next = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null){
            if(slow.val != fast.val){
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        //这里的的别重要的，最后44while是处理不了的，需要手动断开
        slow.next = null;
        return res.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
