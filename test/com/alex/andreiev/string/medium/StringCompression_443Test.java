package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringCompression_443Test {

    @Test
    void compress() {
        var target = new StringCompression_443();
        var input = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        assertEquals(6, target.compress(input));
        var actual = Arrays.copyOf(input, 6);
        assertArrayEquals(new char[] {'a', '2', 'b', '2', 'c', '3'}, actual);

        input = new char[] {'a'};
        assertEquals(1, target.compress(input));
        assertArrayEquals(new char[] {'a'}, input);

        input = new char[] {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        assertEquals(4, target.compress(input));
        actual = Arrays.copyOf(input, 4);
        assertArrayEquals(new char[] {'a', 'b', '1', '2'}, actual);
    }
}