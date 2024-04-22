package com.alex.andreiev.math.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzz_412Test {

    @Test
    void fizzBuzz() {
        var target = new FizzBuzz_412();
        assertEquals(List.of("1", "2", "Fizz"), target.fizzBuzz(3));
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz"), target.fizzBuzz(5));
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
            "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), target.fizzBuzz(15));
    }
}