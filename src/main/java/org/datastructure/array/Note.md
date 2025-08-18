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
    滑动窗口练习题
    【1658】将 x 减到 0 的最小操作数
    【713】乘积小于 K 的子数组 （LCR009）
    tips:上面两题是都是正数，才可以用滑动窗口
    【1004】最大连续1的个数 III
    【424】替换后的最长重复字符
    tips:上面两题的机器，结果更新是左右都操作完，说明左收缩是
    大于或者小于某个值时，关键是写出这个值的表达式
    【219】存在重复元素 II
    【220】存在重复元素 III
    【209】长度最小的子数组
    【395】至少有 K 个重复字符的最长子串
        395这道题的关键在于构造一个缩小的条件，原图没有，
        则限制每次滑动只能窗口内的字符数量不能大于i个，一共26种情况
    
### 2. 左右指针技巧
#### 二分搜索
    tips: [left,right]理解左右指针的开闭，如果是闭，则重新给左右指针赋值就需要mid加减1。
    同时要根据开闭，来确保while的结束，如果闭[left,right] 则while(left <= right) while结束是left > right
#### 二分搜索三种方法（找种值，找有效最左值，找有效最右值）

```
int binary_search(int[] nums, int target) {
    int left = 0, right = nums.length - 1; 
    while(left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1; 
        } else if(nums[mid] == target) {
            // 直接返回
            return mid;
        }
    }
    // 直接返回
    return -1;
}

int left_bound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else if (nums[mid] == target) {
            // 别返回，锁定左侧边界
            right = mid - 1;
        }
    }
    // 判断 target 是否存在于 nums 中
    if (left < 0 || left >= nums.length) {
        return -1;
    }
    // 判断一下 nums[left] 是不是 target
    return nums[left] == target ? left : -1;
}

int right_bound(int[] nums, int target) {
    int left = 0, right = nums.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (nums[mid] < target) {
            left = mid + 1;
        } else if (nums[mid] > target) {
            right = mid - 1;
        } else if (nums[mid] == target) {
            // 别返回，锁定右侧边界
            left = mid + 1;
        }
    }
    // 由于 while 的结束条件是 right == left - 1，且现在在求右边界
    // 所以用 right 替代 left - 1 更好记
    if (right < 0 || right >= nums.length) {
        return -1;
    }
    return nums[right] == target ? right : -1;
}
```

### 二分搜索运用
    核心：抽象题目找到一个f(x)函数，函数是单调减or增函数，x是要求的值，
    target是给定的值 找到f(x) = targert x的最小值或者最大值
    还有就是x的left 和 right得根据题目边界设定
    【875】爱吃香蕉的珂珂
    【1011】在 D 天内送达包裹的能力
    【410】分割数组

