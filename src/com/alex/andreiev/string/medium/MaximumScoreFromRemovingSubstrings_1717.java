package com.alex.andreiev.string.medium;

import java.util.Stack;

/*
You are given a string s and two integers x and y. You can perform two types of operations any number of times.
    Remove substring "ab" and gain x points.
        For example, when removing "ab" from "cabxbae" it becomes "cxbae".
    Remove substring "ba" and gain y points.
        For example, when removing "ba" from "cabxbae" it becomes "cabxe".

Return the maximum points you can gain after applying the above operations on s.

Example 1:
Input: s = "cdbcbbaaabab", x = 4, y = 5
Output: 19
Explanation:
- Remove the "ba" underlined in "cdbcbbaaabab". Now, s = "cdbcbbaaab" and 5 points are added to the score.
- Remove the "ab" underlined in "cdbcbbaaab". Now, s = "cdbcbbaa" and 4 points are added to the score.
- Remove the "ba" underlined in "cdbcbbaa". Now, s = "cdbcba" and 5 points are added to the score.
- Remove the "ba" underlined in "cdbcba". Now, s = "cdbc" and 5 points are added to the score.
Total score = 5 + 4 + 5 + 5 = 19.

Example 2:
Input: s = "aabbaaxybbaabb", x = 5, y = 4
Output: 20

Constraints:
    1 <= s.length <= 105
    1 <= x, y <= 104
    s consists of lowercase English letters.

Hint 1
Note that it is always more optimal to take one type of substring before another
Hint 2
You can use a stack to handle erasures
 */

public class MaximumScoreFromRemovingSubstrings_1717 {


    public int maximumGain(String s, int x, int y) {
        // Ensure "ab" always has higher points than "ba"
        if (x < y) {
            // Swap points
            var temp = x;
            x = y;
            y = temp;
            // Reverse the string to maintain logic
            s = new StringBuilder(s).reverse().toString();
        }

        int aCount = 0, bCount = 0, totalPoints = 0;

        for (var i = 0; i < s.length(); i++) {
            var currentChar = s.charAt(i);

            if (currentChar == 'a') {
                aCount++;
            } else if (currentChar == 'b') {
                if (aCount > 0) {
                    // Can form "ab", remove it and add points
                    aCount--;
                    totalPoints += x;
                } else {
                    // Can't form "ab", keep 'b' for potential future "ba"
                    bCount++;
                }
            } else {
                // Non 'a' or 'b' character encountered
                // Calculate points for any remaining "ba" pairs
                totalPoints += Math.min(bCount, aCount) * y;
                // Reset counters for next segment
                aCount = bCount = 0;
            }
        }

        // Calculate points for any remaining "ba" pairs at the end
        totalPoints += Math.min(bCount, aCount) * y;
        return totalPoints;
    }

        // Greedy Way (Without Stack)
//    public int maximumGain(String s, int x, int y) {
//        StringBuilder text = new StringBuilder(s);
//        int totalPoints = 0;
//
//        if (x > y) {
//            // Remove "ab" first (higher points), then "ba"
//            totalPoints += removeSubstring(text, "ab", x);
//            totalPoints += removeSubstring(text, "ba", y);
//        } else {
//            // Remove "ba" first (higher or equal points), then "ab"
//            totalPoints += removeSubstring(text, "ba", y);
//            totalPoints += removeSubstring(text, "ab", x);
//        }
//
//        return totalPoints;
//    }
//
//    private int removeSubstring(
//            StringBuilder inputString,
//            String targetSubstring,
//            int pointsPerRemoval
//    ) {
//        int totalPoints = 0;
//        int writeIndex = 0;
//
//        // Iterate through the string
//        for (int readIndex = 0; readIndex < inputString.length(); readIndex++) {
//            // Add the current character
//            inputString.setCharAt(writeIndex++, inputString.charAt(readIndex));
//
//            // Check if we've written at least two characters and
//            // they match the target substring
//            if (
//                    writeIndex > 1 &&
//                            inputString.charAt(writeIndex - 2) ==
//                                    targetSubstring.charAt(0) &&
//                            inputString.charAt(writeIndex - 1) == targetSubstring.charAt(1)
//            ) {
//                writeIndex -= 2; // Move write index back to remove the match
//                totalPoints += pointsPerRemoval;
//            }
//        }
//
//        // Trim the StringBuilder to remove any leftover characters
//        inputString.setLength(writeIndex);
//
//        return totalPoints;
//    }



    // Greedy Way (Stack)
//    public int maximumGain(String s, int x, int y) {
//        var totalScore = 0;
//        var highPriorityPair = x > y ? "ab" : "ba";
//        var lowPriorityPair = highPriorityPair.equals("ab") ? "ba" : "ab";
//
//        // First pass: remove high priority pair
//        var stringAfterFirstPass = removeSubstring(s, highPriorityPair);
//        var removedPairsCount = (s.length() - stringAfterFirstPass.length()) / 2;
//
//        // Calculate score from first pass
//        totalScore += removedPairsCount * Math.max(x, y);
//
//        // Second pass: remove low priority pair
//        var stringAfterSecondPass = removeSubstring(
//                stringAfterFirstPass,
//                lowPriorityPair
//        );
//        removedPairsCount = (stringAfterFirstPass.length() - stringAfterSecondPass.length()) / 2;
//
//        // Calculate score from second pass
//        totalScore += removedPairsCount * Math.min(x, y);
//
//        return totalScore;
//    }
//
//    private String removeSubstring(String input, String targetPair) {
//        Stack<Character> charStack = new Stack<>();
//
//        // Iterate through each character in the input string
//        for (var i = 0; i < input.length(); i++) {
//            var currentChar = input.charAt(i);
//
//            // Check if current character forms the target pair with the top of the stack
//            if (
//                    currentChar == targetPair.charAt(1) &&
//                            !charStack.isEmpty() &&
//                            charStack.peek() == targetPair.charAt(0)
//            ) {
//                charStack.pop(); // Remove the matching character from the stack
//            } else {
//                charStack.push(currentChar);
//            }
//        }
//
//        // Reconstruct the remaining string after removing target pairs
//        StringBuilder remainingChars = new StringBuilder();
//        while (!charStack.isEmpty()) {
//            remainingChars.append(charStack.pop());
//        }
//        return remainingChars.reverse().toString();
//    }
}
