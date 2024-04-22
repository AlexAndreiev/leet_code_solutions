package com.alex.andreiev.arrays.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenTheLock_752Test {

    @Test
    void openLock() {
        var target = new OpenTheLock_752();
        assertEquals(6, target.openLock(
            new String[] {"0201","0101","0102","1212","2002"},
            "0202"));

        assertEquals(1, target.openLock(
            new String[] {"8888"}, "0009"));

        assertEquals(-1, target.openLock(
            new String[] {"8887","8889","8878","8898","8788","8988","7888","9888"},
            "8888"));
    }
}