
//leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    //空间换时间，再搞一个栈，保存当前最小值
    Stack<Integer> stk ;
    Stack<Integer> min ;
    public MinStack() {
        stk = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        stk.push(val);
        //min.peek() min的栈顶元素代表，push之前的最小元素。
        if(min.isEmpty() || min.peek() > val){
            min.push(val);
        }else{
            min.push(min.peek());
        }
    }

    public void pop() {
        stk.pop();
        min.pop();
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)
