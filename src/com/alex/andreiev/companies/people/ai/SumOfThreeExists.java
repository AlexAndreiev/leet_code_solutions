package com.alex.andreiev.companies.people.ai;

/*
You have input array of integer and x.
Return if there are 3 elements which in sum equal x
 */

import java.util.Arrays;

public class SumOfThreeExists {
    public boolean isSumExists(int[] nums, int x) {
        Arrays.sort(nums); // Sort the array to use two pointers approach
        for (var i = 0; i < nums.length - 2; i++) {
            var left = i + 1;
            var right = nums.length - 1;
            while (left < right) {
                var sum = nums[i] + nums[left] + nums[right];
                if (sum == x) {
                    return true; // Found three elements whose sum equals x
                } else if (sum < x) {
                    left++; // Increment left pointer if sum is smaller
                } else {
                    right--; // Decrement right pointer if sum is larger
                }
            }
        }
        return false; // No three elements found whose sum equals x
    }
}
