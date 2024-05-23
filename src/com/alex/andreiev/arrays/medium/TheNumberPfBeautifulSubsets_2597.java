package com.alex.andreiev.arrays.medium;

/*
You are given an array nums of positive integers and a positive integer k.
A subset of nums is beautiful if it does not contain two integers with an absolute difference equal to k.
Return the number of non-empty beautiful subsets of the array nums.
A subset of nums is an array that can be obtained by deleting some (possibly none) elements from nums.
Two subsets are different if and only if the chosen indices to delete are different.

Example 1:
Input: nums = [2,4,6], k = 2
Output: 4
Explanation: The beautiful subsets of the array nums are: [2], [4], [6], [2, 6].
It can be proved that there are only 4 beautiful subsets in the array [2,4,6].

Example 2:
Input: nums = [1], k = 1
Output: 1
Explanation: The beautiful subset of the array nums is [1].
It can be proved that there is only 1 beautiful subset in the array [1].

Constraints:
    1 <= nums.length <= 20
    1 <= nums[i], k <= 1000

Hint 1
Sort the array nums and create another array cnt of size nums[i].
Hint 2
Use backtracking to generate all the beautiful subsets. If cnt[nums[i] - k] is positive, then it is impossible to add nums[i] in the subset, and we just move to the next index. Otherwise, it is also possible to add nums[i] in the subset, in this case, increase cnt[nums[i]], and move to the next index.
Hint 3
Bonus: Can you solve the problem in O(n log n)?
 */

import java.util.*;

public class TheNumberPfBeautifulSubsets_2597 {
    // Dynamic Programming - Optimized Iterative
    public int beautifulSubsets(int[] nums, int k) {
        int totalCount = 1;
        Map<Integer, Map<Integer, Integer>> freqMap = new TreeMap<>();

        // Calculate frequencies based on remainder
        for (int num : nums) {
            Map<Integer, Integer> fr = freqMap.getOrDefault(num % k, new TreeMap<>());
            fr.put(num, fr.getOrDefault(num, 0) + 1);
            freqMap.put(num % k, fr);
        }

        // Iterate through each remainder group
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : freqMap.entrySet()) {
            int prevNum = -k, prev2 = 0, prev1 = 1, curr = 1;

            // Iterate through each number in the current remainder group
            for (Map.Entry<Integer, Integer> freqEntry : entry.getValue().entrySet()) {
                int num = freqEntry.getKey();
                int freq = freqEntry.getValue();
                // Count of subsets skipping the current number
                int skip = prev1;

                // Count of subsets including the current number
                // Check if the current number and the previous number
                // form a beautiful pair
                int take;
                if (num - prevNum == k) {
                    take = ((1 << freq) - 1) * prev2;
                } else {
                    take = ((1 << freq) - 1) * prev1;
                }

                curr = skip + take; // Store the total count for the current number
                prev2 = prev1;
                prev1 = curr;
                prevNum = num;
            }
            totalCount *= curr;
        }
        return totalCount - 1;
    }

    //    Dynamic Programming - Memoization
//    public int beautifulSubsets(int[] nums, int k) {
//        int totalCount = 1;
//        Map<Integer, Map<Integer, Integer>> freqMap = new TreeMap<>();
//
//        // Calculate frequencies based on remainder
//        for (int num : nums) {
//            int remainder = num % k;
//            Map<Integer, Integer> fr = freqMap.getOrDefault(remainder, new TreeMap<>());
//            fr.put(num, fr.getOrDefault(num, 0) + 1);
//            freqMap.put(remainder, fr);
//        }
//
//        // Calculate subsets for each remainder group
//        for (Map.Entry<Integer, Map<Integer, Integer>> entry : freqMap.entrySet()) {
//            List<Pair<Integer, Integer>> subsets = new ArrayList<>();
//            for (Map.Entry<Integer, Integer> subset : entry.getValue().entrySet()) {
//                subsets.add(new Pair<>(subset.getKey(), subset.getValue()));
//            }
//            int[] counts = new int[subsets.size()]; // Store counts of subsets for memoization
//            Arrays.fill(counts, -1);
//            totalCount *= countBeautifulSubsets(subsets, subsets.size(), k, 0, counts);
//        }
//        return totalCount - 1;
//    }
//
//    private int countBeautifulSubsets(List<Pair<Integer, Integer>> subsets,
//                                      int numSubsets, int difference, int i, int[] counts) {
//        // Base case: Return 1 for a subset of size 1
//        if (i == numSubsets) {
//            return 1;
//        }
//
//        // If the count is already calculated, return it
//        if (counts[i] != -1) {
//            return counts[i];
//        }
//
//        // Calculate subsets where the current subset is not taken
//        int skip = countBeautifulSubsets(subsets, numSubsets, difference, i + 1, counts);
//
//        // Calculate subsets where the current subset is taken
//        int take = (1 << subsets.get(i).getValue()) - 1; // take the current subset
//
//        // If the next number has a difference of 'difference',
//        // calculate subsets accordingly
//        if (i + 1 < numSubsets && subsets.get(i + 1).getKey()
//            - subsets.get(i).getKey() == difference) {
//            take *= countBeautifulSubsets(subsets, numSubsets, difference, i + 2, counts);
//        } else {
//            take *= countBeautifulSubsets(subsets, numSubsets, difference, i + 1, counts);
//        }
//
//        return counts[i] = skip + take; // Store and return total count of subsets
//    }

    //    Optimised Recursion (Deriving Recurrence Relation)
