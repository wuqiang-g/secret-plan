
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left = 0;
        int right = 0;
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();

        for(char i : p.toCharArray()){
            need.put(i,need.getOrDefault(i,0) + 1);
        }
        int valid = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(right < s.length()){
            char r = s.charAt(right);
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
            while((right-left) == p.length()){
                //找出最优解
                if(valid == need.size()){
                    res.add(left);
                }
                char l = s.charAt(left);
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
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
