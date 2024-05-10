package com.alex.andreiev.graph.medium;

import com.alex.andreiev.utils.UnionFind;

import java.util.HashSet;

public class NumberOfProvinces_547 {

    // 1 ms
    public int findCircleNum(int[][] isConnected) {
        var n = isConnected.length;
        var uf = new UnionFind(n);

        var provCount = n;
        for (var i = 0; i < n; i++) {
            for (var j = i+1; j < n; j++) {
                if (isConnected[i][j] == 1 && !uf.isConnected(i, j)) {
                    provCount--;
                    uf.union(i, j);
                }
            }
        }

        return provCount;
    }
}
