package com.alex.andreiev.string.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfAtoms_726Test {

    @Test
    void countOfAtoms() {
        var target = new NumberOfAtoms_726();
        assertEquals("H2O", target.countOfAtoms("H2O"));
        assertEquals("H2MgO2", target.countOfAtoms("Mg(OH)2"));
        assertEquals("K4N2O14S4", target.countOfAtoms("K4(ON(SO3)2)2"));
        assertEquals("Be32", target.countOfAtoms("Be32"));

        assertEquals("H2MgNO", target.countOfAtoms("Mg(H2O)N"));
    }
}