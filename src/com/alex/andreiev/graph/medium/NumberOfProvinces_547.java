package com.alex.andreiev.graph.medium;

import java.util.HashSet;

public class NumberOfProvinces_547 {

    // 1 ms
    int[] cities;
    int[] rank;

    public int findCircleNum(int[][] isConnected) {
        var n = isConnected.length;
        cities = new int[n];
        rank = new int[n];
        for (var i = 0; i < n; i++) {
            cities[i] = i;
        }

        var provCount = n;
        for (var i = 0; i < n; i++) {
            for (var j = i+1; j < n; j++) {
                if (isConnected[i][j] == 1 && !isConnected(i, j)) {
                    provCount--;
                    union(i, j);
                }
            }
        }

        return provCount;
    }

    int find(int city) {
        if (cities[city] == city) {
            return city;
        }
        return cities[city] = find(cities[city]);
    }

    void union(int city1, int city2) {
        var rootX = find(city1);
        var rootY = find(city2);
        if (rootX != rootY) {
            if (rank[rootX] > rank[rootY]) {
                cities[rootY] = cities[rootX];
            } else if (rank[rootX] < rank[rootY]) {
                cities[rootX] = cities[rootY];
            } else {
                cities[rootY] = cities[rootX];
                rank[rootX]++;
            }
        }
    }

    boolean isConnected(int city1, int city2) {
        return find(city1) == find(city2);
    }
}
