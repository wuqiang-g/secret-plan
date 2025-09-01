
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0;
        int p2 = 0;
        while(p2 < nums.length){
            if(nums[p2] != val){
                //好用的的例子[3345] 3
                nums[p1] = nums[p2];
                //这里有点奇怪，有一些阶段，慢指针反而走到前面去了。
                p1++;
            }
            p2++;
        }
        return p1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
