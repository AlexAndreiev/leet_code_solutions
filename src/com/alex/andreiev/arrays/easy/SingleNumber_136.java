package com.alex.andreiev.arrays.easy;

/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Constraints:
    1 <= nums.length <= 3 * 104
    -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.
*/

public class SingleNumber_136 {

    /*
    * Time complexity - O(n)
    * Space complexity - O(1)
    * */
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = 0;
        for (int num : nums)
            res ^= num;
        return res;
    }
}
