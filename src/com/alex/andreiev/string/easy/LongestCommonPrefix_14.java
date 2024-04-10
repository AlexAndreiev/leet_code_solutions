package com.alex.andreiev.string.easy;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lower-case English letters.
*/


public class LongestCommonPrefix_14 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        /* Approach 0
        * Time complexity - O(n*m)
        * Space complexity - O(1)
        * */
/*
        int min = Integer.MAX_VALUE;
        for (var str : strs) {
            if (str.length() < min)
                min = str.length();
        }

        for (int i = 0; i < min; i++) {
            var ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (ch != strs[j].charAt(i))
                    return strs[0].substring(0, i);
            }
        }

        return strs[0].substring(0, min);
*/
        /* Approach 1 - Horizontal scanning
        * Time complexity - O(n*m)
        * Space complexity - O(1)
        * */
/*
        var prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
*/

        /* Approach 2 - Vertical scanning
         * Time complexity - O(n*m)
         * Space complexity - O(1)
         * */
/*
        for (int i = 0; i < strs[0].length() ; i++){
            var c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
*/

        /* Approach 3 - Divide and conquer
         * Time complexity - O(n*m)
         * Space complexity - O(m log n)
         * */
/*
        return LCP(strs, 0, strs.length - 1);
*/

        /* Approach 4 - Binary search
         * Time complexity - O(S log m)
         * Space complexity - O(1)
         * */
        int min = Integer.MAX_VALUE;
        for (var str : strs) {
            if (str.length() < min)
                min = str.length();
        }

        int low = 1;
        int hi = min;
        while (low <= hi) {
            int mid = (low + hi) / 2;
            if (isCommonPrefix(strs, mid))
                low = mid+1;
            else
                hi = mid - 1;
        }
        return strs[0].substring(0, hi);
    }

    private String LCP(String[] strs, int l, int r) {
        if (l == r)
            return strs[l];

        int mid = (r + l)/2;
        String lcpLeft = LCP(strs, l, mid);
        String lcpRigth = LCP(strs, mid + 1, r);
        return commonPrefix(lcpLeft, lcpRigth);
    }

    private String commonPrefix(String s1, String s2) {
        int min = Math.min(s1.length(), s2.length());
        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return s1.substring(0, i);
        }
        return s1.substring(0, min);
    }

    private boolean isCommonPrefix(String[] strs, int len) {
        var str = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str))
                return false;
        }
        return true;
    }
}
