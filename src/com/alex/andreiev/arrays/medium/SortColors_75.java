package com.alex.andreiev.arrays.medium;

import java.util.Arrays;

/*
Given an array nums with n objects colored red, white, or blue, sort them in-place
so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]

Constraints:
    n == nums.length
    1 <= n <= 300
    nums[i] is either 0, 1, or 2.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Hint 1
A rather straight forward solution is a two-pass algorithm using counting sort.
Hint 2
Iterate the array counting number of 0's, 1's, and 2's.
Hint 3
Overwrite array with the total number of 0's, then 1's and followed by 2's.
 */
public class SortColors_75 {

    // double pointers
    public void sortColors(int[] nums) {
        var end = nums.length-1;
        for (var i = 2; i > 0; i--) {
            var start = 0;
            while (start < end) {
                if (nums[end] >= i) {
                    end--;
                    continue;
                }

                if (nums[start] == i) {
                    swap(nums, start, end);
                    end--;
                }
                start++;
            }

        }
    }

    void swap(int[] nums, int i, int j) {
        var tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    // counting
//    public void sortColors(int[] nums) {
//        var zeros = 0;
//        var ones = 0;
//        var n = nums.length;
//        for (var num : nums) {
//            if(num == 0) zeros++;
//            else if(num == 1) ones++;
//        }
//
//        for (var i = 0; i < zeros; ++i) {
//            nums[i] = 0;
//        }
//
//        for (var i = zeros; i < zeros + ones; ++i) {
//            nums[i] = 1;
//        }
//
//        for (var i = zeros + ones; i < n; ++i) {
//            nums[i] = 2;
//        }


    /*
    built-in sort
     */
//    public void sortColors(int[] nums) {
//        Arrays.sort(nums);
//    }
}
