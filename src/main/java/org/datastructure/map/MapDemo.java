package org.datastructure.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * <a href="https://labuladong.online/algo/data-structure-basic/hashmap-basic/">哈希表原理</a>
 * 可以理解为加强版数组，通过key 哈希得到索引，通过索引得到值。所以访问速度依赖哈希算法。
 *  哈希冲突 ：不同的key 可能得到相同的索引
 *     解法，在同一个索引位搞个链表(拉链法)
 *     数组 + 链表 ||  数组 + 链表 + 红黑树
 *  扩容&负载因子 ：如果不扩容，冲突就越严重，链表的长度会不断增加，导致性能下降，需要负载因子来衡量哈希表的容量 size / table.length
 *  不能依赖hashMap的遍历顺序，不是按插入顺序固定，且map扩容之后顺序会再次变化。
 *  可以看看HashMap源码
 */
public class MapDemo {

    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
    }
}
