
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        //leetcode 713原题
        int left = 0;
        int right = 0;
        int res = 0;
        int all = 1;
        while(right < nums.length){
            all = all * nums[right];
            right ++;
            while(all >= k && left < right){
                all = all / nums[left];
                left ++;
            }
            res += right - left;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
