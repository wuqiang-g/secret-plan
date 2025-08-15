
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int left = 0;
        int right = 0;
        HashSet<Integer> window =  new HashSet<>();
        while(right < nums.length){
            if(window.contains(nums[right])){
                return true;
            }
            window.add(nums[right]);
            right++;
            while(right - left > k && left < right){
                window.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
