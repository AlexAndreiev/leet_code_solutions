package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceWords_648Test {

    @Test
    void replaceWords() {
        var target = new ReplaceWords_648();
        assertEquals("the cat was rat by the bat",
            target.replaceWords(List.of("cat","bat","rat"),
                "the cattle was rattled by the battery"));

        assertEquals("a a b c",
            target.replaceWords(List.of("a","b","c"),
                "aadsfasf absbs bbab cadsfafs"));
    }
}