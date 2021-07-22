package com.alex.andreiev.string;

/*
The count-and-say sequence is a sequence of digit strings defined by the recursive formula:
        countAndSay(1) = "1"
        countAndSay(n) is the way you would "say" the digit string from countAndSay(n-1),
        which is then converted into a different digit string.
        To determine how you "say" a digit string, split it into the minimal number of groups so that each group is
        a contiguous section all of the same character. Then for each group, say the number of characters, then say the character.
        To convert the saying into a digit string, replace the counts with a number and concatenate every saying.

    Constraints:
    1 <= n <= 30
   */

public class CountAndSay_medium_38 {

    public String countAndSay(int n) {
/*
    Approach 1
    Time complexity - O(N)
    Space complexity - O(N)
*/
/*
        if (n == 1) return "1";
        n--;
        var sb = new StringBuilder();
        sb.append("1");
        while (n > 0) {
            var tmpSb = new StringBuilder();
            char ch = sb.charAt(0);
            int count = 1;
            for (int i = 1; i < sb.length(); i++) {
                if (sb.charAt(i) == ch)
                    count++;
                else {
                    tmpSb.append(count).append(ch);
                    ch = sb.charAt(i);
                    count = 1;
                }
            }
            tmpSb.append(count);
            tmpSb.append(ch);
            sb = tmpSb;
            n--;
        }
        return sb.toString();
*/
/*
      Approach 2
      Time complexity - O(N)
      Space complexity  - O(N)
*/
        if (n == 1) return "1";
        var res = countAndSay(n-1);
        var sb = new StringBuilder();
        var len = res.length();
        int i = 0;
        while(i < len) {
            var prev = res.charAt(i);
            int start = i;
            while (i < len && prev == res.charAt(i))
                i++;
            sb.append(i-start).append(prev);
        }
        return sb.toString();
    }
}