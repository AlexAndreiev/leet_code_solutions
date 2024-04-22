package com.alex.andreiev.math.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegers_2235Test {

    @Test
    void sum() {
        var target = new AddTwoIntegers_2235();
        assertEquals(17, target.sum(12, 5));
        assertEquals(-6, target.sum(-10, 4));
    }
}