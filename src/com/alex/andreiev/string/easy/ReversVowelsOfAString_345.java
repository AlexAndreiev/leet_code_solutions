package com.alex.andreiev.string.easy;

import java.util.Set;

public class ReversVowelsOfAString_345 {

    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";

        var resultArr = s.toCharArray();
        var leftPos = 0;
        var rightPos = resultArr.length - 1;
        while (leftPos < rightPos) {
            if (vowels.indexOf(resultArr[leftPos]) != -1) {
                while (leftPos < rightPos) {
                    if (vowels.indexOf(resultArr[rightPos]) != -1) {
                        resultArr[leftPos] = s.charAt(rightPos);
                        resultArr[rightPos] = s.charAt(leftPos);
                        rightPos--;
                        break;
                    }
                    rightPos--;
                }
            }
            leftPos++;
        }
        return String.valueOf(resultArr);
    }
}
