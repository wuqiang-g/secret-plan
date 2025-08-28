
//leetcode submit region begin(Prohibit modification and deletion)
class MyStack {

    private Queue<Integer> queue;

    public MyStack() {
        queue = new LinkedList<Integer>();
    }

    //移入
    public void push(int x) {
        int n = queue.size();
        //往队尾部加
        queue.offer(x);
        //然后整体循环移动，把最新加入的队尾部移动到队头来
        for(int i = 0 ; i < n ;i++ ){
            queue.offer(queue.poll());
        }
    }

    //移出
    public int pop() {
        return queue.poll();
    }

    //返回栈顶元素
    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
//leetcode submit region end(Prohibit modification and deletion)
