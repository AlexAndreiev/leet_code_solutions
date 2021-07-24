package com.alex.andreiev.arrays;

/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list,
and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.

Constraints:
    1 <= digits.length <= 100
    0 <= digits[i] <= 9

*/

public class PlusOne_easy_66 {
    public int[] plusOne(int[] digits) {

        /*
            Approach 1
            Time complexity - O(n)
            Space complexity - (On)
         */
/*
        int num = 0;
        int len = digits.length;
        for (int i = 0; i < len; i++)
            num += digits[i] * (Math.pow(10, len-i-1));
        num++;
        int tmp = num;
        int count = 0;
        while (tmp > 0) {
            tmp /= 10;
            count++;
        }
        var res = new int[count];
        int i = res.length-1;
        while (num > 0) {
            res[i] = num % 10;
            num = num / 10;
            i--;
        }
        return res;
*/
        /*
            Approach 2
            Time complexity - O(n)
            Space complexity - O(n)
        */
        var len = digits.length;
        for (int i = len-1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] == 10)
                digits[i] = 0;
            else
                break;
        }
        int[] res;
        if (digits[0] == 0) {
            res = new int[len + 1];
            res[0] = 1;
            for (int i = 0; i < len; i++)
                res[i+1] = digits[i];
            return res;
        }
        else res = digits;
        return res;
    }
}
