package org.datastructure.array;

/**
 *  * 环形数组 [_,_,_) 左开右闭 【start,end)
 *  * 头部添加元素相比较普通数组少，O(1) 时间复杂度
 */
public class CycleArray<T> {

    private T[] arr;
    private int start;
    private int end;
    // 数组中元素的数量
    private int count;
    //数组大小
    private int size;

    @SuppressWarnings("unchecked")
    public CycleArray(int size) {
        this.size = size;
        // 因为 Java 不支持直接创建泛型数组，所以这里使用了类型转换
        this.arr = (T[]) new Object[size];
        // start 指向第一个有效元素的索引，闭区间
        this.start = 0;
        // 切记 end 是一个开区间，
        // 即 end 指向最后一个有效元素的下一个位置索引
        this.end = 0;
        this.count = 0;
    }

    // 自动扩缩容辅助函数
    @SuppressWarnings("unchecked")
    private void resize(int newSize) {
        // 创建新的数组
        T[] newArr = (T[]) new Object[newSize];
        // 将旧数组的元素复制到新数组中
        for (int i = 0; i < count; i++) {
            newArr[i] = arr[(start + i) % size];
        }
        arr = newArr;
        // 重置 start 和 end 指针
        start = 0;
        end = count;
        size = newSize;
    }

    /**
     * 总结：
     *  获取前一个位置索引，是-1 为了避免负数 index = （index - 1 + size）% size
     *  获取后一个位置索引，是+1 为了避免超出数组长度 index = (index + 1) % size
     * @param val
     */

    // 在数组头部添加元素，时间复杂度 O(1)
    public void addFirst(T val) {
        // 当数组满时，扩容为原来的两倍
        if (isFull()) {
            resize(size * 2);
        }
        // 因为 start 是闭区间，所以先左移，再赋值
        // 往前肯定是指针前移一位，但是可能为负数，所以要 -1 加上 size 再求余
        start = (start - 1 + size) % size;
        arr[start] = val;
        count++;
    }

    // 在数组尾部添加元素，时间复杂度 O(1)
    public void addLast(T val) {
        if (isFull()) {
            resize(size * 2);
        }
        // 因为 end 是开区间，所以先赋值，再右移
        arr[end] = val;
        //往后移动一位，不可能为负数，直接 + 1 求余
        end = (end + 1) % size;
        count++;
    }

    //在数组头部删除元素
    public void removeFirst() {
        if (isEmpty()) {
            throw new RuntimeException("CycleArray is empty");
        }
        // 因为 start 是闭区间，所以先赋值，再右移
        arr[start] = null;
        start = (start + 1) % size;
        count--;
    }

    //在数组尾部删除元素
    public void removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("CycleArray is empty");
        }
        // 因为 end 是开区间，所以先左移，再赋值
        end = (end - 1 + size) % size;
        arr[end] = null;
        count--;
    }

    // 获取数组头部元素，时间复杂度 O(1)
    public T getFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        return arr[start];
    }

    // 获取数组尾部元素，时间复杂度 O(1)
    public T getLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Array is empty");
        }
        return arr[(end - 1 + size) % size];
    }


    public boolean isFull() {
        return count == size;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }
}
