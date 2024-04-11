package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveKDigits_402Test {

    @Test
    void removeKdigits() {
        var target = new RemoveKDigits_402();
        assertEquals("1219", target.removeKdigits("1432219", 3));
        assertEquals("200", target.removeKdigits("10200", 1));
        assertEquals("0", target.removeKdigits("10", 2));
        assertEquals("0", target.removeKdigits("10", 1));
        assertEquals("11", target.removeKdigits("112", 1));
    }
}