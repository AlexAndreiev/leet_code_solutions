package com.alex.andreiev.arrays.medium;

/*
You are given a sorted integer array arr containing 1 and prime numbers,
where all the integers of arr are unique.
You are also given an integer k.

For every i and j where 0 <= i < j < arr.length,
we consider the fraction arr[i] / arr[j].

Return the kth smallest fraction considered.
Return your answer as an array of integers of size 2,
where answer[0] == arr[i] and answer[1] == arr[j].

Example 1:
Input: arr = [1,2,3,5], k = 3
Output: [2,5]
Explanation: The fractions to be considered in sorted order are:
1/5, 1/3, 2/5, 1/2, 3/5, and 2/3.
The third fraction is 2/5.

Example 2:
Input: arr = [1,7], k = 1
Output: [1,7]

Constraints:
    2 <= arr.length <= 1000
    1 <= arr[i] <= 3 * 104
    arr[0] == 1
    arr[i] is a prime number for i > 0.
    All the numbers of arr are unique and sorted in strictly increasing order.
    1 <= k <= arr.length * (arr.length - 1) / 2
 */

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestPrimeFraction_786 {

    // heap
    // 224 ms
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // Create a priority queue to store pairs of fractions
        var pq = new PriorityQueue<double[]>(Comparator.comparingDouble(a -> a[0]));

        // Push the fractions formed by dividing each element by
        // the largest element into the priority queue
        for (int i = 0; i < arr.length; i++) {
            pq.offer(new double[] {
                (double)arr[i] / arr[arr.length - 1],
                i,
                arr.length - 1
            });
        }

        // Iteratively remove the top element (smallest fraction)
        // and replace it with the next smallest fraction
        while (--k > 0) {
            double[] cur = pq.poll();
            int numeratorIndex = (int) cur[1];
            int denominatorIndex = (int) cur[2] - 1;
            if (denominatorIndex > numeratorIndex) {
                pq.offer(new double[] {
                    (double)arr[numeratorIndex] / arr[denominatorIndex],
                    numeratorIndex,
                    denominatorIndex
                });
            }
        }

        // Retrieve the kth smallest fraction from
        // the top of the priority queue
        double[] result = pq.poll();
        return new int[]{arr[(int) result[1]], arr[(int) result[2]]};
    }

    // binary search
    // 4 ms
//    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//        var n = arr.length;
//        var left = 0d;
//        var right = 1.0d;
//
//        // Binary search for finding the kth smallest prime fraction
//        while (left < right) {
//            // Calculate the middle value
//            var mid = (left + right) / 2;
//
//            // Initialize variables to keep track of maximum fraction and indices
//            var maxFraction = 0.0;
//            var totalSmallerFractions = 0;
//            var numeratorIdx = 0;
//            var denominatorIdx = 0;
//            var j = 1;
//
//            // Iterate through the array to find fractions smaller than mid
//            for (var i = 0; i < n - 1; i++) {
//                while (j < n && (double)arr[i]/arr[j] > mid) {
////                while (j < n && arr[i] >= mid * arr[j]) {
//                    j++;
//                }
//
//                // Count smaller fractions
//                totalSmallerFractions += (n - j);
//
//                // If we have exhausted the array, break
//                if (j == n) break;
//
//                // Calculate the fraction
//                double fraction = (double) arr[i] / arr[j];
//
//                // Update maxFraction and indices if necessary
//                if (fraction > maxFraction) {
//                    numeratorIdx = i;
//                    denominatorIdx = j;
//                    maxFraction = fraction;
//                }
//            }
//
//            // Check if we have found the kth smallest prime fraction
//            if (totalSmallerFractions == k) {
//                return new int[]{arr[numeratorIdx], arr[denominatorIdx]};
//            } else if (totalSmallerFractions > k) {
//                right = mid; // Adjust the range for binary search
//            } else {
//                left = mid; // Adjust the range for binary search
//            }
//        }
//        return new int[]{}; // Return empty array if kth smallest prime fraction not found
//    }


    // 682 ms
//    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
//        var heap = new PriorityQueue<double[]>(
//            Comparator.comparingDouble(a -> a[0])
//        );
//
//        for (var i = 0; i < arr.length; i++) {
//            for (var j = i+1; j <arr.length; j++) {
//                heap.offer(new double[] {(double)arr[i]/arr[j], arr[i], arr[j]});
//            }
//        }
//
//        while (k > 1) {
//            heap.poll();
//            k--;
//        }
//
//        var result = heap.poll();
//        return new int[] {(int)result[1], (int)result[2]};
//    }
}
