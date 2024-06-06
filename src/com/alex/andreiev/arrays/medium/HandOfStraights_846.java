package com.alex.andreiev.arrays.medium;

import java.util.HashMap;
import java.util.PriorityQueue;

/*
Alice has some number of cards and she wants to rearrange the cards into groups
so that each group is of size groupSize, and consists of groupSize consecutive cards.
Given an integer array hand where hand[i] is the value written on the ith card and an integer groupSize,
return true if she can rearrange the cards, or false otherwise.

Example 1:
Input: hand = [1,2,3,6,2,3,4,7,8], groupSize = 3
Output: true
Explanation: Alice's hand can be rearranged as [1,2,3],[2,3,4],[6,7,8]

Example 2:
Input: hand = [1,2,3,4,5], groupSize = 4
Output: false
Explanation: Alice's hand can not be rearranged into groups of 4.

Constraints:
    1 <= hand.length <= 104
    0 <= hand[i] <= 109
    1 <= groupSize <= hand.length
 */
public class HandOfStraights_846 {
    // reversed decrement
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        // HashMap to store the count of each card value
        var cardCount = new HashMap<Integer, Integer>();
        for (var card : hand) {
            cardCount.put(card, cardCount.getOrDefault(card, 0) + 1);
        }

        for (var card : hand) {
            int startCard = card;
            // Find the start of the potential straight sequence
            while (cardCount.getOrDefault(startCard - 1, 0) > 0) {
                startCard--;
            }

            // Process the sequence starting from startCard
            while (startCard <= card) {
                while (cardCount.getOrDefault(startCard, 0) > 0) {
                    // Check if we can form a consecutive sequence
                    // of groupSize cards
                    for (
                        var nextCard = startCard;
                        nextCard < startCard + groupSize;
                        nextCard++
                    ) {
                        if (cardCount.getOrDefault(nextCard, 0) == 0) {
                            return false;
                        }
                        cardCount.put(nextCard, cardCount.get(nextCard) - 1);
                    }
                }
                startCard++;
            }
        }

        return true;
    }

    // map
//    public boolean isNStraightHand(int[] hand, int groupSize) {
//        if (hand.length % groupSize != 0) {
//            return false;
//        }
//
//        var map = new HashMap<Integer, Integer>();
//        var min = Integer.MAX_VALUE;
//        for (var card : hand) {
//            map.put(card, map.getOrDefault(card, 0) + 1);
//            min = Math.min(min, card);
//        }
//
//        var start = -1;
//        while (!map.isEmpty()) {
//            if (start != -1) {
//                min = start;
//                start = -1;
//            }
//
//            var cur = map.get(min);
//            while (cur == null) {
//                cur = map.get(++min);
//            }
//            map.remove(min++);
//
//            for (var i = 1; i < groupSize; i++) {
//                var val = map.get(min);
//                if (val == null || val < cur) {
//                    return false;
//                }
//
//                var diff = val - cur;
//                if (diff == 0) {
//                    map.remove(min);
//                } else {
//                    map.put(min, diff);
//                    if (start == -1) {
//                        start = min;
//                    }
//                }
//
//                min++;
//            }
//
//        }
//
//        return true;
//    }
}
