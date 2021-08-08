package com.alex.andreiev.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterInAString_easy_387Test {

    @Test
    void firstUniqChar() {
        var target = new FirstUniqueCharacterInAString_easy_387();
        assertEquals(0, target.firstUniqChar("leetcode"));
        assertEquals(2, target.firstUniqChar("loveleetcode"));
        assertEquals(-1, target.firstUniqChar("aabb"));
    }
}