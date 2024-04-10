package com.alex.andreiev.math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumber_9Test {

    @Test
    void isPalindrome() {
        var target = new PalindromeNumber_9();
        assertTrue(target.isPalindrome(121));
        assertFalse(target.isPalindrome(-121));
        assertFalse(target.isPalindrome(10));
        assertFalse(target.isPalindrome(-101));
        assertFalse(target.isPalindrome(1000021));
    }
}