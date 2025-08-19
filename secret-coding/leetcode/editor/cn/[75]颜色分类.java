
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void sortColors(int[] nums) {
        //还是有点难的，没有套路，没练习过就不会
        // 注意区间的开闭，初始化时区间内应该没有元素
        // 所以我们定义 [0，p0) 是元素 0 的区间，(p2, nums.length - 1] 是 2 的区间
        int p0 = 0, p2 = nums.length - 1;
        int p = 0;
        // 由于 p2 是开区间，所以 p <= p2
        while (p <= p2) {
            if (nums[p] == 0) {
                swap(nums, p0, p);
                p0++;
            } else if (nums[p] == 2) {
                swap(nums, p2, p);
                p2--;
            } else if (nums[p] == 1) {
                p++;
            }

            // 因为小于 p0 都是 0，所以 p 不要小于 p0
            if (p < p0) {
                p = p0;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
