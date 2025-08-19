
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int  i = 0;i< s.length();i++){
            char c = s.charAt(i);
            //保留所有字符数字构建一个新字符串
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String newString = sb.toString();
        int left = 0,right = newString.length()-1;
        while(left < right){
            if(newString.charAt(left) != newString.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
