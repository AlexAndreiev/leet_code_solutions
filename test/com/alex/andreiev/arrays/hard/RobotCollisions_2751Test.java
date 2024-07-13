package com.alex.andreiev.arrays.hard;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RobotCollisions_2751Test {

    @Test
    void survivedRobotsHealths() {
        var target = new RobotCollisions_2751();
        assertIterableEquals(List.of(2,17,9,15,10), target.survivedRobotsHealths(
                new int[] {5,4,3,2,1}, new int[] {2,17,9,15,10}, "RRRRR")
        );

        assertIterableEquals(List.of(14), target.survivedRobotsHealths(
                new int[] {3,5,2,6}, new int[] {10,10,15,12}, "RLRL")
        );

        assertIterableEquals(List.of(), target.survivedRobotsHealths(
                new int[] {1,2,5,6}, new int[] {10,10,11,11}, "RLRL")
        );
    }
}