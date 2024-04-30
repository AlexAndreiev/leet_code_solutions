package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemovingStarsFromAString_2390Test {

    @Test
    void removeStars() {
        var target = new RemovingStarsFromAString_2390();
        assertEquals("lecoe", target.removeStars("leet**cod*e"));
        assertEquals("", target.removeStars("erase*****"));
    }
}