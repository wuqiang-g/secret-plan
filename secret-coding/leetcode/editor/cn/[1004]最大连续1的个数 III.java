
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxLen = 0;
        //统计窗口内1的数量。
        int windowOne = 0;
        while(right < nums.length){
            if(nums[right] == 1){
                windowOne++;
            }
            right++;
            while(right - left - windowOne > k){
                if(nums[left] == 1){
                    windowOne--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right - left);
        }
        return maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
