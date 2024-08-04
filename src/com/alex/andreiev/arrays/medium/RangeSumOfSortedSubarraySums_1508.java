package com.alex.andreiev.arrays.medium;

import java.util.*;

/*
You are given the array nums consisting of n positive integers.
You computed the sum of all non-empty continuous subarrays from the array and then sorted them in non-decreasing order,
creating a new array of n * (n + 1) / 2 numbers.
Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array.
Since the answer can be a huge number return it modulo 109 + 7.

Example 1:
Input: nums = [1,2,3,4], n = 4, left = 1, right = 5
Output: 13
Explanation: All subarray sums are 1, 3, 6, 10, 2, 5, 9, 3, 7, 4.
After sorting them in non-decreasing order we have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10].
The sum of the numbers from index le = 1 to ri = 5 is 1 + 2 + 3 + 3 + 4 = 13.

Example 2:
Input: nums = [1,2,3,4], n = 4, left = 3, right = 4
Output: 6
Explanation: The given array is the same as example 1.
We have the new array [1, 2, 3, 3, 4, 5, 6, 7, 9, 10].
The sum of the numbers from index le = 3 to ri = 4 is 3 + 3 = 6.

Example 3:
Input: nums = [1,2,3,4], n = 4, left = 1, right = 10
Output: 50

Constraints:
    n == nums.length
    1 <= nums.length <= 1000
    1 <= nums[i] <= 100
    1 <= left <= right <= n * (n + 1) / 2
 */
public class RangeSumOfSortedSubarraySums_1508 {
    final long MOD = 1_000_000_007;

    // binary search and sliding window
    public int rangeSum(int[] nums, int n, int left, int right) {
        long result =
            (sumOfFirstK(nums, n, right) - sumOfFirstK(nums, n, left - 1)) %
                MOD;
        // Ensure non-negative result
        return (int) ((result + MOD) % MOD);
    }

    // Helper function to count subarrays with sum <= target and their total sum.
    private Map.Entry<Integer, Long> countAndSum(
        int[] nums,
        int n,
        int target
    ) {
        int count = 0;
        long currentSum = 0, totalSum = 0, windowSum = 0;
        for (int j = 0, i = 0; j < n; ++j) {
            currentSum += nums[j];
            windowSum += nums[j] * (j - i + 1);
            while (currentSum > target) {
                windowSum -= currentSum;
                currentSum -= nums[i++];
            }
            count += j - i + 1;
            totalSum += windowSum;
        }
        return new AbstractMap.SimpleEntry<>(count, totalSum);
    }

    // Helper function to find the sum of the first k smallest subarray sums.
    private long sumOfFirstK(int[] nums, int n, int k) {
        int minSum = Arrays.stream(nums).min().getAsInt();
        int maxSum = Arrays.stream(nums).sum();
        int left = minSum, right = maxSum;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (countAndSum(nums, n, mid).getKey() >= k) right = mid - 1;
            else left = mid + 1;
        }
        Map.Entry<Integer, Long> result = countAndSum(nums, n, left);
        // There can be more subarrays with the same sum of left.
        return result.getValue() - left * (result.getKey() - k);
    }

    // greedy
//    public int rangeSum(int[] nums, int n, int left, int right) {
//        var list = new ArrayList<Long>();
//        for (var i = 0; i < n; i++) {
//            var sum = 0L;
//            for (var j = i; j < n; j++) {
//                sum += nums[j];
//                list.add(sum);
//            }
//        }
//
//        list.sort(null);
//
//        var sum = 0L;
//        while (left <= right) {
//            sum += list.get(left - 1);
//            left++;
//        }
//
//        return (int) (sum % MOD);
//    }

    // priority queue
//    public int rangeSum(int[] nums, int n, int left, int right) {
//        var pq = new PriorityQueue<int[]>(Comparator.comparingInt(o -> o[0]));
//        for (var i = 0; i < n; i++) {
//            pq.offer(new int[] { nums[i], i });
//        }
//
//        var sum = 0L;
//        for (var i = 1; i <= right; i++) {
//            var p = pq.poll();
//            if (i >= left) {
//                sum = (sum + p[0]);
//            }
//
//            if (p[1] < n - 1) {
//                p[0] += nums[++p[1]];
//                pq.offer(p);
//            }
//        }
//        return (int) (sum % MOD);
//    }

}
