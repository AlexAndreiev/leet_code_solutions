package com.alex.andreiev.linkedList.medium;

import com.alex.andreiev.utils.ListNode;

/*
A critical point in a linked list is defined as either a local maxima or a local minima.
A node is a local maxima if the current node has a value strictly greater than the previous node and the next node.
A node is a local minima if the current node has a value strictly smaller than the previous node and the next node.
Note that a node can only be a local maxima/minima if there exists both a previous node and a next node.
Given a linked list head, return an array of length 2 containing [minDistance,
maxDistance] where minDistance is the minimum distance between any two distinct critical points
and maxDistance is the maximum distance between any two distinct critical points.
If there are fewer than two critical points, return [-1, -1].

Example 1:
Input: head = [3,1]
Output: [-1,-1]
Explanation: There are no critical points in [3,1].

Example 2:
Input: head = [5,3,1,2,5,1,2]
Output: [1,3]
Explanation: There are three critical points:
- [5,3,1,2,5,1,2]: The third node is a local minima because 1 is less than 3 and 2.
- [5,3,1,2,5,1,2]: The fifth node is a local maxima because 5 is greater than 2 and 1.
- [5,3,1,2,5,1,2]: The sixth node is a local minima because 1 is less than 5 and 2.
The minimum distance is between the fifth and the sixth node. minDistance = 6 - 5 = 1.
The maximum distance is between the third and the sixth node. maxDistance = 6 - 3 = 3.

Example 3:
Input: head = [1,3,2,2,3,2,2,2,7]
Output: [3,3]
Explanation: There are two critical points:
- [1,3,2,2,3,2,2,2,7]: The second node is a local maxima because 3 is greater than 1 and 2.
- [1,3,2,2,3,2,2,2,7]: The fifth node is a local maxima because 3 is greater than 2 and 2.
Both the minimum and maximum distances are between the second and the fifth node.
Thus, minDistance and maxDistance is 5 - 2 = 3.
Note that the last node is not considered a local maxima because it does not have a next node.

Constraints:
    The number of nodes in the list is in the range [2, 105].
    1 <= Node.val <= 105

Hint 1
The maximum distance must be the distance between the first and last critical point.
Hint 2
For each adjacent critical point, calculate the difference and check if it is the minimum distance.
 */
public class FindTheMinimumAndMaximumNumberOfNodesBetweenCriticalPoints_2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        var minPos = -1;
        var maxPos =-1;
        var minDiff = Integer.MAX_VALUE;
        var counter = 1;
        var prev = head;
        var lastCriticalIndx = -1;
        head = head.next;
        while (head.next != null) {
            if ((head.val > prev.val && head.val > head.next.val) || (head.val < prev.val && head.val < head.next.val)) {
                if (minPos == -1) {
                    minPos = counter;
                }
                if (lastCriticalIndx != -1) {
                    minDiff = Math.min(minDiff, counter - lastCriticalIndx);
                }
                lastCriticalIndx = counter;

                maxPos = counter;
            }
            prev = head;
            head = head.next;
            counter++;
        }

        if (minPos == maxPos) {
            return new int[] {-1, -1};
        }
        return new int[] {minDiff, maxPos - minPos};
    }
}
