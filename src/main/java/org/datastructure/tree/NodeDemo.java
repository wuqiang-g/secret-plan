package org.datastructure.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 多叉树的递归遍历和层序遍历，和二叉树的遍历基本一致，唯一区别处理左右子节点变成了for循环处理所有子节点
 * <a href="https://labuladong.online/algo/data-structure-basic/n-ary-tree-traverse-basic/">...</a>
 * 补充概念：
 *  森林(forest)：多棵多叉树  List<Node> roots
 *  森林遍历就是循环遍历所有子树
 */
public class NodeDemo {
    public static void main(String[] args) {

    }

    /**
     * 递归遍历
     * @param root
     */
    public static void traverse(Node root) {
        if (null == root){
            return;
        }
        //前序遍历
        System.out.println(root.val);
        for(Node child : root.children){
            traverse(child);
        }
        //后序遍历
        System.out.println(root.val);
    }

    /**
     * 层序遍历1 不带深度
     * @param root
     */
    public static void fuc1(Node root){
        if (null == root){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            // 访问 cur 节点
            System.out.println(cur.val);
            // 把 cur 的左右子节点加入队列
            for(Node child : cur.children){
                queue.offer(child);
            }
        }
    }

    /**
     * 层序遍历2 带深度
     * @param root
     */
    public static void fuc2(Node root){
        if (null == root){
            return;
        }
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        int depth = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                Node cur = queue.poll();
                // 访问 cur 节点
                System.out.println("第"+depth+"层:"+cur.val);
                // 把 cur 的左右子节点加入队列
                for(Node child : cur.children){
                    queue.offer(child);
                }
            }
            depth++;
        }
    }

}
