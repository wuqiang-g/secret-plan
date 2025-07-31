package org.datastructure.tree;

import java.util.List;

/**
 * 多叉树节点
 * <a href="https://labuladong.online/algo/data-structure-basic/n-ary-tree-traverse-basic/">...</a>
 */
public class Node {

    int val;

    List<Node> children;

    public Node(int val){
        this.val = val;
    }
}
