package com.alex.andreiev.binary.search.easy;

/**
 We are playing the Guess Game. The game is as follows:
 I pick a number from 1 to n. You have to guess which number I picked.
 Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.
 You call a pre-defined API int guess(int num), which returns three possible results:
 -1: Your guess is higher than the number I picked (i.e. num > pick).
 1: Your guess is lower than the number I picked (i.e. num < pick).
 0: your guess is equal to the number I picked (i.e. num == pick).
 Return the number that I picked.

 Example 1:
 Input: n = 10, pick = 6
 Output: 6

 Example 2:
 Input: n = 1, pick = 1
 Output: 1

 Example 3:
 Input: n = 2, pick = 1
 Output: 1

 Constraints:
 1 <= n <= 231 - 1
 1 <= pick <= n
 */

public class GuessNumberHigherOrLower_374 {

    private int pick;

    public int guessNumber(int n, int pick) {
        this.pick = pick;

        int start = 1;
        int end = n;
        while (start < end) {
            var mid = start + ((end - start) / 2);
            var guessResult = guess(mid);
            if (guessResult < 0) {
                end = mid - 1;
            } else if (guessResult > 0) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    private int guess(int num) {
        return Integer.compare(pick, num);
    }
}
