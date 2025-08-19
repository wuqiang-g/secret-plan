package org.datastructure.api;

public class AllApi {
    public static void main(String[] args) {

        /**
         * 字符操作
         */
        Character c = 'c';
        //isLetterOrDigit 判断字符是数组or字母
        boolean letterOrDigit = Character.isLetterOrDigit(c);

        //转小写
        char lowerCase = Character.toLowerCase(c);

        //转大写
        char upperCase = Character.toUpperCase(c);

        /**
         * 字符串操作
         */
        String s = "xxxxx";
        //左闭右开区间[0,3)
        String substring = s.substring(0, 3);
    }
}
