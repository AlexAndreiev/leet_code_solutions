package com.alex.andreiev.string.hard;

/*
In the video game Fallout 4, the quest "Road to Freedom" requires players
to reach a metal dial called the "Freedom Trail Ring" and use the dial to spell a specific keyword to open the door.
Given a string ring that represents the code engraved on the outer ring
and another string key that represents the keyword that needs to be spelled,
return the minimum number of steps to spell all the characters in the keyword.
Initially, the first character of the ring is aligned at the "12:00" direction.
You should spell all the characters in key one by one by rotating ring clockwise
or anticlockwise to make each character of the string key aligned at the "12:00" direction and then
by pressing the center button.

At the stage of rotating the ring to spell the key character key[i]:
    You can rotate the ring clockwise or anticlockwise by one place, which counts as one step.
    The final purpose of the rotation is to align one of ring's characters at the "12:00" direction,
    where this character must equal key[i].
    If the character key[i] has been aligned at the "12:00" direction,
    press the center button to spell, which also counts as one step.
    After the pressing, you could begin to spell the next character in the key (next stage).
    Otherwise, you have finished all the spelling.


Example 1:
Input: ring = "godding", key = "gd"
Output: 4
Explanation:
For the first key character 'g', since it is already in place, we just need 1 step to spell this character.
For the second key character 'd', we need to rotate the ring "godding" anticlockwise by two steps to make it become "ddinggo".
Also, we need 1 more step for spelling.
So the final output is 4.

Example 2:
Input: ring = "godding", key = "godding"
Output: 13

Constraints:
    1 <= ring.length, key.length <= 100
    ring and key consist of only lower case English letters.
    It is guaranteed that key could always be spelled by rotating ring.


 */

import java.util.*;

public class FreedomTrail_514 {

    // Dijkstra algorithm (shortest path)
    public int findRotateSteps(String ring, String key) {
        var ringLen = ring.length();
        var keyLen = key.length();

        // HashMap to store the indices of occurrences of each character in the ring
        var characterIndices = new HashMap<Character, List<Integer>>();
            for (var i = 0; i < ring.length(); i++) {
            var ch = ring.charAt(i);
            characterIndices.computeIfAbsent(ch, k -> new ArrayList<>()).add(i);
        }

        // Initialize the min heap (priority queue) with the starting point
        // Each element of the heap is an array of integers representing:
        // totalSteps, ringIndex, keyIndex
        var heap = new PriorityQueue<int[]>(Comparator.comparingInt(a -> a[0]));

            heap.offer(new int[] { 0, 0, 0 });

        // HashSet to keep track of visited states
        var seen = new HashSet<AbstractMap.SimpleEntry<Integer, Integer>>();

        // Spell the keyword using the metal dial
        var totalSteps = 0;
            while (!heap.isEmpty()) {
            // Pop the element with the smallest total steps from the heap
            var state = heap.poll();
            totalSteps = state[0];
            var ringIndex = state[1];
            var keyIndex = state[2];

            // We have spelled the keyword
            if (keyIndex == keyLen) {
                break;
            }

            // Continue if we have visited this character from this position in ring before
            var currentState = new AbstractMap.SimpleEntry<>(ringIndex, keyIndex);
            if (seen.contains(currentState)) {
                continue;
            }

            // Otherwise, add this pair to the visited list
            seen.add(currentState);

            // Add the rest of the occurrences of this character in ring to the heap
            for (var nextIndex : characterIndices.get(key.charAt(keyIndex))) {
                heap.offer(
                    new int[] {totalSteps + countSteps(ringIndex, nextIndex, ringLen),
                        nextIndex, keyIndex + 1});
            }
        }

        // Return the total steps and add keyLen to account for
        // pressing the center button for each character in the keyword
        return totalSteps + keyLen;
}


    // pd - bottom - up
//    public int findRotateSteps(String ring, String key) {
//        var ringLen = ring.length();
//        var keyLen = key.length();
//        var curr = new int[ringLen];
//        var prev = new int[ringLen];
//        Arrays.fill(prev, 0);
//        // For each occurrence of the character at key_index of key in ring
//        // Stores minimum steps to the character from ringIndex of ring
//        for (var keyIndex = keyLen - 1; keyIndex >= 0; keyIndex--) {
//            Arrays.fill(curr, Integer.MAX_VALUE);
//            for (var ringIndex = 0; ringIndex < ringLen; ringIndex++) {
//                for (var charIndex = 0; charIndex < ringLen; charIndex++) {
//                    if (ring.charAt(charIndex) == key.charAt(keyIndex)) {
//                        curr[ringIndex] = Math.min(curr[ringIndex],
//                            1 + countSteps(ringIndex, charIndex, ringLen) + prev[charIndex]);
//                    }
//                }
//            }
//            prev = curr.clone();
//        }
//        return prev[0];
//    }


    // dp - top-Down
//    public int findRotateSteps(String ring, String key) {
//        return tryLock(0, 0, ring, key, Integer.MAX_VALUE);
//    }
//
//    int tryLock(int ringIndex, int keyIndex, String ring, String key, int minSteps) {
//        // If we reach the end of the key, it has been spelled
//        if (keyIndex == key.length()) {
//            return 0;
//        }
//        // For each occurrence of the character at key_index of key in ring
//        // Calculate the minimum steps to that character from the ringIndex of ring
//        for (int i = 0; i < ring.length(); i++) {
//            if (ring.charAt(i) == key.charAt(keyIndex)) {
//                int totalSteps = countSteps(ringIndex, i, ring.length()) + 1 +
//                    tryLock(i, keyIndex + 1, ring, key, Integer.MAX_VALUE);
//                minSteps = Math.min(minSteps, totalSteps);
//            }
//        }
//        return minSteps;
//    }


    // Find the minimum steps between two indexes of ring
    private int countSteps(int curr, int next, int ringLength) {
        var stepsBetween = Math.abs(curr - next);
        var stepsAround = ringLength - stepsBetween;
        return Math.min(stepsBetween, stepsAround);
    }

}
