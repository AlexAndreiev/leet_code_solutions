package com.alex.andreiev.arrays.medium;

/*
Given an array of integers arr.
We want to select three indices i, j and k where (0 <= i < j <= k < arr.length).
Let's define a and b as follows:
    a = arr[i] ^ arr[i + 1] ^ ... ^ arr[j - 1]
    b = arr[j] ^ arr[j + 1] ^ ... ^ arr[k]
Note that ^ denotes the bitwise-xor operation.
Return the number of triplets (i, j and k) Where a == b.

Example 1:
Input: arr = [2,3,1,6,7]
Output: 4
Explanation: The triplets are (0,1,2), (0,2,2), (2,3,4) and (2,4,4)

Example 2:
Input: arr = [1,1,1,1,1]
Output: 10

Constraints:
    1 <= arr.length <= 300
    1 <= arr[i] <= 108
 */

import java.util.HashMap;
import java.util.Map;

public class CountTripletsThatCanFormTwoArraysOfEqualXor_1442 {
    // One Pass Prefix XOR
    public int countTriplets(int[] arr) {
        int size = arr.length;
        int count = 0;
        int prefix = 0;

        // Maps to store counts and totals of XOR values encountered
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        Map<Integer, Integer> totalMap = new HashMap<>();

        // Iterating through the array
        for (int i = 0; i < size; ++i) {
            // Calculating XOR prefix
            prefix ^= arr[i];

            // Calculating contribution of current element to the result
            count +=
                countMap.getOrDefault(prefix, 0) * i -
                    totalMap.getOrDefault(prefix, 0);

            // Updating total count of current XOR value
            totalMap.put(prefix, totalMap.getOrDefault(prefix, 0) + i + 1);
            countMap.put(prefix, countMap.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }

    // Two Pass Prefix XOR
//    public int countTriplets(int[] arr) {
//        int[] prefixXOR = new int[arr.length + 1];
//        prefixXOR[0] = 0;
//        System.arraycopy(arr, 0, prefixXOR, 1, arr.length);
//        int size = prefixXOR.length;
//        int count = 0;
//
//        // Performing XOR operation on the array elements
//        for (int i = 1; i < size; ++i) prefixXOR[i] ^= prefixXOR[i - 1];
//
//        // Maps to store counts and totals of XOR values encountered
//        HashMap<Integer, Integer> countMap = new HashMap<>();
//        HashMap<Integer, Integer> totalMap = new HashMap<>();
//
//        // Iterating through the array
//        for (int i = 0; i < size; ++i) {
//            // Calculating contribution of current element to the result
//            count +=
//                countMap.getOrDefault(prefixXOR[i], 0) * (i - 1) -
//                    totalMap.getOrDefault(prefixXOR[i], 0);
//
//            // Updating total count of current XOR value
//            totalMap.put(
//                prefixXOR[i],
//                totalMap.getOrDefault(prefixXOR[i], 0) + i
//            );
//            countMap.put(
//                prefixXOR[i],
//                countMap.getOrDefault(prefixXOR[i], 0) + 1
//            );
//        }
//
//        return count;
//    }

    // Nested Prefix XOR
//    public int countTriplets(int[] arr) {
//        var prefixXOR = new int[arr.length + 1];
//        prefixXOR[0] = 0;
//        System.arraycopy(arr, 0, prefixXOR, 1, arr.length);
//        var size = prefixXOR.length;
//
//        // Perform XOR on consecutive elements in the modified array
//        for (var i = 1; i < size; i++) {
//            prefixXOR[i] ^= prefixXOR[i - 1];
//        }
//
//        var count = 0;
//
//        // Iterate through the modified array to count triplets
//        for (var start = 0; start < size; start++) {
//            for (int end = start + 1; end < size; end++) {
//                if (prefixXOR[start] == prefixXOR[end]) {
//                    // Increment the result by the count of valid triplets
//                    count += end - start - 1;
//                }
//            }
//        }
//
//        return count;
//    }

    // Brute Force With Prefix
//    public int countTriplets(int[] arr) {
//        var count = 0;
//
//        // Iterate over each possible starting index i
//        for (var start = 0; start < arr.length - 1; ++start) {
//            // Initialize XOR value for the subarray from start to mid-1
//            var xorA = 0;
//
//            // Iterate over each possible middle index j
//            for (var mid = start + 1; mid < arr.length; ++mid) {
//                // Update xorA to include arr[mid - 1]
//                xorA ^= arr[mid - 1];
//
//                // Initialize XOR value for the subarray from mid to end
//                var xorB = 0;
//
//                // Iterate over each possible ending index k (starting from mid)
//                for (var end = mid; end < arr.length; ++end) {
//                    // Update xorB to include arr[end]
//                    xorB ^= arr[end];
//
//                    // found a valid triplet (start, mid, end)
//                    if (xorA == xorB) {
//                        ++count;
//                    }
//                }
//            }
//        }
//
//        return count;
//    }
}
