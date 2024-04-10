package com.alex.andreiev.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParentheses_easy_20Test {

    @Test
    void isValid() {
        var target = new ValidParentheses_easy_20();
        assertTrue(target.isValid("()"));
        assertTrue(target.isValid("()[]{}"));
        assertFalse(target.isValid("(]"));
        assertFalse(target.isValid("([)]"));
    }
}