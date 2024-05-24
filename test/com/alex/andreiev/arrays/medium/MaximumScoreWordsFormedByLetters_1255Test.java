package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumScoreWordsFormedByLetters_1255Test {

    @Test
    void maxScoreWords() {
        var target = new MaximumScoreWordsFormedByLetters_1255();
        target.maxScoreWords(
            new String[] {"dog","cat","dad","good"},
            new char[] {'a','a','c','d','d','d','g','o','o'},
            new int[]{1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0});
    }
}