
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        int left = 0, right = 0;
        TreeSet<Integer> window = new TreeSet<>();
        while(right < nums.length){
            Integer ceil = window.ceiling(nums[right]);
            if(null != ceil && (long)ceil - nums[right] <= valueDiff){
                return true;
            }
            Integer floor = window.floor(nums[right]);
            if(null != floor && (long)nums[right] - floor <= valueDiff){
                return true;
            }
            window.add(nums[right]);
            right++;
            while(right - left > indexDiff){
                window.remove(nums[left]);
                left ++;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
