package com.alex.andreiev.arrays.easy;

import java.util.Arrays;
/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays
    and you may return the result in any order.

Constraints:
    1 <= nums1.length, nums2.length <= 1000
    0 <= nums1[i], nums2[i] <= 1000

Follow up:
    What if the given array is already sorted? How would you optimize your algorithm?
    What if nums1's size is small compared to nums2's size? Which algorithm is better?
    What if elements of nums2 are stored on disk, and the memory is limited such that
        you cannot load all elements into the memory at once?
*/

public class IntersectionOfTwoArrays2_350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)
            return new int[]{};
        /*
        * Time complexity - O(n log n)
        * Space complexity - O(n)
        * */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        var resArray = new int[Math.min(nums1.length, nums2.length)];
        int pos = 0;
        int p1 = 0, p2 = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            if (nums1[p1] == nums2[p2]) {
                resArray[pos++] = nums1[p1];
                p1++;
                p2++;
            }
            else if (nums1[p1] < nums2[p2])
                p1++;
            else if (nums1[p1] > nums2[p2])
                p2++;
        }
        return Arrays.copyOf(resArray, pos);
    }
}
