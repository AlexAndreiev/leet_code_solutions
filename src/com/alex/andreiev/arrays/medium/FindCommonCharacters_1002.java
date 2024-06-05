package com.alex.andreiev.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given a string array words,
return an array of all characters that show up in all strings within the words (including duplicates).
You may return the answer in any order.

Example 1:
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]

Example 2:
Input: words = ["cool","lock","cook"]
Output: ["c","o"]

Constraints:
    1 <= words.length <= 100
    1 <= words[i].length <= 100
    words[i] consists of lowercase English letters.
 */
public class FindCommonCharacters_1002 {
    public List<String> commonChars(String[] words) {
        var wordsSize = words.length;
        var commonCharacterCounts = new int[26];
        var currentCharacterCounts = new int[26];
        var result = new ArrayList<String>();

        // Initialize commonCharacterCounts with the characters from the first
        // word
        for (var ch : words[0].toCharArray()) {
            commonCharacterCounts[ch - 'a']++;
        }

        for (int i = 1; i < wordsSize; i++) {
            Arrays.fill(currentCharacterCounts, 0);

            // Count characters in the current word
            for (var ch : words[i].toCharArray()) {
                currentCharacterCounts[ch - 'a']++;
            }

            // Update the common character counts to keep the minimum counts
            for (var letter = 0; letter < 26; letter++) {
                commonCharacterCounts[letter] = Math.min(
                    commonCharacterCounts[letter],
                    currentCharacterCounts[letter]
                );
            }
        }

        // Collect the common characters based on the final counts
        for (int letter = 0; letter < 26; letter++) {
            for (
                int commonCount = 0;
                commonCount < commonCharacterCounts[letter];
                commonCount++
            ) {
                result.add(String.valueOf((char) (letter + 'a')));
            }
        }

        return result;
    }
}
