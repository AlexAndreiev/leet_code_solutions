package com.alex.andreiev.utils;

public class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int length) {
        parent = new int[length];
        rank = new int[length];
        for (var i = 0; i < length; i++) {
            parent[i] = i;
            rank[i] = i;
        }
    }

    public int find(int city) {
        if (parent[city] == city) {
            return city;
        }
        return parent[city] = find(parent[city]);
    }

    public void union(int city1, int city2) {
        var rootX = find(city1);
        var rootY = find(city2);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = parent[rootX];
            } else if (rank[rootX] < rank[rootY]) {
                parent[rootX] = parent[rootY];
            } else {
                parent[rootY] = parent[rootX];
                rank[rootX]++;
            }
        }
    }

    public boolean isConnected(int city1, int city2) {
        return find(city1) == find(city2);
    }
}
