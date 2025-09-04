# 二叉树算法技巧
    无论以下那一种方式，思考：
    1. 单独抽出一个节点能做什么？
    2. 在什么时候做（前中后序位置）？
    其他交给递归函数。

## 技巧1：【遍历】一遍树得到答案
    
    遍历方式：traverse 函数无返回值，配合全局变量更新结果。
    
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        traverse(root.left);
        traverse(root.right);
    }
---
### 例题：

[226. 翻转二叉树](https://leetcode.cn/problems/invert-binary-tree/description/)

[116. 填充每个节点的下一个右侧节点指针](https://leetcode.cn/problems/populating-next-right-pointers-in-each-node/description/)

---
### [习题：](https://labuladong.online/algo/problem-set/binary-tree-traverse-i/)

[257. 二叉树的所有路径](https://leetcode.cn/problems/binary-tree-paths/description/)


[129. 求根节点到叶节点数字之和](https://leetcode.cn/problems/sum-root-to-leaf-numbers/description/)


[988. 从叶结点开始的最小字符串](https://leetcode.cn/problems/smallest-string-starting-from-leaf/description/)


[1022. 从根到叶的二进制数之和](https://leetcode.cn/problems/sum-of-root-to-leaf-binary-numbers/description/)


[1457. 二叉树中的伪回文路径](https://leetcode.cn/problems/pseudo-palindromic-paths-in-a-binary-tree/description/)

    
## 技巧2：【分解】子问题得到答案
    分解方式：build函数带返回值，返回子问题的答案。
    所以【分解】都在后序位置干活，能拿到子问题结果。

    int build(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = build(root.left);
        int right = build(root.right);
        return left + right + 1;
    }

-----
### 例题：

[114. 二叉树展开为链表](https://leetcode.cn/problems/flatten-binary-tree-to-linked-list/description/)

[654. 最大二叉树](https://leetcode.cn/problems/maximum-binary-tree/description/)

[105. 从前序与中序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/)

[106. 从中序与后序遍历序列构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-inorder-and-postorder-traversal/description/)

[889. 根据前序和后序遍历构造二叉树](https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-postorder-traversal/description/)

[652. 寻找重复的子树](https://leetcode.cn/problems/find-duplicate-subtrees/description/)

---
### [习题：](https://labuladong.online/algo/problem-set/binary-tree-divide-i/)

[]()

[]()

[]()

# 二叉树序列化与反序列化
    1. 有空节点信息，【前序】和【后序】遍历能构造唯一二叉树。
    2. 没有空节点信息，【前序 + 中序】和【中序 + 后序】信息能构造出唯一二叉树。
    
    前序遍历结果 ： 【root】【root.leftTree】【root.rightTree】
    中序遍历结果 ： 【root.leftTree】【root】【root.rightTree】
    后序遍历结果 ： 【root.leftTree】【root.rightTree】【root】

---

### 例题：
[297. 二叉树的序列化与反序列化](https://leetcode.cn/problems/serialize-and-deserialize-binary-tree/description/)

297题能用【前序】【后序】【层序】三种解法来做

[331. 验证二叉树的前序序列化](https://leetcode.cn/problems/verify-preorder-serialization-of-a-binary-tree/description/)

    