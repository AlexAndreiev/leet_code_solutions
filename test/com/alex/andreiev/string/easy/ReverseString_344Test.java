package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseString_344Test {

    @Test
    void reverseString() {
        var target = new ReverseString_344();
        var arr = new char[] {'h','e','l','l','o'};
        target.reverseString(arr);
        assertArrayEquals(new char[] {'o','l','l','e','h'}, arr);

        arr = new char[] {'H','a','n','n','a', 'h'};
        target.reverseString(arr);
        assertArrayEquals(new char[] {'h','a','n','n', 'a', 'H'}, arr);
    }
}