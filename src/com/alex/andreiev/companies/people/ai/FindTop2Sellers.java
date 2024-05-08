package com.alex.andreiev.companies.people.ai;

import java.util.*;

public class FindTop2Sellers {

    public List<Trade> findTop2Sellers(List<Trade> trades) {
        var map = new HashMap<String, Integer>();
        for (var trade : trades) {
            map.put(trade.name, map.getOrDefault(trade.name, 0) + trade.amount);
        }

        return map.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(2)
            .map(e -> new Trade(e.getKey(), e.getValue()))
            .toList();
    }

    public record Trade(String name, Integer amount){};
}
