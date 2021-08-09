package com.alex.andreiev.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateImage_medium_48Test {

    @Test
    void rotate() {
        var target = new RotateImage_medium_48();
        int arr[][] = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        target.rotate(arr);
        assertArrayEquals(arr[0], new int[] {7, 4, 1});
        assertArrayEquals(arr[1], new int[] {8, 5, 2});
        assertArrayEquals(arr[2], new int[] {9, 6, 3});

        arr = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        target.rotate(arr);
        assertArrayEquals(arr[0], new int[] {15, 13, 2, 5});
        assertArrayEquals(arr[1], new int[] {14, 3, 4, 1});
        assertArrayEquals(arr[2], new int[] {12, 6, 8, 9});
        assertArrayEquals(arr[3], new int[] {16, 7, 10, 11});

        arr = new int[][] {{1}};
        target.rotate(arr);
        assertArrayEquals(arr[0], new int[] {1});

        arr = new int[][] {{1, 2}, {3, 4}};
        target.rotate(arr);
        assertArrayEquals(arr[0], new int[] {3, 1});
        assertArrayEquals(arr[1], new int[] {4, 2});
    }
}