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