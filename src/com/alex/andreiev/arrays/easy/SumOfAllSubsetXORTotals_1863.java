package com.alex.andreiev.arrays.easy;

/*
The XOR total of an array is defined as the bitwise XOR of all its elements, or 0 if the array is empty.
    For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR 6 = 1.
Given an array nums, return the sum of all XOR totals for every subset of nums.
Note: Subsets with the same elements should be counted multiple times.
An array a is a subset of an array b if a can be obtained from b by deleting some (possibly zero) elements of b.

Example 1:
Input: nums = [1,3]
Output: 6
Explanation: The 4 subsets of [1,3] are:
- The empty subset has an XOR total of 0.
- [1] has an XOR total of 1.
- [3] has an XOR total of 3.
- [1,3] has an XOR total of 1 XOR 3 = 2.
0 + 1 + 3 + 2 = 6

Example 2:
Input: nums = [5,1,6]
Output: 28
Explanation: The 8 subsets of [5,1,6] are:
- The empty subset has an XOR total of 0.
- [5] has an XOR total of 5.
- [1] has an XOR total of 1.
- [6] has an XOR total of 6.
- [5,1] has an XOR total of 5 XOR 1 = 4.
- [5,6] has an XOR total of 5 XOR 6 = 3.
- [1,6] has an XOR total of 1 XOR 6 = 7.
- [5,1,6] has an XOR total of 5 XOR 1 XOR 6 = 2.
0 + 5 + 1 + 6 + 4 + 3 + 7 + 2 = 28

Example 3:
Input: nums = [3,4,5,6,7,8]
Output: 480
Explanation: The sum of all XOR totals for every subset is 480.

Hint 1
Is there a way to iterate through all the subsets of the array?
Hint 2
Can we use recursion to efficiently iterate through all the subsets?
 */

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubsetXORTotals_1863 {

    // bit manipulation
    // 0 ms
    public int subsetXORSum(int[] nums) {
        var result = 0;
        // Capture each bit that is set in any of the elements
        for (var num : nums) {
            result |= num;
        }
        // Multiply by the number of subset XOR totals that will have each bit set
        return result << (nums.length - 1);
    }


    // optimized backtracking
    // 0 ms
//    public int subsetXORSum(int[] nums) {
//        return XORSum(nums, 0, 0);
//    }
//
//    private int XORSum(int[] nums, int index, int currentXOR) {
//        // Return currentXOR when all elements in nums are already considered
//        if (index == nums.length) return currentXOR;
//
//        // Calculate sum of subset xor with current element
//        var withElement = XORSum(nums, index + 1, currentXOR ^ nums[index]);
//
//        // Calculate sum of subset xor without current element
//        var withoutElement = XORSum(nums, index + 1, currentXOR);
//
//        // Return sum of xor totals
//        return withElement + withoutElement;
//    }


    // Generate All Subsets Using Backtracking
    // 17 ms
//    public int subsetXORSum(int[] nums) {
//        var subsets = new ArrayList<List<Integer>>();
//        // Generate all of the subsets
//        generateSubsets(nums, 0, new ArrayList<>(), subsets);
//
//        // Compute the XOR total for each subset and add to the result
//        var result = 0;
//        for (var subset : subsets) {
//            var subsetXORTotal = 0;
//            for (var num : subset) {
//                subsetXORTotal ^= num;
//            }
//            result += subsetXORTotal;
//        }
//        return result;
//    }
//
//    private void generateSubsets(int[] nums, int index, List<Integer> subset, List<List<Integer>> subsets) {
//        // Base case: index reached end of nums
//        // Add the current subset to subsets
//        if (index == nums.length) {
//            subsets.add(new ArrayList<>(subset));
//            return;
//        }
//
//        // Generate subsets with nums[i]
//        subset.add(nums[index]);
//        generateSubsets(nums, index + 1, subset, subsets);
//        subset.remove(subset.size() - 1);
//
//        // Generate subsets without nums[i]
//        generateSubsets(nums, index + 1, subset, subsets);
//    }
}
