package com.alex.andreiev.arrays.medium;

/*
We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents
its direction (positive meaning right, negative meaning left).
Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions.
If two asteroids meet, the smaller one will explode.
If both are the same size, both will explode.
Two asteroids moving in the same direction will never meet.

Example 1:
Input: asteroids = [5,10,-5]
Output: [5,10]
Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.

Example 2:
Input: asteroids = [8,-8]
Output: []
Explanation: The 8 and -8 collide exploding each other.

Example 3:
Input: asteroids = [10,2,-5]
Output: [10]
Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

Constraints:
    2 <= asteroids.length <= 104
    -1000 <= asteroids[i] <= 1000
    asteroids[i] != 0
 */

import java.util.Stack;

public class AsteroidCollision_735 {

    public int[] asteroidCollision(int[] asteroids) {
        var stack = new Stack<Integer>();

        for (int num : asteroids) {
            if (num > 0 || stack.isEmpty()) {
                stack.push(num);
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(num)) {
                stack.pop();
            }

            if (!stack.isEmpty() && stack.peek() == Math.abs(num)) {
                stack.pop();
            } else if (stack.isEmpty() || stack.peek() < 0) {
                stack.push(num);
            }
        }

        var result = new int[stack.size()];
        for (var i = stack.size()-1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
