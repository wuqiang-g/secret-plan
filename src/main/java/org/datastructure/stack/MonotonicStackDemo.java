package org.datastructure.stack;

import java.util.Stack;

/**
 * 单调栈,解决下一个最值问题。
 * 注意 ！！！是下一个最值问题，不是后面所有值的最值问题。
 * 技巧，从后往前遍历，比较栈顶元素，如果栈顶小，则出栈，直到找到下一个最值，如果栈空，则代表后面没有比他大的值了。
 */
public class MonotonicStackDemo {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,2,4,3};
        int[] ints = calculateGreaterElement(nums);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static  int[] calculateGreaterElement(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = nums.length -1 ; i >= 0 ;i --){
            while(!stk.isEmpty() && stk.peek() <= nums[i]){
                stk.pop();
            }
            res[i] = stk.isEmpty() ? -1 : stk.peek();
            stk.push(nums[i]);
        }
        return res;
    }
}
