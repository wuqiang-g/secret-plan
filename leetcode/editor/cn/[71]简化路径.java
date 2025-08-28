
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String simplifyPath(String path) {
        String[] split = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String s : split){
            if(s.isEmpty() || s.equals(".")){
                //空或者.代表当前路径不处理
                continue;
            }
            if(s.equals("..")){
                //往前走一步路径
                if(!stack.isEmpty()){
                    stack.pop();
                }
                continue;
            }
            //其他情况压入栈
            stack.push(s);
        }
        String res = "";
        while(!stack.isEmpty()){
            //最后的压栈先出，代表子目录到根目录弹栈。
            res = "/" + stack.pop() + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
