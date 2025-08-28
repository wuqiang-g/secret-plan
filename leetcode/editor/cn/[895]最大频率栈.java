
//leetcode submit region begin(Prohibit modification and deletion)
class FreqStack {
    //维护最大频率
    int maxFreq = 0;
    //维护值的频率
    HashMap<Integer,Integer> valMapFreq = new HashMap<>();
    //是当前评率，加入的先后顺序用一个栈来保存，这样就能保存值存入的先后顺序
    HashMap<Integer,Stack<Integer>> freqMapValStk = new HashMap<>();

    public FreqStack() {

    }

    public void push(int val) {
        int freq = valMapFreq.getOrDefault(val,0)+1;
        valMapFreq.put(val,freq);
        //putIfAbsent  如果缺陷，创建val。
        freqMapValStk.putIfAbsent(freq,new Stack<Integer>());
        freqMapValStk.get(freq).push(val);
        maxFreq = Math.max(maxFreq,freq);
    }

    public int pop() {
        Stack<Integer> stk = freqMapValStk.get(maxFreq);
        Integer val = stk.pop();
        valMapFreq.put(val,valMapFreq.get(val) -1);
        if(stk.isEmpty()){
            maxFreq--;
        }
        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
//leetcode submit region end(Prohibit modification and deletion)
