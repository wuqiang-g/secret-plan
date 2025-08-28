
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> window = new HashMap<>();
        int max = 0;
        int maxLen = 0;
        while(right < s.length()){
            char r = s.charAt(right);
            window.put(r,window.getOrDefault(r,0)+1);
            max = Math.max(max,window.get(r));
            right ++;
            while(right - left - max > k){
                char l = s.charAt(left);
                window.put(l,window.get(l)-1);
                left++;
            }
            maxLen = Math.max(maxLen,right - left);
        }
        return maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
