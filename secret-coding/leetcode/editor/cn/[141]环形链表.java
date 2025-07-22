
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //边界条件
        if (null == head){
            return false;
        }
        //快慢指针
        ListNode p1 = head;
        ListNode p2 = head;

        while (p2.next !=  null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                return true;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
