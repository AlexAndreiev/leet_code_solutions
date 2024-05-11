package com.alex.andreiev.arrays.hard;

/*
There are n workers. You are given two integer arrays quality and wage where quality[i] is
the quality of the ith worker and wage[i] is the minimum wage expectation for the ith worker.
We want to hire exactly k workers to form a paid group.
To hire a group of k workers, we must pay them according to the following rules:

    Every worker in the paid group must be paid at least their minimum wage expectation.
    In the group, each worker's pay must be directly proportional to their quality.
    This means if a worker’s quality is double that of another worker in the group,
    then they must be paid twice as much as the other worker.
Given the integer k, return the least amount of money needed to form a paid group satisfying the above conditions.
Answers within 10-5 of the actual answer will be accepted.

Example 1:
Input: quality = [10,20,5], wage = [70,50,30], k = 2
Output: 105.00000
Explanation: We pay 70 to 0th worker and 35 to 2nd worker.

Example 2:
Input: quality = [3,1,10,10,1], wage = [4,8,2,2,7], k = 3
Output: 30.66667
Explanation: We pay 4 to 0th worker, 13.33333 to 2nd and 3rd workers separately.

Constraints:
    n == quality.length == wage.length
    1 <= k <= n <= 104
    1 <= quality[i], wage[i] <= 104
 */

import java.util.*;

public class MinimumCostToHireKWorkers_857 {
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        var n = quality.length;
        var totalCost = Double.MAX_VALUE;
        var currentTotalQuality = 0d;
        var wageToQualityRatio = new ArrayList<AbstractMap.SimpleEntry<Double, Integer>>();

        // Calculate wage-to-quality ratio for each worker
        for (var i = 0; i < n; i++) {
            wageToQualityRatio.add(
                new AbstractMap.SimpleEntry<>((double) wage[i] / quality[i], quality[i]));
        }

        // Sort workers based on their wage-to-quality ratio
        wageToQualityRatio.sort(Comparator.comparingDouble(AbstractMap.SimpleEntry::getKey));

        // Use a priority queue to keep track of the highest quality workers
        var highestQualityWorkers = new PriorityQueue<Integer>(Collections.reverseOrder());

        // Iterate through workers
        for (var i = 0; i < n; i++) {
            highestQualityWorkers.add(wageToQualityRatio.get(i).getValue());
            currentTotalQuality += wageToQualityRatio.get(i).getValue();

            // If we have more than k workers,
            // remove the one with the highest quality
            if (highestQualityWorkers.size() > k) {
                currentTotalQuality -= highestQualityWorkers.poll();
            }

            // If we have exactly k workers,
            // calculate the total cost and update if it's the minimum
            if (highestQualityWorkers.size() == k) {
                totalCost = Math.min(totalCost, currentTotalQuality *
                    wageToQualityRatio.get(i).getKey());
            }
        }

        return Math.round(totalCost*100000d) / 100000d;
    }
}
