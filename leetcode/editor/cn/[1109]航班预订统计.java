
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        Difference difference = new Difference(res);
        for(int[] booking : bookings){
            int i = booking[0] -1;
            int j = booking[1] -1;
            int value = booking[2];
            difference.addValue(i,j,value);
        }
        return difference.getNums();
    }

    class Difference {
        int [] diff;

        //差分数组初始化
        public Difference(int [] nums){
            diff = new int[nums.length];
            diff[0] = nums[0];
            for(int i = 1;i < nums.length;i++){
                diff[i] = nums[i] - nums[i-1];
            }
        }

        //给nums 在[i,j]的区间内加上value
        public void addValue(int i,int j,int value){
            diff[i] += value;
            if (j+1 < diff.length){
                diff[j+1] -= value;
            }
        }

        public int[] getNums(){
            int[] res = new int[diff.length];
            res[0] = diff[0];
            for(int i = 1; i < diff.length ; i++ ){
                res[i] = diff[i] + res[i-1];
            }
            return res;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
