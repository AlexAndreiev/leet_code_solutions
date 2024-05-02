package com.alex.andreiev.arrays.easy;

/*
Given an integer array nums that does not contain any zeros,
find the largest positive integer k such that -k also exists in the array.
Return the positive integer k. If there is no such integer, return -1.


Example 1:
Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.

Example 2:
Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.

Example 3:
Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: There is no a single valid k, we return -1.

Constraints:
    1 <= nums.length <= 1000
    -1000 <= nums[i] <= 1000
    nums[i] != 0

Hint 1
What data structure can help you to determine if an element exists?
Hint 2
Would a hash table help?

 */

import java.util.Arrays;
import java.util.HashSet;

public class LargestPositiveIntegerThatExistsWithItsNegative_2441 {

    public int findMaxK(int[] nums) {
        // Initialize a HashSet to store negative numbers
        var neg = new HashSet<Integer>();

        // Loop through the numbers and insert negative numbers into the set
        for (var num : nums) {
            if (num < 0) {
                neg.add(num);
            }
        }

        var ans = -1;

        for (var num : nums) {
            // If current number is greater than ans and its negation exists in the set
            if (num > ans && neg.contains(-num)) {
                ans = num;
            }
        }

        return ans;
    }


   // two pointers
//    public int findMaxK(int[] nums) {
//        Arrays.sort(nums);
//        var l = 0;
//        var r = nums.length - 1;
//        while (l != r) {
//            var negPos = nums[l] * -1;
//            if (negPos > nums[r]) {
//                l++;
//            } else if (negPos < nums[r]) {
//                r--;
//            } else {
//                break;
//            }
//        }
//
//        return l != r ? nums[r] : -1;
//    }
}
