package org.datastructure.api;

import java.util.ArrayList;

public class StringApi {
    public static void main(String[] args) {

        /**
         * 1. 字符操作
         */
        Character c = 'c';
        // isLetterOrDigit 判断字符是数组or字母
        boolean letterOrDigit = Character.isLetterOrDigit(c);

        //转小写
        char lowerCase = Character.toLowerCase(c);

        //转大写
        char upperCase = Character.toUpperCase(c);

        //数字 0-25 转26个小写字母
        int val = 1;
        char letter = (char) ('A' + val);

        /**
         * 2. 字符串操作
         */
        String s = "xxxxx";
        //左闭右开区间[0,3)
        String substring = s.substring(0, 3);

        //将链表通过字符凭借掐来
        ArrayList<String> strings = new ArrayList<>();
        String join = String.join("->",strings);

        /**
         * StringBuilder 工具集
         */
        StringBuilder sb = new StringBuilder();
        //往后追加,可以加任务基础类型数据
        sb.append("xxxx");
        sb.append(1);

        //删除指定[0,3) 删除指定区间的数组
        sb.delete(0,3);
        //删除最后一个字符
        sb.deleteCharAt(sb.length()-1);
        //反转
        sb.reverse();
        //转成字符串
        String string = sb.toString();


    }
}
