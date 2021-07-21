package com.alex.andreiev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicate_easy_217Test {

    @Test
    void containsDuplicate() {

        assertTrue(new ContainsDuplicate_easy_217().containsDuplicate(new int[]{1,2,3,1}));
        assertFalse(new ContainsDuplicate_easy_217().containsDuplicate(new int[]{1,2,3,4}));
        assertTrue(new ContainsDuplicate_easy_217().containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
}