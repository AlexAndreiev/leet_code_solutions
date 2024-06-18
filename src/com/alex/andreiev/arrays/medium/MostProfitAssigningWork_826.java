package com.alex.andreiev.arrays.medium;

import java.util.*;

/*
You have n jobs and m workers. You are given three arrays: difficulty, profit, and worker where:
    difficulty[i] and profit[i] are the difficulty and the profit of the ith job, and
    worker[j] is the ability of jth worker (i.e., the jth worker can only complete a job with difficulty at most worker[j]).
Every worker can be assigned at most one job, but one job can be completed multiple times.
    For example, if three workers attempt the same job that pays $1, then the total profit will be $3.
    If a worker cannot complete any job, their profit is $0.
Return the maximum profit we can achieve after assigning the workers to the jobs.

Example 1:
Input: difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
Output: 100
Explanation: Workers are assigned jobs of difficulty [4,4,6,6] and they get a profit of [20,20,30,30] separately.

Example 2:
Input: difficulty = [85,47,57], profit = [24,66,99], worker = [40,25,25]
Output: 0

Constraints:
    n == difficulty.length
    n == profit.length
    m == worker.length
    1 <= n, m <= 104
    1 <= difficulty[i], profit[i], worker[i] <= 105
 */
public class MostProfitAssigningWork_826 {

    // two pointers
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        var jobProfile = new ArrayList<int[]>();
        for (int i = 0; i < difficulty.length; i++) {
            jobProfile.add(new int[] { difficulty[i], profit[i] });
        }

        // Sort both worker and jobProfile arrays
        Arrays.sort(worker);
        jobProfile.sort(Comparator.comparingInt(a -> a[0]));

        int netProfit = 0, maxProfit = 0, index = 0;
        for (int i = 0; i < worker.length; i++) {
            // While the index has not reached the end and worker can pick a job
            // with greater difficulty move ahead.
            while (
                    index < difficulty.length &&
                            worker[i] >= jobProfile.get(index)[0]
            ) {
                maxProfit = Math.max(maxProfit, jobProfile.get(index)[1]);
                index++;
            }
            netProfit += maxProfit;
        }
        return netProfit;
    }

    // Binary Search and Greedy (Sort by Job Difficulty)
//    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
//        var n = difficulty.length;
//        var pairList = new ArrayList<int[]>(n);
//        for (int i = 0; i < n; i++) {
//            pairList.add(new int[] {difficulty[i], profit[i]});
//        }
//
//        pairList.sort(Comparator.comparingInt(a -> a[0]));
//        for (var i = 0; i < n-1; i++) {
//            pairList.get(i+1)[1] = Math.max(pairList.get(i)[1], pairList.get(i+1)[1]);
//        }
//
//        var sum = 0;
//        for (int workerAbility : worker) {
//            var l = 0;
//            var r = n-1;
//            var maxProfit = 0;
//            while (l <= r) {
//                var mid = (l + r) / 2;
//                var pair = pairList.get(mid);
//                if (pair[0] <= workerAbility) {
//                    maxProfit = Math.max(maxProfit, pair[1]);
//                    l = mid + 1;
//                } else {
//                    r = mid - 1;
//                }
//            }
//
//            sum += maxProfit;
//        }
//
//        return sum;
//    }
}
