
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> window = new HashMap<>();
        int res = 0;
        while(right < s.length()){
            char r = s.charAt(right);
            right++;
            window.put(r,window.getOrDefault(r,0) + 1);
            while(window.get(r) > 1){
                //这里核心是不是每次都在这里修改结果
                char l = s.charAt(left);
                left++;
                if(window.get(l) > 1){
                    window.put(l,window.get(l) - 1);
                }else{
                    window.put(l,0);
                }
            }
            //这里修改结果，是因为左窗口已经收缩，或者左窗口不动，右窗口扩张到没有超过1，也就是不重复，这时候更新结果
            res = Math.max(res,right - left);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
