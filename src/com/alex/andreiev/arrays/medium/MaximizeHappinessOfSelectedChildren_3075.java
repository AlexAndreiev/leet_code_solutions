package com.alex.andreiev.arrays.medium;

/*
You are given an array happiness of length n, and a positive integer k.
There are n children standing in a queue, where the ith child has happiness value happiness[i].
You want to select k children from these n children in k turns.
In each turn, when you select a child, the happiness value of all the children
that have not been selected till now decreases by 1.
Note that the happiness value cannot become negative and gets decremented only if it is positive.

Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.

Example 1:
Input: happiness = [1,2,3], k = 2
Output: 4
Explanation: We can pick 2 children in the following way:
- Pick the child with the happiness value == 3. The happiness value of the remaining children becomes [0,1].
- Pick the child with the happiness value == 1. The happiness value of the remaining child becomes [0]. Note that the happiness value cannot become less than 0.
The sum of the happiness values of the selected children is 3 + 1 = 4.

Example 2:
Input: happiness = [1,1,1,1], k = 2
Output: 1
Explanation: We can pick 2 children in the following way:
- Pick any child with the happiness value == 1. The happiness value of the remaining children becomes [0,0,0].
- Pick the child with the happiness value == 0. The happiness value of the remaining child becomes [0,0].
The sum of the happiness values of the selected children is 1 + 0 = 1.

Example 3:
Input: happiness = [2,3,4,5], k = 1
Output: 5
Explanation: We can pick 1 child in the following way:
- Pick the child with the happiness value == 5. The happiness value of the remaining children becomes [1,2,3].
The sum of the happiness values of the selected children is 5.



Constraints:

    1 <= n == happiness.length <= 2 * 105
    1 <= happiness[i] <= 108
    1 <= k <= n


 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class MaximizeHappinessOfSelectedChildren_3075 {
    public long maximumHappinessSum(int[] happiness, int k) {
        var heap = new PriorityQueue<Integer>(happiness.length, Comparator.reverseOrder());
        for (var num : happiness) {
            heap.add(num);
        }

        var sum = 0L;
        var steps = 0;
        while (steps < k) {
            sum += Math.max(heap.poll() - steps, 0);
            steps++;
        }

        return sum;
    }


    //    public long maximumHappinessSum(int[] happiness, int k) {
//        var arr = Arrays.stream(happiness).boxed().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);
//        var steps = 0;
//        var sum = 0L;
//        var pos = 0;
//        while (pos < k ) {
//            sum += Math.max(arr[pos - steps], 0);
//            steps++;
//            pos++;
//        }
//
//        return sum;
//    }
}
