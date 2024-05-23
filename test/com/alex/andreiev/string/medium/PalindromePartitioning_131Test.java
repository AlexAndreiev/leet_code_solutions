package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioning_131Test {

    @Test
    void partition() {
        var target = new PalindromePartitioning_131();

        var actual = target.partition("aab");
        assertEquals(2, actual.size());
        assertEquals(3, actual.getFirst().size());

        assertEquals(2, actual.getFirst().stream()
            .filter(e -> e.equals("a"))
            .count()
        );
        assertEquals(1, actual.getFirst().stream()
            .filter(e -> e.equals("b"))
            .count()
        );

        assertEquals(2, actual.get(1).size());
        assertEquals(1, actual.get(1).stream()
            .filter(e -> e.equals("aa"))
            .count()
        );
        assertEquals(1, actual.get(1).stream()
            .filter(e -> e.equals("b"))
            .count()
        );

    }
}