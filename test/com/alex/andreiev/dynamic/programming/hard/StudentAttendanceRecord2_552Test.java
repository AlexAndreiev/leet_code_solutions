package com.alex.andreiev.dynamic.programming.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAttendanceRecord2_552Test {

    @Test
    void checkRecord() {
        var target = new StudentAttendanceRecord2_552();
        assertEquals(8, target.checkRecord(2));

        assertEquals(3, target.checkRecord(1));

        assertEquals(183236316, target.checkRecord(10101));
    }
}