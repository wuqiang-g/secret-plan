package org.datastructure.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 有向加权图，领接表实现
 * 如果不用加权的话，则不用对象，用Integer代表指向节点即可
 * 无向图的话，相当于增删的时候，多加一条边，无向图相当于双向图。
 */
public class GraphDemo {

    //领接表,索引是当前节点编号,List<Edge> 存储当前节点指向的节点
    //也可以Map<Integer, List<Edge>> graph;
    List<Edge>[] graph;

    //边
    class Edge{
        //指向
        int to;
        //权重
        int wight;
        public Edge(int to, int wight) {
            this.to = to;
            this.wight = wight;
        }
    }

    public GraphDemo(int n) {
        graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
    }

    // 增，添加一条带权重的有向边，复杂度 O(1)
    public void addEdge(int from, int to, int weight) {
        graph[from].add(new Edge(to, weight));
    }

    // 删，删除一条有向边，复杂度 O(V)
    public void removeEdge(int from, int to) {
        for(Edge edge : graph[from]) {
            if (edge.to == to) {
                graph[from].remove(edge);
                break;
            }
        }
    }

    // 查，判断两个节点是否相邻，复杂度 O(V)
    public boolean hasEdge(int from, int to) {
        for(Edge edge : graph[from]) {
            if (edge.to == to) {
                return true;
            }
        }
        return false;
    }

    // 查，返回一条边的权重，复杂度 O(V)
    public int weight(int from, int to) {
        for(Edge edge : graph[from]) {
            if (edge.to == to) {
                return edge.wight;
            }
        }
        return -1;
    }

    // 查，返回某个节点的所有邻居节点，复杂度 O(1)
    public List<Edge> neighbors(int v) {
        return graph[v];
    }
}
