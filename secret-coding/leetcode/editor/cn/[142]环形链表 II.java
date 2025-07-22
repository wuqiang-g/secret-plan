
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
    public ListNode detectCycle(ListNode head) {
        //特殊处理
        if (head == null){
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                //成环
                break;
            }
        }
        //不成环
        if (p2.next == null || p2.next.next == null){
            return null;
        }
        //纯数学题，要背一下
        // p2走2k p1走k k就是一圈
        // 假设环起点到相遇点的距离是m
        // 则p2再走k-m到环起点
        // p1从起点到环起点也是，k-m 所以把p1指到起点，然后p1 p2同步走，相遇点则是环起点。
        p1 = head;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
