
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //这里注意要从1开始，最少一个小时.
        //f(x) = h x是速度，f(x)是吃完所有香蕉的时间，target = h.
        int left = 1;
        int right = 1000000000;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(f(piles,mid) > h){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }

    public long f(int[] piles, int x){
        long hour = 0;
        for(int i = 0 ; i < piles.length ; i++){
            hour = hour + piles[i] / x;
            if(piles[i] % x > 0){
                hour++;
            }
        }
        return hour;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
