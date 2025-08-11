
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    public String minWindow(String s, String t) {
        HashMap<Character,Integer> need = new HashMap<Character,Integer>();
        HashMap<Character,Integer> windows = new HashMap<Character,Integer>();
        for(char c : t.toCharArray()){
            need.put(c,need.getOrDefault(c,0) + 1);
        }
        int left = 0;
        int right = 0;
        int valid = 0;
        int start = 0;
        int len = Integer.MAX_VALUE;
        while(right < s.length()){
            // 右移入窗口
            char r = s.charAt(right);
            right ++;
            if (need.containsKey(r)){
                windows.put(r,windows.getOrDefault(r,0) + 1);
                if (windows.get(r).equals(need.get(r))){
                    valid++;
                }
            }

            while(valid == need.size()){
                //满足条件，更新结果
                if (right - left < len){
                    len = right - left;
                    start = left;
                }
                //左移出窗口
                char l = s.charAt(left);
                left ++;
                if (need.containsKey(l)){
                    if (windows.get(l).equals(need.get(l))){
                        valid--;
                    }
                    //这里注意是和上面反的
                    windows.put(l,windows.get(l)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start,start + len);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
