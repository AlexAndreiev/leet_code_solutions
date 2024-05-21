package com.alex.andreiev.arrays.medium;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets.
Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]

Constraints:
    1 <= nums.length <= 10
    -10 <= nums[i] <= 10
    All the numbers of nums are unique.
 */

public class Subsets_78 {

    // Lexicographic (Binary Sorted) Subsets
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList();
        int n = nums.length;

        for (int i = (int) Math.pow(2, n); i < (int) Math.pow(2, n + 1); ++i) {
            // generate bitmask, from 0..00 to 1..11
            String bitmask = Integer.toBinaryString(i).substring(1);

            // append subset corresponding to that bitmask
            List<Integer> curr = new ArrayList();
            for (int j = 0; j < n; ++j) {
                if (bitmask.charAt(j) == '1') curr.add(nums[j]);
            }
            output.add(curr);
        }
        return output;
    }

    // Cascading
//    public List<List<Integer>> subsets(int[] nums) {
//        List<List<Integer>> output = new ArrayList();
//        output.add(new ArrayList<Integer>());
//
//        for (int num : nums) {
//            List<List<Integer>> newSubsets = new ArrayList();
//            for (List<Integer> curr : output) {
//                newSubsets.add(
//                    new ArrayList<Integer>(curr) {
//                        {
//                            add(num);
//                        }
//                    }
//                );
//            }
//            for (List<Integer> curr : newSubsets) {
//                output.add(curr);
//            }
//        }
//        return output;
//    }

    // backtracking, recursion
//    List<List<Integer>> output = new ArrayList();
//    int n, k;
//    public void backtrack(int first, ArrayList<Integer> curr, int[] nums) {
//        // If the combination is done
//        if (curr.size() == k) {
//            output.add(new ArrayList(curr));
//            return;
//        }
//        for (int i = first; i < n; ++i) {
//            // Add i into the current combination
//            curr.add(nums[i]);
//
//            // Use the next integers to complete the combination
//            backtrack(i + 1, curr, nums);
//
//            // Backtrack
//            curr.remove(curr.size() - 1);
//        }
//    }
//
//    public List<List<Integer>> subsets(int[] nums) {
//        n = nums.length;
//        for (k = 0; k < n + 1; ++k) {
//            backtrack(0, new ArrayList<Integer>(), nums);
//        }
//        return output;
//    }

    // backtracking, recursion
//    public List<List<Integer>> subsets(int[] nums) {
//        var subsets = new ArrayList<List<Integer>>();
//        findSubsets(nums, 0, new ArrayList(), subsets);
//        return subsets;
//    }
//
//    void findSubsets(int nums[], int pos, List<Integer> subset, List<List<Integer>> subsets) {
//        if (pos == nums.length) {
//            subsets.add(new ArrayList<>(subset));
//            return;
//        }
//
//        subset.add(nums[pos]);
//        findSubsets(nums, pos+1, subset, subsets);
//
//        subset.removeLast();
//        findSubsets(nums, pos+1, subset, subsets);
//    }
}