//    public int beautifulSubsets(int[] nums, int k) {
//        int totalCount = 1;
//        Map<Integer, Map<Integer, Integer>> freqMap = new TreeMap<>();
//
//        // Calculate frequencies based on remainder
//        for (int num : nums) {
//            Map<Integer, Integer> fr = freqMap.getOrDefault(num % k, new TreeMap<>());
//            fr.put(num, fr.getOrDefault(num, 0) + 1);
//            freqMap.put(num % k, fr);
//        }
//
//        // Calculate subsets for each remainder group
//        for (Map.Entry<Integer, Map<Integer, Integer>> entry : freqMap.entrySet()) {
//            ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> subsets = new ArrayList<>(
//                entry.getValue().entrySet().size());
//            for (Map.Entry<Integer, Integer> subsetEntry : entry.getValue().entrySet()) {
//                subsets.add(
//                    new AbstractMap.SimpleEntry<>(subsetEntry.getKey(), subsetEntry.getValue()));
//            }
//            totalCount *= countBeautifulSubsets(subsets, subsets.size(), k, 0);
//        }
//
//        return totalCount - 1;
//    }
//
//    private int countBeautifulSubsets(ArrayList<AbstractMap.SimpleEntry<Integer, Integer>> subsets,
//                                      int numSubsets, int difference, int i) {
//        // Base case: Return 1 for a subset of size 1
//        if (i == numSubsets) {
//            return 1;
//        }
//
//        // Calculate subsets where the current subset is not taken
//        int skip = countBeautifulSubsets(subsets, numSubsets, difference, i + 1);
//        // Calculate subsets where the current subset is taken
//        int take = (1 << subsets.get(i).getValue()) - 1;
//
//        // If next number has a 'difference', calculate subsets; otherwise, move
//        // to next
//        if (i + 1 < numSubsets &&
//            subsets.get(i + 1).getKey() - subsets.get(i).getKey() == difference) {
//            take *= countBeautifulSubsets(subsets, numSubsets, difference, i + 2);
//        } else {
//            take *= countBeautifulSubsets(subsets, numSubsets, difference, i + 1);
//        }
//
//        return skip + take; // Return total count of subsets
//    }


    // backtracking with map
//    public int beautifulSubsets(int[] nums, int k) {
//        // Frequency map to track elements
//        Map<Integer, Integer> freqMap = new HashMap<>();
//        // Sort nums array
//        Arrays.sort(nums);
//        return countBeautifulSubsets(nums, k, freqMap, 0) - 1;
//    }
//
//    private int countBeautifulSubsets(int[] nums, int difference, Map<Integer, Integer> freqMap, int i) {
//        // Base case: Return 1 for a subset of size 1
//        if (i == nums.length) {
//            return 1;
//        }
//        // Count subsets where nums[i] is not taken
//        int totalCount = countBeautifulSubsets(nums, difference, freqMap, i + 1);
//
//        // If nums[i] can be taken without violating the condition
//        if (!freqMap.containsKey(nums[i] - difference)) {
//            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) +
//                1); // Mark nums[i] as taken
//
//            // Recursively count subsets where nums[i] is taken
//            totalCount += countBeautifulSubsets(nums, difference, freqMap, i + 1);
//            freqMap.put(nums[i], freqMap.get(nums[i]) -
//                1); // Backtrack: mark nums[i] as not taken
//
//            // Remove nums[i] from freqMap if its count becomes 0
//            if (freqMap.get(nums[i]) == 0) {
//                freqMap.remove(nums[i]);
//            }
//        }
//
//        return totalCount;
//    }


    // bitmask
//    public int beautifulSubsets(int[] nums, int k) {
//        return countBeautifulSubsets(nums, k, 0, 0);
//    }
//
//    private int countBeautifulSubsets(int[] nums, int difference, int index, int mask) {
//        // Base case: Return 1 if mask is greater than 0 (non-empty subset)
//        if (index == nums.length)
//            return mask > 0 ? 1 : 0;
//
//        // Flag to check if the current subset is beautiful
//        boolean isBeautiful = true;
//
//        // Check if the current number forms a beautiful pair with any previous number
//        // in the subset
//        for (var j = 0; j < index && isBeautiful; ++j){
//            isBeautiful = ((1 << j) & mask) == 0 ||
//                Math.abs(nums[j] - nums[index]) != difference;
//        }
//
//        // Recursively calculate beautiful subsets including and excluding the current
//        // number
//        int skip = countBeautifulSubsets(nums, difference, index + 1, mask);
//        int take;
//        if (isBeautiful) {
//            take = countBeautifulSubsets(nums, difference,
//                index + 1, mask + (1 << index));
//        } else {
//            take = 0;
//        }
//
//        return skip + take;
//    }

    // backtracking
//    public int beautifulSubsets(int[] nums, int k) {
//        return backtracking(nums, new ArrayList<>(), 0, k);
//    }
//
//    int backtracking(int[] nums, List<Integer> curList, int index, int k) {
//        if (index == nums.length) {
//            return 0;
//        }
//
//        var num = nums[index];
//        curList.add(num);
//        // var result = curList.size() == 1 ? 1 : 0;
//        // check difference
//        var isBeautifulSet = true;
//        for (var i = 0; i < curList.size() - 1; i++) {
//            if (curList.get(i) == num) {
//                break;
//            }
//            if (Math.abs(curList.get(i) - num) == k) {
//                isBeautifulSet = false;
//                break;
//            }
//        }
//        var result = isBeautifulSet ? 1 : 0;
//
//        index++;
//        if (isBeautifulSet) {
//            result += backtracking(nums, curList, index, k);
//        }
//
//        curList.remove(curList.size()-1);
//        result += backtracking(nums, curList, index, k);
//
//        return result;
//    }
}
