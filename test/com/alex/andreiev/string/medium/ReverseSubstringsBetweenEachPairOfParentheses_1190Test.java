package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseSubstringsBetweenEachPairOfParentheses_1190Test {

    @Test
    void reverseParentheses() {
        var target = new ReverseSubstringsBetweenEachPairOfParentheses_1190();
        assertEquals("dcba", target.reverseParentheses("(abcd)"));
        assertEquals("iloveu", target.reverseParentheses("(u(love)i)"));
        assertEquals("leetcode", target.reverseParentheses("(ed(et(oc))el)"));
    }
}