package org.datastructure.tree;

/**
 * <a href="https://labuladong.online/algo/data-structure-basic/binary-tree-basic/#%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F">二叉树</a>
 * 二叉树(Binary tree)：可以拥有左右两个节点，【递归】思维方式的代表
 * 满二叉树：每一层（h）都是满的，总节点数 = 2^h - 1
 * 完全二叉树：除了最后一层可以不满，其他层都必须满，最后一层不管满不满，都集中在左边。
 * 二叉搜索树(Binary search tree BST)：左小右大，且左指的是左边的所有节点，不单单指左边连接的节点。查询效率高。
 * 高度平衡二叉树：每一个节点的左右子节点高度差小于等于1（<=1）,特性：假设节点数N,则高度 h = O(log N) 这种树增删改查效率高
 * 自平衡二叉树：增删节点之后，树始终保持高度平衡，典型的实现方式红黑树（自平衡二叉搜索树。）
 *
 */
public class TreeNodeDemo {

    public static void main(String[] args) {

        //二叉树构建
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // 构建出来的二叉树是这样的：
        //     1
        //    / \
        //   2   3
        //  /   / \
        // 4   5   6
    }
}
