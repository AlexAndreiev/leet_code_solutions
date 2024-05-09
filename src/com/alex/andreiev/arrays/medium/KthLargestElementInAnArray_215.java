package com.alex.andreiev.arrays.medium;

/*
Given an integer array nums and an integer k, return the kth largest element in the array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.
Can you solve it without sorting?

Example 1:
Input: nums = [3,2,1,5,6,4], k = 2
Output: 5

Example 2:
Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4

Constraints:
    1 <= k <= nums.length <= 105
    -104 <= nums[i] <= 104
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray_215 {

    // 71 ms
    public int findKthLargest(int[] nums, int k) {
        var heap = new PriorityQueue<Integer>(nums.length, Comparator.reverseOrder());
        for (var num : nums) {
            heap.add(num);
        }

        while (k > 1) {
            heap.poll();
            k--;
        }

        return heap.poll();
    }
}
