package com.alex.andreiev.arrays.easy;

/*
You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
All the scores are guaranteed to be unique.
The athletes are placed based on their scores, where the 1st place athlete has the highest score,
the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
    The 1st place athlete's rank is "Gold Medal".
    The 2nd place athlete's rank is "Silver Medal".
    The 3rd place athlete's rank is "Bronze Medal".
    For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
Return an array answer of size n where answer[i] is the rank of the ith athlete.

Example 1:
Input: score = [5,4,3,2,1]
Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].

Example 2:
Input: score = [10,3,8,9,4]
Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

Constraints:
    n == score.length
    1 <= n <= 104
    0 <= score[i] <= 106
    All the values in score are unique.
 */

import java.util.*;
import java.util.stream.Stream;

public class RelativeRanks_506 {

    // array as Map
    // 3 ms
    public String[] findRelativeRanks(int[] score) {
        int N = score.length;

        // Add the original index of each score to the array
        // Where the score is the key
        var M = Arrays.stream(score).max().getAsInt();
        var scoreToIndex = new int[M + 1];
        for (int i = 0; i < N; i++) {
            scoreToIndex[score[i]] = i + 1;
        }

        final String[] MEDALS = {"Gold Medal", "Silver Medal", "Bronze Medal"};

        // Assign ranks to athletes
        var rank = new String[N];
        var place = 1;
        for (var i = M; i >= 0; i--) {
            if (scoreToIndex[i] != 0) {
                var originalIndex = scoreToIndex[i] - 1;
                if (place < 4) {
                    rank[originalIndex] = MEDALS[place - 1];
                } else {
                    rank[originalIndex] = String.valueOf(place);
                }
                place++;
            }
        }
        return rank;
    }

    // priority Queue
    // 9 ms
//    public String[] findRelativeRanks(int[] score) {
//        var heap = new PriorityQueue<AbstractMap.SimpleEntry<Integer, Integer>>(
//            score.length, (a, b) -> b.getKey() - a.getKey());
//
//        for (var i = 0; i < score.length; i++) {
//            heap.add(new AbstractMap.SimpleEntry<>(score[i], i));
//        }
//
//        var result = new String[score.length];
//        int place = 1;
//        while (!heap.isEmpty()) {
//            var pair = heap.poll();
//            var originalIndex = pair.getValue();
//            if (place == 1) {
//                result[originalIndex] = "Gold Medal";
//            } else if (place == 2) {
//                result[originalIndex] = "Silver Medal";
//            } else if (place == 3) {
//                result[originalIndex] = "Bronze Medal";
//            } else {
//                result[originalIndex] = String.valueOf(place);
//            }
//            place++;
//        }
//        return result;
//    }


    // 7 ms
//    public String[] findRelativeRanks(int[] score) {
//        var arr = Arrays.copyOf(score, score.length);
//        Arrays.sort(arr);
//
//        var map = new HashMap<Integer, String>(arr.length);
//
//        for (var i = arr.length - 1; i >= 0 ; i--) {
//            if (i == arr.length - 1) {
//                map.put(arr[i], "Gold Medal");
//            } else if (i == arr.length - 2) {
//                map.put(arr[i], "Silver Medal");
//            } else if (i == arr.length - 3) {
//                map.put(arr[i], "Bronze Medal");
//            } else {
//                map.put(arr[i], String.valueOf(arr.length - i));
//            }
//        }
//
//        var result = new String[score.length];
//        for (var i = 0; i < score.length; i++) {
//            result[i] = map.get(score[i]);
//        }
//
//        return result;
//    }
}
