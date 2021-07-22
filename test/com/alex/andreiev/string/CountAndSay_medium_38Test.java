package com.alex.andreiev.string;

import com.alex.andreiev.string.CountAndSay_medium_38;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSay_medium_38Test {

    @Test
    void countAndSay() {
        var countAndSay = new CountAndSay_medium_38();
        assertEquals("1", countAndSay.countAndSay(1));
/*
        Input = 4
        countAndSay(1) = "1"
        countAndSay(2) = say "1" = one 1 = "11"
        countAndSay(3) = say "11" = two 1's = "21"
        countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
*/
        assertEquals("1211", countAndSay.countAndSay(4));
    }
}