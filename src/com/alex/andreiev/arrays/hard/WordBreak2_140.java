package com.alex.andreiev.arrays.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Given a string s and a dictionary of strings wordDict, add spaces in s
to construct a sentence where each word is a valid dictionary word.
Return all such possible sentences in any order.
Note that the same word in the dictionary may be reused multiple times in the segmentation.

Example 1:
Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]

Example 2:
Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.

Example 3:
Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []

Constraints:
    1 <= s.length <= 20
    1 <= wordDict.length <= 1000
    1 <= wordDict[i].length <= 10
    s and wordDict[i] consist of only lowercase English letters.
    All the strings of wordDict are unique.
    Input is generated in a way that the length of the answer doesn't exceed 105.
 */
public class WordBreak2_140 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        var resultList = new ArrayList<String>();
        backtracking(s, wordDict, 0, 0, resultList, new ArrayList<String>());
        return resultList;
    }

    void backtracking(String s, List<String> wordDict, int startPos, int endPos, List<String> resultList, List<String> subList) {
        if (endPos == s.length()) {
            if (!subList.isEmpty() && startPos == endPos) {
                resultList.add(String.join(" ", subList));
            }
            return;
        }

        var subStr = s.substring(startPos, endPos+1);
        if (wordDict.contains(subStr)) {
            subList.add(subStr);
            backtracking(s, wordDict, endPos+1, endPos+1, resultList, subList);

            subList.removeLast();
        }

        backtracking(s, wordDict, startPos, endPos+1, resultList, subList);
    }
}
