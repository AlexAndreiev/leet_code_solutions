package com.alex.andreiev.arrays.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/*
In English, we have a concept called root,
which can be followed by some other word to form another longer word - let's call this word derivative.
For example, when the root "help" is followed by the word "ful", we can form a derivative "helpful".
Given a dictionary consisting of many roots and a sentence consisting of words separated by spaces,
replace all the derivatives in the sentence with the root forming it.
If a derivative can be replaced by more than one root, replace it with the root that has the shortest length.
Return the sentence after the replacement.

Example 1:
Input: dictionary = ["cat","bat","rat"], sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"

Example 2:
Input: dictionary = ["a","b","c"], sentence = "aadsfasf absbs bbab cadsfafs"
Output: "a a b c"

Constraints:
    1 <= dictionary.length <= 1000
    1 <= dictionary[i].length <= 100
    dictionary[i] consists of only lower-case letters.
    1 <= sentence.length <= 106
    sentence consists of only lower-case letters and spaces.
    The number of words in sentence is in the range [1, 1000]
    The length of each word in sentence is in the range [1, 1000]
    Every two consecutive words in sentence will be separated by exactly one space.
    sentence does not have leading or trailing spaces.
 */
public class ReplaceWords_648 {
    public String replaceWords(List<String> dictionary, String sentence) {
        var wordArray = sentence.split(" ");

        var dictTrie = new Trie();
        for (var word : dictionary) {
            dictTrie.insert(word);
        }

        // Replace each word in the sentence with the corresponding shortest root
        for (var word = 0; word < wordArray.length; word++) {
            wordArray[word] = dictTrie.shortestRoot(wordArray[word]);
        }

        return String.join(" ", wordArray);
    }

    static class TrieNode {

        boolean isEnd;
        TrieNode[] children;

        TrieNode() {
            isEnd = false;
            children = new TrieNode[26];
        }
    }

    static class Trie {

        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode current = root;
            for (var c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new TrieNode();
                }
                current = current.children[c - 'a'];
            }
            current.isEnd = true;
        }

        // Find the shortest root of the word in the trie
        public String shortestRoot(String word) {
            var current = root;
            for (var i = 0; i < word.length(); i++) {
                var c = word.charAt(i);
                if (current.children[c - 'a'] == null) {
                    // There is not a corresponding root in the trie
                    return word;
                }
                current = current.children[c - 'a'];
                if (current.isEnd) {
                    return word.substring(0, i + 1);
                }
            }
            // There is not a corresponding root in the trie
            return word;
        }
    }



    // hash tree
//    public String replaceWords(List<String> dictionary, String sentence) {
//        var words = sentence.split(" ");
//        var set = new TreeSet<>(dictionary);
//        // var result = new ArrayList<String>();
//        var sb = new StringBuilder();
//        for (var word : words) {
//            var s = word;
//            for (var root : set) {
//                if (word.startsWith(root)) {
//                    s = root;
//                    break;
//                }
//            }
//            sb.append(s + " ");
//        }
//
//        if (!sb.isEmpty()) {
//            sb.setLength(sb.length() - 1);
//        }
//
//        return sb.toString();
//    }
}
