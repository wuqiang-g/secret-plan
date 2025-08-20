
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i < strs[0].length();i++){ //i是列
            for(int j = 1; j < strs.length;j++){ //j是行
                String thisString = strs[j];
                String preString = strs[j-1];
                if(i >=  thisString.length() || i >= preString.length()
                        || thisString.charAt(i) != preString.charAt(i)){
                    //有一行已经到头，或者开始有不相等的，则已经是最长的
                    return strs[j].substring(0,i);
                }
            }
        }
        //这里处理单行的情况["a"]
        return strs[0];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
