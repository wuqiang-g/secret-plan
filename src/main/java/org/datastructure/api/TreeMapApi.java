package org.datastructure.api;

import java.util.TreeMap;

public class TreeMapApi {

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        treeMap.put(1,1);
        treeMap.put(2,2);
        treeMap.put(3,3);

        treeMap.remove(1);

        treeMap.get(2);

        /**
         * 小于key的最大值
         */
        treeMap.lowerKey(1);
        /**
         * 大于key的最小值
         */
        treeMap.higherKey(2);

        /**
         * floor地板，小于等于key的最大值
         */
        treeMap.floorKey(3);

        /**
         * ceiling天花板，大于等于key的最小值。
         */
        treeMap.ceilingKey(4);

        /**
         * 最小值key
         */
        treeMap.firstKey();

        /**
         * 最大值
         */
        treeMap.lastKey();
    }
}
