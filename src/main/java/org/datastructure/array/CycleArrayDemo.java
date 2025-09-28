package org.datastructure.array;

/**
 * 数组成环
 * <a href="https://labuladong.online/algo/data-structure-basic/cycle-array/#%E7%8E%AF%E5%BD%A2%E6%95%B0%E7%BB%84%E5%8E%9F%E7%90%86">环形数组</a>
 */
public class CycleArrayDemo {


    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        int i = 0;

        while (i < arr.length){
            System.out.println(arr[i]);
            /**
             * 重点：下一个值（i+1）需要成环的话，则对数组长度取余。
             */
            i = (i + 1) % arr.length;
        }
    }
}
