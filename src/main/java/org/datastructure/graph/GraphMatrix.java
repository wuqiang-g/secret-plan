package org.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 有向加权图，领接矩阵实现
 */
public class GraphMatrix {
    // 存储相邻节点及边的权重
    public static class Edge {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }

    // 领接矩阵. 索引是当前节点编号,matrix[x][y] 记录 x 是否有一条指向 y 的边,值是边权重
    private int[][] matrix;

    public GraphMatrix(int n) {
        matrix = new int[n][n];
    }

    public void addEdge(int from, int to, int weight) {
        matrix[from][to] = weight;
    }

    // 删，删除一条有向边，复杂度 O(1)
    public void removeEdge(int from, int to) {
        matrix[from][to] = 0;
    }

    // 查，判断两个节点是否相邻，复杂度 O(1)
    public boolean hasEdge(int from, int to) {
        return matrix[from][to] != 0;
    }

    // 查，返回一条边的权重，复杂度 O(1)
    public int weight(int from, int to) {
        return matrix[from][to];
    }

    // 查，返回某个节点的所有邻居节点，复杂度 O(V)
    public List<Edge> neighbors(int v) {
        List<Edge> res = new ArrayList<>();
        for (int i = 0; i < matrix[v].length; i++) {
            if (matrix[v][i] != 0) {
                res.add(new Edge(i, matrix[v][i]));
            }
        }
        return res;
    }

}
