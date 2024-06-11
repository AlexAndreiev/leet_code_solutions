package com.alex.andreiev.companies.microsoft;

/*
There is a small, one-way bridge that can carry a maximum weight of U units at a time.
There is also a line of N cars waiting to cross the bridge.
The weights of the cars are given as an array weight.
The weight of the K-th car in the line is weight[K] (for K within the range [0..N-1]).
The car that will enter the bridge first weighs weight[0], the car that will enter second weighs weight[1], and so on.

At most two cars can be on the bridge at the same time.
To begin, the first two cars in line will enter the bridge.
Then the third car will enter the bridge as soon as the first car leaves the bridge,
the fourth car will enter when the second car leaves, and so on.
The cars leave the bridge in the same order they entered it.

However, this may lead to a situation where cars exceed the bridge's weight limit.
To prevent such a situation, some drivers have to turn back.
When a driver turns back, all drivers behind them in line move one position closer to the bridge.
The driver who turns back is removed from the line and will not try to cross the bridge again.

Your task is to find the minimum number of drivers that must turn back so that the bridge will not be overloaded.

Write a function:
    class Solution { public int solution(int U, int[] weight); }
that, given an integer U representing the weight limit of the bridge and
an array weight of N integers representing the weights of the cars in line,
returns the minimum number of drivers that must turn back so that the bridge will not be overloaded.

Examples:
1. For U = 9 and weight = [5, 3, 8, 1, 8, 7, 7, 6], the function should return 4.
After the 3rd, 5th, 6th and 7th cars turn back, the weights of the remaining cars in line are [5, 3, 1, 6].
Notice that instead of the 5th, 6th and 7th cars, any three of the last four cars can turn back to obtain an optimal answer.
The cars will then cross the bridge as follows:
        the 1st car (weight 5) enters the bridge;
        the 2nd car (weight 3) enters the bridge, the total weight of cars on the bridge is 5 + 3 = 8;
        the 1st car (weight 5) leaves the bridge;
        the 3rd car (weight 1) enters the bridge, the total weight of cars on the bridge is 3 + 1 = 4;
        the 2nd car (weight 3) leaves the bridge;
        the 4th car (weight 6) enters the bridge, the total weight of cars on the bridge is 1 + 6 = 7;
        the 3rd car (weight 1) leaves the bridge;
        the 4th car (weight 6) leaves the bridge.

During this process, the total weight of cars on the bridge does not exceed 9.
2. For U = 7 and weight = [7, 6, 5, 2, 7, 4, 5, 4], the function should return 5.
After the 1st, 2nd, 5th, 6th and 7th cars turn back, the weights of the remaining cars in line are [5, 2, 4].
Notice that instead of the 6th and 7th cars, any two of the last three cars can turn back to obtain an optimal answer.
3. For U = 7 and weight = [3, 4, 3, 1], the function should return 0. There is no need for any car to turn back.

Write an efficient algorithm for the following assumptions:
        N is an integer within the range [1..100,000];
        each element of array weight is an integer within the range [1..1,000,000,000];
        U is an integer within the range [1..1,000,000,000].
 */

public class MinTurnedBackDrivers {
}
