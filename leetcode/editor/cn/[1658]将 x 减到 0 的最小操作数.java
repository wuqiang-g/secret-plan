
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums, int x) {
        int left = 0;
        int right = 0;
        int sum = 0;
        //这道题相当反着来，找外面最短的和等于x ,相当找最里面的最长的子数组和等于sum - x
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        int target = sum - x;
        if(target < 0){
            return -1;
        }
        int windowSum = 0;
        int maxLen = -1;
        while(right < nums.length){
            windowSum += nums[right];
            right ++;
            while(windowSum > target){
                windowSum -= nums[left];
                left ++;
            }
            if(windowSum == target){
                maxLen = Math.max(maxLen,right - left);
            }
        }

        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
