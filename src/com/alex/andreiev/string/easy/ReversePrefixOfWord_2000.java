package com.alex.andreiev.string.easy;

public class ReversePrefixOfWord_2000 {
    public String reversePrefix(String word, char ch) {
        var index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        var sb = new StringBuilder(word.substring(0, index+1));
        return sb.reverse() + word.substring(index+1);
    }
}
