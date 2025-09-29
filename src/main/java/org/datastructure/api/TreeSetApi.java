package org.datastructure.api;

import java.util.TreeSet;

/**
 * 二叉搜索树，排序的树，特性能按照从小到大的顺序存储
 * api 快速找到大于)or小于入参的值，适用于找离入参最近的值。
 */
public class TreeSetApi {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        //
        /**
         * 添加是add 不是 push,底层实现自Collection
         */
        treeSet.add(1);
        treeSet.add(2);
        //删除
        treeSet.remove(1);

        /**
         * 找出【大于】入参的最小值
         */
        Integer higher = treeSet.higher(0);
        /**
         * 找出【小于】入参的最大值
         */
        Integer lower = treeSet.lower(0);
        /**
         * 天花板，找出【大于等于】入参的最小值
         */
        Integer ceiling = treeSet.ceiling(0);

        /**
         * 地板，找出【小于等于】入参的最大值
         */
        Integer floor = treeSet.floor(0);

        /**
         * 获取【最小值】
         */
        Integer first = treeSet.first();

        /**
         * 获取【最大值】
         */
        Integer last = treeSet.last();

        /**
         * 获取【最小值】并删除
         */
        Integer i = treeSet.pollFirst();

        /**
         * 获取【最大值】并删除
         */
        Integer j = treeSet.pollLast();
    }
}
