package org.datastructure.api;

import java.util.TreeSet;

public class TreeSetApi {
    public static void main(String[] args) {
        //treeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        //特性能按照从小到大的顺序存储
        //添加
        treeSet.add(1);
        treeSet.add(2);
        //删除
        treeSet.remove(1);
        //找出【大于】入参的最小值
        Integer higher = treeSet.higher(0);
        //找出【小于】入参的最大值
        Integer lower = treeSet.lower(0);
        //天花板，找出【大于等于】入参的最小值
        Integer ceiling = treeSet.ceiling(0);

        //地板，找出【小于等于】入参的最大值
        Integer floor = treeSet.floor(0);

        //获取【最小值】
        Integer first = treeSet.first();

        //获取【最大值】
        Integer last = treeSet.last();

        //获取【最小值】并删除
        Integer i = treeSet.pollFirst();

        //获取【最大值】并删除
        Integer j = treeSet.pollLast();
    }
}
