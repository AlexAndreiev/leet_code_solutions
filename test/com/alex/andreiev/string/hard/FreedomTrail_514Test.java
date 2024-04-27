package com.alex.andreiev.string.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreedomTrail_514Test {

    @Test
    void findRotateSteps() {
        var target = new FreedomTrail_514();
        assertEquals(4, target.findRotateSteps("godding", "gd"));
        assertEquals(13, target.findRotateSteps("godding", "godding"));
        assertEquals(7, target.findRotateSteps("repetitive", "per"));
    }
}