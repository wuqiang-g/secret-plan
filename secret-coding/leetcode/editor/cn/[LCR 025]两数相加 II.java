
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
        Stack<Integer> stack1 = new Stack<Integer>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        Stack<Integer> stack2 = new Stack<Integer>();
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int cycle = 0;
        ListNode res = new ListNode(-1);
        while (!stack1.isEmpty() || !stack2.isEmpty() || cycle > 0){
            int tatal = cycle;
            if (!stack1.isEmpty()){
                tatal += stack1.pop();
            }
            if (!stack2.isEmpty()){
                tatal += stack2.pop();
            }

            int val = tatal % 10;
            cycle = tatal / 10;

            ListNode node = new ListNode(val);
            node.next = res.next;
            res.next = node;
        }
        return res.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
