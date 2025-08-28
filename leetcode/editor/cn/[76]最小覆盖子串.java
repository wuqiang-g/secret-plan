
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need = new HashMap<>();
        for(char c : t.toCharArray()){
            need.put(c,need.getOrDefault(c,0) + 1);
        }
        HashMap<Character,Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        while(right < s.length()){
            char r = s.charAt(right);
            right++;
            //加入窗户
            window.put(r,window.getOrDefault(r,0) + 1);
            //更新数据
            if(need.containsKey(r)){
                if(need.get(r).equals(window.get(r))){
                    valid++;
                }
            }
            while(valid == need.size()){
                //更新最优解
                if(right - left < len){
                    len = right - left;
                    start = left;
                }
                char l = s.charAt(left);
                left++;
                //更新数据
                if(need.containsKey(l)){
                    if(need.get(l).equals(window.get(l))){
                        valid--;
                    }
                }
                //移出窗户
                window.put(l,window.get(l) - 1);
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start,start + len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
