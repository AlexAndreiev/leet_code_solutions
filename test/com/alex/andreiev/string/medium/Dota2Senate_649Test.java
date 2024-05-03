package com.alex.andreiev.string.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Dota2Senate_649Test {

    @Test
    void predictPartyVictory() {
        var target = new Dota2Senate_649();
        assertEquals("Radiant", target.predictPartyVictory("RD"));
        assertEquals("Dire", target.predictPartyVictory("RDD"));
        assertEquals("Dire", target.predictPartyVictory("DDRRR"));
    }
}