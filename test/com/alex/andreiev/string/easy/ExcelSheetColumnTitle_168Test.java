package com.alex.andreiev.string.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcelSheetColumnTitle_168Test {

    @Test
    void convertToTitle() {
        var target = new ExcelSheetColumnTitle_168();
        assertEquals("A", target.convertToTitle(1));
        assertEquals("AB", target.convertToTitle(28));
        assertEquals("ZY", target.convertToTitle(701));
        assertEquals("FXSHRXW", target.convertToTitle(2147483647));
    }
}