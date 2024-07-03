package com.alex.andreiev.arrays.medium;

import java.util.*;

/*
You are given an integer array nums.

In one move, you can choose one element of nums and change it to any value.

Return the minimum difference between the largest and smallest value of nums after performing at most three moves.

Example 1:
Input: nums = [5,3,2,4]
Output: 0
Explanation: We can make at most 3 moves.
In the first move, change 2 to 3. nums becomes [5,3,3,4].
In the second move, change 4 to 3. nums becomes [5,3,3,3].
In the third move, change 5 to 3. nums becomes [3,3,3,3].
After performing 3 moves, the difference between the minimum and maximum is 3 - 3 = 0.

Example 2:
Input: nums = [1,5,0,10,14]
Output: 1
Explanation: We can make at most 3 moves.
In the first move, change 5 to 0. nums becomes [1,0,0,10,14].
In the second move, change 10 to 0. nums becomes [1,0,0,0,14].
In the third move, change 14 to 1. nums becomes [1,0,0,0,1].
After performing 3 moves, the difference between the minimum and maximum is 1 - 0 = 1.
It can be shown that there is no way to make the difference 0 in 3 moves.

Example 3:
Input: nums = [3,100,20]
Output: 0
Explanation: We can make at most 3 moves.
In the first move, change 100 to 7. nums becomes [3,7,20].
In the second move, change 20 to 7. nums becomes [3,7,7].
In the third move, change 3 to 7. nums becomes [7,7,7].
After performing 3 moves, the difference between the minimum and maximum is 7 - 7 = 0.

Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109

 Hint 1
The minimum difference possible is obtained by removing three elements
between the three smallest and three largest values in the array.
 */
public class MinimumDifferenceBetweenLargestAndSmallestValuesInTheeMoves_1509 {

    public int minDifference(int[] nums) {
        var numsSize = nums.length;
        if (numsSize < 5) {
            return 0;
        }

        // Find the four smallest elements using a fixed-size max heap
        var maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
        for (var num : nums) {
            maxHeap.offer(num);
            if (maxHeap.size() > 4) {
                maxHeap.poll();
            }
        }
        var smallestFour = new ArrayList<>(maxHeap);
        smallestFour.sort(Comparator.naturalOrder());

        // Find the four largest elements using a fixed-size min heap
        var minHeap = new PriorityQueue<Integer>();
        for (var num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > 4) {
                minHeap.poll();
            }
        }
        var largestFour = new ArrayList<>(minHeap);
        largestFour.sort(Comparator.naturalOrder());

        int minDiff = Integer.MAX_VALUE;
        // Four scenarios to compute the minimum difference
        for (int i = 0; i < 4; i++) {
            minDiff = Math.min(
                    minDiff,
                    largestFour.get(i) - smallestFour.get(i)
            );
        }

        return minDiff;
    }


    // Sort + Greedy Deletion
//    public int minDifference(int[] nums) {
//        var n = nums.length;
//        if (n < 5) {
//            return 0;
//        }
//        Arrays.sort(nums);
//
//        int minDiff = Integer.MAX_VALUE;
//
//        // Four scenarios to compute the minimum difference
//        for (int left = 0, right = n - 4; left < 4; left++, right++) {
//            minDiff = Math.min(minDiff, nums[right] - nums[left]);
//        }
//
//        return minDiff;
//    }
}
