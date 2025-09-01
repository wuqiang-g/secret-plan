
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
        int p1 = 0;
        int p2 = 0;
        //这里注意，数组的长度是length 不是length()
        while(p2 < nums.length){
            //这里核心是，如果不相等
            //慢指针往后走，把后面快指针找到不相等的值移到前面来，移到第一个之前一直相等后的第一个不相等的值
            //case 111223 好理解
            if(nums[p1] != nums[p2]){
                p1++;
                nums[p1] = nums[p2];
            }
            p2++;
        }
        return p1 + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
