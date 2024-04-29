package com.alex.andreiev.arrays.medium;

/*
Given an array of integers temperatures represents the daily temperatures,
return an array answer such that answer[i] is the number of days you have to wait after
the ith day to get a warmer temperature.
If there is no future day for which this is possible, keep answer[i] == 0 instead.

Example 1:
Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]

Example 2:
Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]

Example 3:
Input: temperatures = [30,60,90]
Output: [1,1,0]

Constraints:
    1 <= temperatures.length <= 105
    30 <= temperatures[i] <= 100

Hint 1
If the temperature is say, 70 today, then in the future a warmer temperature
must be either 71, 72, 73, ..., 99, or 100.
We could remember when all of them occur next.
 */

import java.util.Stack;

public class DailyTemperature_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        var results = new int[temperatures.length];
        var stack = new Stack<Integer>();
        for (var i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                results[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return results;
    }
}
