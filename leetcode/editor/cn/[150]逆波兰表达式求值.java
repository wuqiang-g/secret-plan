
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int evalRPN(String[] tokens) {
        //RPN就是方便计算机用栈后缀计算。
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < tokens.length; i++ ){
            String cur = tokens[i];
            if("+-*/".contains(cur)){
                Integer a = stack.pop();
                Integer b = stack.pop();
                switch(cur){
                    case "+":
                        stack.push(a+b);
                        //记得所有case加break
                        break;
                    case "-":
                        stack.push(b-a);
                        break;
                    case "*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(b/a);
                        break;
                }
            }else{
                stack.push(Integer.valueOf(cur));
            }
        }
        //最后结果弹出
        return stack.pop();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
