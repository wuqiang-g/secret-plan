
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int all = 1;
        int res = 0;
        while(right < nums.length){
            all = all * nums[right];
            right ++;
            //没有结果一般容易数组越界，这里加上left < right
            while(all >= k && left < right){
                all = all / nums[left];
                left ++;
            }
            //这里精髓就是这个每次的子数组个数是right - left
            res += right - left;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
