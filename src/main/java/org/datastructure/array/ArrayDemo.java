package org.datastructure.array;

public class ArrayDemo {

    public static void main(String[] args) {
        //1.初始化一个数组
        int[] arr = new int[10];

        for(int i = 0 ; i < 5 ; i++ ){
            arr[i] = i;
            System.out.println("i = " + arr[i]);
        }

        //2. 给索引访问 O(1)
        System.out.println("arr[3] = " + arr[3]);
        //2. 给值访问 O(n)
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] == 3){
                System.out.println("3 index = " + i);
            }
        }

        //3. 给索引修改 O(1)
        //3. 给值修改 O(n)

        //4. 数组末尾 加元素O(1) [0,4] 有值,在index = 5追加
        arr[5] = 5;
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("i = " + arr[i]);
        }

        //4 数组中间 加元素O(n) [0,5] 有值，在index = 3的位置追加
        for(int i = 5 ; i > 3 ; i--){
            arr[i] = arr[i-1];
        }
        arr[3] = 999;
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("i = " + arr[i]);
        }

        //5. 数组末尾删元素 [0,5] 有值，
        arr[5] = 0;
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("i = " + arr[i]);
        }

        //5. 数组中间删元素 [0,4] 有值，把index = 3删除
        for(int i = 3 ; i < 5 ; i++){
            arr[i] = arr[i + 1];
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("i = " + arr[i]);
        }
    }
}
