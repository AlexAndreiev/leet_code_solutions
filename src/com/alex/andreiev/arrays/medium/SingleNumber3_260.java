package com.alex.andreiev.arrays.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums, in which exactly two elements appear
only once and all the other elements appear exactly twice.
Find the two elements that appear only once.
You can return the answer in any order.
You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

Example 1:
Input: nums = [1,2,1,3,2,5]
Output: [3,5]
Explanation:  [5, 3] is also a valid answer.

Example 2:
Input: nums = [-1,0]
Output: [-1,0]

Example 3:
Input: nums = [0,1]
Output: [1,0]

Constraints:
    2 <= nums.length <= 3 * 104
    -231 <= nums[i] <= 231 - 1
    Each integer in nums will appear twice, only two integers will appear once.
 */
public class SingleNumber3_260 {
    // xor and grouping
    public int[] singleNumber(int[] nums) {
        var xor2no = 0;
        for (var num : nums) {
            xor2no ^= num;
        }

        // find most right set bit - it means that this bit is different for both numbers
        var lowestBit = xor2no & (-xor2no);

        var result = new int[2];
        for (var num : nums) {
            if ((lowestBit & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;
    }

    // map
//    public int[] singleNumber(int[] nums) {
//        var map = new HashMap<Integer, Integer>();
//        for (var num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        return map.entrySet().stream()
//            .filter(e -> e.getValue() == 1)
//            .mapToInt(Map.Entry::getKey)
//            .toArray();
//    }
}
