package com.practice.ds.stack;

import java.util.Scanner;

public class MatrixDiagonalSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int m = in.nextInt();
            int[][] m1 = new int[m][m];
            for (int x = 0; x < m; x++) {
                for (int y = 0; y < m; y++) {
                    m1[x][y] = in.nextInt();
                    // System.out.print(m1[x][y]);
                }
            }

            matrixDiagonal(m1);
            System.out.println("");

        }

    }

    public static void matrixDiagonal(int[][] matrix) {
        
        int size = matrix.length * 2 - 1;
        int x = 0, y = matrix.length - 1;
        boolean direction = true;
        int k = 1;
        for (int i = 0; i < size; i++) {
            int sum = 0, matrix_i = x, matrix_j = y;
            for (int j = 0; j < k; j++) {
                sum += matrix[matrix_i][matrix_j];
                matrix_i++;
                matrix_j++;
            }
            System.out.print(sum+" ");
            if (x == y || !direction)
            {
                direction = false;
                x++;
                k--;
            } else {
                y--;
                k++;
            }
        }
    }

    public static void product(int[][] m1, int[][] m2) {
        int x = m1.length, y = m2[0].length;
        int[][] m3 = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int value = 0;
                for (int j2 = 0; j2 < m1[0].length; j2++) {
                    value = value + m1[i][j2] * m2[j2][j];
                }
                m3[i][j] = value;
            }
        }

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
