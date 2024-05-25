package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreak2_140Test {

    @Test
    void wordBreak() {
        var target = new WordBreak2_140();
        var expected = List.of("cats and dog","cat sand dog");
        var actual = target.wordBreak("catsanddog", List.of("cat","cats","and","sand","dog"));
        checkResult(expected, actual);

        expected = List.of("pine apple pen apple","pineapple pen apple","pine applepen apple");
        actual = target.wordBreak("pineapplepenapple", List.of("apple","pen","applepen","pine","pineapple"));
        checkResult(expected, actual);

        expected = List.of();
        actual = target.wordBreak("catsandog", List.of("cats","dog","sand","and","cat"));
        checkResult(expected, actual);
    }

    void checkResult(List<String> expectedList, List<String> actualList) {
        assertEquals(expectedList.size(), actualList.size());
        expectedList.forEach(s -> assertTrue(actualList.contains(s)));
    }
}