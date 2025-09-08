package org.questions.array;

/**
 * 差分数组
 * 确实是精妙的结构
 */
public class Difference {
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
