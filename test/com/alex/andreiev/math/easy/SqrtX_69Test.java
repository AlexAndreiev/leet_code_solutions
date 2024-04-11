package com.alex.andreiev.math.easy;

import com.alex.andreiev.string.medium.RemoveKDigits_402;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtX_69Test {

    @Test
    void mySqrt() {
        var target = new SqrtX_69();
        assertEquals(2, target.mySqrt(4));
        assertEquals(2, target.mySqrt(8));
        assertEquals(1, target.mySqrt(1));
        assertEquals(2, target.mySqrt(6));
        assertEquals(3, target.mySqrt(9));
        assertEquals(6, target.mySqrt(36));
        assertEquals(46339, target.mySqrt(2147395599));
        assertEquals(0, target.mySqrt(0));
        assertEquals(46340, target.mySqrt(2147395600));


    }
}