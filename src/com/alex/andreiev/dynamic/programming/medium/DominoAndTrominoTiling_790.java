package com.alex.andreiev.dynamic.programming.medium;

/*
You have two types of tiles: a 2 x 1 domino shape and a tromino shape.
You may rotate these shapes.
Given an integer n, return the number of ways to tile an 2 x n board.
Since the answer may be very large, return it modulo 109 + 7.
In a tiling, every square must be covered by a tile.
Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.

Example 1:
Input: n = 3
Output: 5
Explanation: The five different ways are show above.

Example 2:
Input: n = 1
Output: 1

Constraints:
    1 <= n <= 1000
 */

public class DominoAndTrominoTiling_790 {
    final long MOD = 1_000_000_007;

    // tabulation
    public int numTilings(int n) {
        var dp = new long[n+2][2];
        // base cases
        dp[1] = new long[] {1, 1};
        dp[2] = new long[] {2, 2};
        for(int i = 3; i <= n; i++) {
            dp[i][0] = (dp[i-1][0] + dp[i-2][0] + 2L*dp[i-2][1]) % MOD;
            dp[i][1] = (dp[i-1][0] + dp[i-1][1]) % MOD;
        }
        return (int) dp[n][0];
    }

    // space optimized
//    public int numTilings(int n) {
//        if (n <= 2) return n;
//        var filledPrev = 2L;
//        var gapPrev = 2L;
//        var filledPrev2 = 1L;
//        var gapPrev2 = 1L;
//        // filledPrev = dp[i-1][0], filledPrev2 = dp[i-2][0]...same for gapPrev & gapPrev2
//        for(var i = 3; i <= n; i++) {
//            var filled = (filledPrev + filledPrev2 + 2L * gapPrev2) % MOD;
//            var gap = (filledPrev + gapPrev) % MOD;
//
//            filledPrev2 = filledPrev;
//            filledPrev = filled;
//            gapPrev2 = gapPrev;
//            gapPrev = gap;
//        }
//        return (int)filledPrev;
//    }

    // simple
//    public int numTilings(int n) {
//        return (int) solve(0, n, false);
//    }
//
//    long solve(int i, int n, boolean isPrevGap) {
//        if (i > n) {
//            return 0;
//        }
//
//        if (i == n) {
//            return isPrevGap ? 0 : 1;
//        }
//
//        if (isPrevGap) {
//            return (solve(i+1, n, false) + solve(i+1, n, true)) % MOD;
//        }
//        return (solve(i+1, n, false) + solve(i+2, n, false) + 2L*solve(i+2, n, true)) % MOD;
//    }
}
