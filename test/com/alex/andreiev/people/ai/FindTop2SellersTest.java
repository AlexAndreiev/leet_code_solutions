package com.alex.andreiev.people.ai;

import com.alex.andreiev.companies.people.ai.FindTop2Sellers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindTop2SellersTest {

    @Test
    void findTop2Sellers() {
        var target = new FindTop2Sellers();

        var input = List.of(
            new FindTop2Sellers.Trade("Alice", 50),
            new FindTop2Sellers.Trade("Oleh", 5),
            new FindTop2Sellers.Trade("Alice", 10),
            new FindTop2Sellers.Trade("Alex", 30),
            new FindTop2Sellers.Trade("Alex", 80),
            new FindTop2Sellers.Trade("Alice", 100),
            new FindTop2Sellers.Trade("Oleh", 3),
            new FindTop2Sellers.Trade("Kate", 70)
        );

        var expected = List.of(
            new FindTop2Sellers.Trade("Alice", 160),
            new FindTop2Sellers.Trade("Alex", 110)
        );

        assertIterableEquals(expected, target.findTop2Sellers(input));
    }
}