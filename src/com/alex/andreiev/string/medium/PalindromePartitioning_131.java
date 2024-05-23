package com.alex.andreiev.string.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given a string s, partition s such that every substring of the partition is a palindrome.
Return all possible palindrome partitioning of s.

Example 1:
Input: s = "aab"
Output: [["a","a","b"],["aa","b"]]

Example 2:
Input: s = "a"
Output: [["a"]]

Constraints:
    1 <= s.length <= 16
    s contains only lowercase English letters.
 */

public class PalindromePartitioning_131 {

    // backtracking
    public List<List<String>> partition(String s) {
        var result = new ArrayList<List<String>>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int start, List<String> path, List<List<String>> result) {
        // If we've reached the end of the string, add the current partition to the result list
        if (start == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        // Explore all possible partitions
        for (var end = start + 1; end <= s.length(); end++) {
            // If the current substring is a palindrome, add it to the current path
            if (isPalindrome(s, start, end - 1)) {
                path.add(s.substring(start, end));
                // Recur to find other partitions
                backtrack(s, end, path, result);
                // Backtrack to explore other partitions
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int left, int right) {
        // Check if the substring s[left:right+1] is a palindrome
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    // dp
    // 8 ms
//    public List<List<String>> partition(String s) {
//        var n = s.length();
//        var dp = new boolean[n][n];
//
//        // Initialize the DP table for single characters and pairs
//        for (var i = 0; i < n; i++) {
//            dp[i][i] = true;
//        }
//        for (var length = 2; length <= n; length++) {
//            for (var i = 0; i <= n - length; i++) {
//                var j = i + length - 1;
//                if (s.charAt(i) == s.charAt(j) && (length == 2 || dp[i + 1][j - 1])) {
//                    dp[i][j] = true;
//                }
//            }
//        }
//
//        var result = new ArrayList<List<String>>();
//        backtrack(s, 0, new ArrayList<>(), result, dp);
//        return result;
//    }
//
//    private void backtrack(String s, int start, List<String> path, List<List<String>> result, boolean[][] dp) {
//        // If we've reached the end of the string, add the current partition to the result list
//        if (start == s.length()) {
//            result.add(new ArrayList<>(path));
//            return;
//        }
//        // Explore all possible partitions
//        for (var end = start; end < s.length(); end++) {
//            // Use the DP table to check if the substring s[start:end+1] is a palindrome
//            if (dp[start][end]) {
//                path.add(s.substring(start, end + 1));
//                // Recur to find other partitions
//                backtrack(s, end + 1, path, result, dp);
//                // Backtrack to explore other partitions
//                path.remove(path.size() - 1);
//            }
//        }
//    }
}
