package com.alex.andreiev.arrays.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthDistinctStringInAnArray_2053Test {

    @Test
    void kthDistinct() {
        var target = new KthDistinctStringInAnArray_2053();
        assertEquals("a", target.kthDistinct(new String[]{"d", "b", "c", "b", "c", "a"}, 2));
        assertEquals("aaa", target.kthDistinct(new String[]{"aaa","aa","a"},1));
        assertEquals("", target.kthDistinct(new String[]{"a","b","a"}, 3));
    }
}