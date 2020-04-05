package com.graphs;

import com.bags.Bag;
import java.util.List;

/**
 * This graph is an undirected graph, i.e. if a vertex v is reachable from vertex w,
 * then it implies that w is reachable from v
 */
public class Graph {
    private int V;
    private int E;
    private List<Bag<Integer>> adj; // adjacency list of vertices

    public Graph(int totalVertices) {
        if (totalVertices <= 0)
            throw new IllegalArgumentException("No. of vertices is zero or negative.");
        this.V = totalVertices;
        this.E = 0;

    }
}