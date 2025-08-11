
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> windows = new HashMap<Character, Integer>();
        HashMap<Character, Integer> need = new HashMap<Character, Integer>();
        int left = 0;
        int right = 0;
        int valid = 0;
        for(char c : s1.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        while(right < s2.length()){
            char r = s2.charAt(right);
            right ++ ;
            if (need.containsKey(r)){
                windows.put(r,windows.getOrDefault(r,0)+1);
                if (windows.get(r).equals(need.get(r))){
                    valid++;
                }
            }
            while(right - left >= s1.length()){
                if (valid == need.size()){
                    return true;
                }
                char l = s2.charAt(left);
                left ++;
                if (need.containsKey(l)){
                    if (windows.get(l).equals(need.get(l))){
                        valid--;
                    }
                    windows.put(l,windows.get(l)-1);
                }
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
