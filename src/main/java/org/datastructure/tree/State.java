package org.datastructure.tree;

/**
 * 带权重维护的节点
 */
public class State {
    //节点
    TreeNode node;

    //权重，到父节点之间的距离
    int depth;

    public State(TreeNode node, int depth) {
        this.node = node;
        this.depth = depth;
    }
}
