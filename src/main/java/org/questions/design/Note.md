# 数据结构设计

## [LRU算法](https://labuladong.online/algo/data-structure/lru-cache/)

    最近使用的在最前面，get put O(1)时间复杂的，LinkedHashMap实现
    get put 都需要把元素提到前面，超过大小，把最早的去掉。


习题：

[146. LRU 缓存](https://leetcode.cn/problems/lru-cache/)

----

## [LRU算法](https://labuladong.online/algo/frequency-interview/lfu/)

    也是LinkedHasp实现，使用评率最多的在最前面，使用频率相同，则淘汰时间早的
    比较复杂 需要维护 
    HashMap kv 表
    HashMap keyAndFreq kf表
    HashMao<？,LinkedHashSet<>> freqMapKeys fk表
    int minFreq 当前最小频次.
    
习题：

[460. LFU 缓存](https://leetcode.cn/problems/lfu-cache/description/)

---



