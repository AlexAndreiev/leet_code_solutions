package com.alex.andreiev.arrays.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/*
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

Example 1:
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

Example 2:
Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]

Constraints:
    1 <= arr1.length, arr2.length <= 1000
    0 <= arr1[i], arr2[i] <= 1000
    All the elements of arr2 are distinct.
    Each arr2[i] is in arr1.

Hint 1
Using a hashmap, we can map the values of arr2 to their position in arr2.
Hint 2
After, we can use a custom sorting function.
 */
public class RelativeSortArray_1122 {
    // counting sort
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        var maxElement = Arrays.stream(arr1).max().orElse(0);
        var count = new int[maxElement + 1];

        // Count occurrences of each element
        for (var element : arr1) {
            count[element]++;
        }

        var result = new ArrayList<Integer>();
        // Add elements as per relative order
        for (var value : arr2) {
            while (count[value] > 0) {
                result.add(value);
                count[value]--;
            }
        }

        // Add remaining elements in ascending order
        for (var num = 0; num <= maxElement; num++) {
            while (count[num] > 0) {
                result.add(num);
                count[num]--;
            }
        }

        // Convert ArrayList to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }



    // hash, sort and counting
//    public int[] relativeSortArray(int[] arr1, int[] arr2) {
//        var countMap = new HashMap<Integer, Integer>();
//        var remaining = new ArrayList<Integer>();
//        var result = new ArrayList<Integer>();
//
//        // Initialize count map with relative order elements
//        for (int value : arr2) {
//            countMap.put(value, 0);
//        }
//
//        // Count occurrences of elements in target array
//        for (int value : arr1) {
//            if (countMap.containsKey(value)) {
//                countMap.put(value, countMap.get(value) + 1);
//            } else {
//                remaining.add(value);
//            }
//        }
//
//        // Sort the remaining elements
//        Collections.sort(remaining);
//
//        // Add elements as per relative order
//        for (int value : arr2) {
//            for (int j = 0; j < countMap.get(value); j++) {
//                result.add(value);
//            }
//        }
//
//        // Add remaining elements
//        result.addAll(remaining);
//
//        // Convert ArrayList to array
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
}
