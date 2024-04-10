package com.alex.andreiev.arrays.easy;

import java.util.HashSet;
import java.util.Set;

/*Given an integer array nums, return true if any value appears at least twice in the array,
    and return false if every element is distinct.

Constraints:
    1 <= nums.length <= 105
    -109 <= nums[i] <= 109
*/
public class ContainsDuplicate_217 {

    public boolean containsDuplicate(int[] nums) {

//        Approach 1
//        Time complexity - O(N^2)
//        Space complexity - O(1)
/*
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i]) return true;
            }
        }
        return false;
*/

//         Approach 2
//            Time complexity - O(N log N) + O(N) = O(N log N)
//            Space complexity = O(1)
/*
         Arrays.sort(nums);
         for (int i = 0; i < nums.length-1; i++)
             if (nums[i] == nums[i+1]) return true;
         return false;
*/

/*
    Approach 3
    Time complexity - O(1) + O(N) = O(N)
    Space complexity - O(N)
*/
    Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
        if (set.contains(x)) return true;
        set.add(x);
    }
    return false;
    }
}
