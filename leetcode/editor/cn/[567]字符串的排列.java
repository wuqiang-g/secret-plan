
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> need = new HashMap<>(2);
        HashMap<Character,Integer> window = new HashMap<>();

        for(char s : s1.toCharArray()){
            need.put(s,need.getOrDefault(s,0) + 1);
        }
        int valid = 0;
        while(right < s2.length()){
            char r = s2.charAt(right);
            right++;
            //加入窗口
            window.put(r,window.getOrDefault(r,0) + 1);
            //更新数据
            if(need.containsKey(r)){
                if(need.get(r).equals(window.get(r))){
                    valid++;
                }
            }
            //可能是解
            while((right-left) == s1.length()){
                //找出最优解
                if(valid == need.size()){
                    return true;
                }
                char l = s2.charAt(left);
                left++;
                //先比较
                if(need.containsKey(l)){
                    if(need.get(l).equals(window.get(l))){
                        valid--;
                    }
                }
                //再移出窗口
                window.put(l,window.get(l) - 1);
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
