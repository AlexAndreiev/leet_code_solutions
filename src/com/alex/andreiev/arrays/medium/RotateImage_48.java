package com.alex.andreiev.arrays.medium;

/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation.

Constraints:
        matrix.length == n
        matrix[i].length == n
        1 <= n <= 20
        -1000 <= matrix[i][j] <= 1000
*/

public class RotateImage_48 {

    public void rotate(int[][] matrix) {
        /* Approach 0
         * Time complexity - O(n)
         * Space complexity - O(1)
         * */
/*
        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top
                //left -> top
                matrix[first][i] = matrix[last-offset][first];
                //bottom -> left
                matrix[last-offset][first] = matrix[last][last-offset];
                // right -> bottom
                matrix[last][last-offset] = matrix[i][last];
                //top -> right
                matrix[i][last] = top; //right <- saved top
            }
        }
*/
        /* Approach 1
         * Time complexity - O(n)
         * Space complexity - O(1)
         * */
//        int size = matrix.length;
//        for (int i = 0; i < (size + 1)/2; i++) {
//            for (int j = 0; j < size/2; j++) {
//                var tmp = matrix[size-j-1][i];
//                matrix[size-j-1][i] = matrix[size-i-1][size-j-1];
//                matrix[size-i-1][size-j-1] = matrix[j][size-i-1];
//                matrix[j][size-i-1]= matrix[i][j];
//                matrix[i][j] = tmp;
//            }
//        }


        /* Approach 2
        * Time complexity - O(n)
        * Space complexity - O(1)
        * */
        transpose(matrix);
        reverse(matrix);
    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
    }

    private void reverse(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size/2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][size - j - 1];
                matrix[i][size - j - 1] = tmp;
            }
        }
    }
}
