package com.alex.andreiev.math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinary_67Test {

    @Test
    void addBinary() {
        var target = new AddBinary_67();
        assertEquals("100", target.addBinary("11", "1"));
        assertEquals("10101", target.addBinary("1010", "1011"));
        assertEquals("11110", target.addBinary("1111", "1111"));
    }
}