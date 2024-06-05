package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonCharacters_1002Test {

    @Test
    void commonChars() {
        var target = new FindCommonCharacters_1002();
        assertIterableEquals(List.of("e","l","l"),
            target.commonChars(new String[] {"bella","label","roller"}));

        assertIterableEquals(List.of("c","o"),
            target.commonChars(new String[] {"cool","lock","cook"}));
    }
}