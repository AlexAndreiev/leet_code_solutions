package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfPushesToTypeWord2_3016Test {

    @Test
    void minimumPushes() {
        var target = new MinimumNumberOfPushesToTypeWord2_3016();
        assertEquals(5, target.minimumPushes("abcde"));
        assertEquals(12, target.minimumPushes("xyzxyzxyzxyz"));
        assertEquals(24, target.minimumPushes("aabbccddeeffgghhiiiiii"));
        assertEquals(52, target.minimumPushes("aremgjnptohswfdkyuzvicqxb"));
    }
}