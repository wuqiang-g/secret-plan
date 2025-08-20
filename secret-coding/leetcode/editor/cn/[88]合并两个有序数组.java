
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //这道题的核心是从后往前合并，应为后面是空的
        int p1 = m-1 , p2 = n-1;
        int i = nums1.length - 1;
        while(p1 >= 0 && p2 >= 0){
            int val1 = nums1[p1];
            int val2 = nums2[p2];
            if(val2 > val1){
                nums1[i] = val2;
                p2--;
            }else{
                nums1[i] = val1;
                p1--;
            }
            i--;
        }
        //这里补个丁，两边不一样长，则继续循环
        while(p2 >=0){
            nums1[i] = nums2[p2];
            p2--;
            i--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
