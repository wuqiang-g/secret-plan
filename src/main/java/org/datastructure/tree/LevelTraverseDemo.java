package org.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 层序遍历 : 顾名思义，一层一层，由左往右遍历
 * <a href="https://labuladong.online/algo/data-structure-basic/binary-tree-traverse-basic/#%E5%B1%82%E5%BA%8F%E9%81%8D%E5%8E%86-bfs">...</a>
 *
 */
public class LevelTraverseDemo {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        // 构建出来的二叉树是这样的：
        //     1
        //    / \
        //   2   3
        //  / \
        // 4   5

        //层序遍历方式1
        fuc1(treeNode);

        //层序遍历方式2
        fuc2(treeNode);

        //层序遍历方式3
        fuc3(treeNode);
    }

    /**
     * 借助队列实现，实现简单，缺点不知道在那一层
     * @param root 根节点
     */
    public static void fuc1(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            // 访问 cur 节点
            System.out.println(cur.val);

            // 把 cur 的左右子节点加入队列
            if (cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    /**
     * 👍🏻 常用
     * 借助队列实现，fuc1的改进，记录层数，记录每层数量，每层结束，层数加1
     * @param root 根节点
     */
    public static void fuc2(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        //默认深度是1
        int depth = 1;
        while (!queue.isEmpty()){
           int size = queue.size();
           for(int i = 0; i < size ; i++){
               TreeNode cur = queue.poll();
               System.out.println("第" + depth + "层：" + cur.val);
               if (cur.left != null){
                   queue.offer(cur.left);
               }
               if (cur.right != null){
                   queue.offer(cur.right);
               }
           }
           depth++;
        }
        System.out.println("层数：" + (depth -1));
    }

    /**
     * 层序遍历方式3
     * 借助队列实现，fuc2的特殊形式，上面每一层默认是depth是1，相当与当前节点到父节点之间的距离固定是1，不能改
     * 假设要自定义不同的到父节点之间的距离，那么就需要每个节点单独维护depth
     * @param root 根节点
     */
    public static void fuc3(TreeNode root){
        if (root == null){
            return;
        }
        Queue<State> queue = new LinkedList<>();
        queue.offer(new State(root,1));

        while (!queue.isEmpty()){
            State cur = queue.poll();
            // 访问 cur 节点，同时知道它的路径权重和
            System.out.println("depth = " + cur.depth + ", val = " + cur.node.val);

            // 把 cur 的左右子节点加入队列
            if (cur.node.left != null){
                queue.offer(new State(cur.node.left,cur.depth + 2));
            }

            if (cur.node.right != null){
                queue.offer(new State(cur.node.right,cur.depth + 3));
            }
        }
    }
}
