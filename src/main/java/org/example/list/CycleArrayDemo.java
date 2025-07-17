package org.example.list;

/**
 * 环形数组
 */
public class CycleArrayDemo {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        int i = 0;

        while (i < arr.length){
            System.out.println(arr[i]);
            i = (i + 1) % arr.length;
        }
    }
}
