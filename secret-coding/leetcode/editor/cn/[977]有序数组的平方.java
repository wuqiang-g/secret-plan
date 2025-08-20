
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0 , right = nums.length - 1;
        int i = res.length - 1;
        while(left <= right){
            int l = Math.abs(nums[left]);
            int r = Math.abs(nums[right]);
            //这里核心比的是绝对值大小，因为数组有序，
            //然后从结果后面开始保存。
            if(r > l){
                res[i] = r*r;
                right --;
            }else{
                res[i] = l*l;
                left++;
            }
            i--;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
