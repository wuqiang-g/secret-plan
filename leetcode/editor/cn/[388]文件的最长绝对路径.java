
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthLongestPath(String input) {
        Stack<String> stack = new Stack<>();
        int max = 0;
        for(String split : input.split("\n")){
            //lastIndexOf 不存在的话返回-1 根目录是0级。
            int level = split.lastIndexOf("\t") + 1;
            //只保留父路径,循环移除到只剩父目录
            while(level < stack.size()){
                stack.pop();
            }
            //substring 截取索引从[leval ...)的值
            stack.push(split.substring(level));
            if(split.contains(".")){
                //存在点说明是文件，循环便利栈计算长度，记得加/，更新max
                Iterator<String> iterator = stack.iterator();
                int length = 0;
                while(iterator.hasNext()){
                    length += iterator.next().length();
                }
                //加上目录之间的斜杠
                length += stack.size()-1;
                max = Math.max(max,length);
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
