package com.alex.andreiev.arrays;

/*
Given a sorted array of distinct integers and a target value, return the index
if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
    1 <= nums.length <= 104
    -104 <= nums[i] <= 104
    nums contains distinct values sorted in ascending order.
    -104 <= target <= 104

 */

public class SearchInsertPosition_easy_35 {
    public int searchInsert(int[] nums, int target) {
        var len = nums.length;
        if (len == 0) {
            return 0;
        }

        var startIndex = 0;
        var endIndex = len - 1;
        while (startIndex <= endIndex) {
            var mid = (endIndex + startIndex) / 2;
            var halfValue = nums[mid];

            if (halfValue == target) {
                return mid;
            } else if (target < halfValue) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return startIndex;
    }
}
