
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
    public void reorderList(ListNode head) {
        //用一个栈，反转保存链表
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.push(cur);
            cur = cur.next;
        }
        cur = head;

        while(cur != null){
            //弹末尾节点
            ListNode last = stack.pop();
            ListNode next = cur.next;
            //这里结束，奇偶都可用
            if(last == next || last.next == next){
                //这避免后面还有挂载
                last.next = null;
                break;
            }
            //末尾节点挂到cur节点后面
            cur.next = last;
            last.next = next;
            //这里一定是用next 不能用cur.next,因为cur.next已经变成last，不再是前面的cur.next
            cur = next;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
