package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsAlternately_1768Test {

    @Test
    void mergeAlternately() {
        var target = new MergeStringsAlternately_1768();
        assertEquals("apbqcr", target.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", target.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", target.mergeAlternately("abcd", "pq"));
    }
}