package org.datastructure.tree;

/**
 * 递归遍历
 * <a href="https://labuladong.online/algo/data-structure-basic/binary-tree-traverse-basic/#%E9%80%92%E5%BD%92%E9%81%8D%E5%8E%86-dfs">...</a>
 * 每个节点在递归函数中，都会经过三次访问，刚进入，左子树访问结束返回，右子树访问结束返回
 * 前序遍历：刚进入打印
 * 中序遍历：左子树访问结束打印
 * 后序遍历：左右子树都访问完打印。
 * 知识点：二叉搜索树（BST）的中序遍历一定是有序的。
 */
public class RecursionTraverseDemo {
    public static void main(String[] args) {
        // 构建出来的二叉树是这样的：
        //     1
        //    / \
        //   2   3
        //  /   / \
        // 4   5   6

        //前序：1 2 4 3 5 6
        //中序：4 2 1 5 3 6
        //后序：4 2 5 6 3 1
    }

    public void traverse(TreeNode root){
        if (root == null){
            return;
        }
        //这里打印，前序
        traverse(root.left);
        //这里打印，中序
        traverse(root.right);
        //这里打印，后序
    }
}
