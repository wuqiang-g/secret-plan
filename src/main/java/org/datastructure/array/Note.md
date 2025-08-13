# 数组算法笔记
## 双指针技巧解决7道题

### 1. 快慢指针技巧
        原地修改
        【26】删除有序数组中的重复项
        【27】移除元素
        【283】移动零
##### 滑动窗口
        主要解决查找子串问题
        tips: 滑动窗口技巧
            1. 什么时候右移right扩大窗口？窗口加入字符时，应该更新哪些数据？
            2. 什么时候窗口应该暂停扩大，开始移动 left 缩小窗口？从窗口移出字符时，应该更新哪些数据？
            3. 什么时候应该更新结果？
        【76】最小覆盖子串
        【567】字符串排列
        【438】找所有字母异位词
        【3】最长无重复子串
```
// 索引区间 [left, right) 是窗口
int left = 0, right = 0;

while (right < nums.size()) {
// 增大窗口
window.addLast(nums[right]);
right++;

    while (window needs shrink) {
        // 缩小窗口
        window.removeFirst(nums[left]);
        left++;
    }
}
```
### 2. 左右指针技巧
#### 二分搜索
tips: [left,right]理解左右指针的开闭，如果是闭，则重新给左右指针赋值就需要mid加减1。
同时要根据开闭，来确保while的结束，如果闭[left,right] 则while(left <= right) while结束是left > right

