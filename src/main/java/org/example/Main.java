package org.example;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        MultiThreading row1Product = new MultiThreading();
        MultiThreading row2Product = new MultiThreading();
        MultiThreading row3Product = new MultiThreading();
//        MultiThreading row4Product = new MultiThreading();
//
        //Initializing 2 matrices
        int matrixRows = 3;
        int matrixColumns = 3;

        int[][] matrix1 = new int[matrixRows][matrixColumns];
        int[][] matrix2 = new int[matrixRows][matrixColumns];
        int[][] totalMatrix = new int[matrixRows][matrixColumns];

        int max = 2;
        int min = 1;
        int range = max - min + 1;

        //filling each row & column of matrix with 3 and 5
        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                matrix1[row][column] = (int) (Math.random() * range) + min;
                matrix2[row][column] = (int) (Math.random() * range) + min;
            }
        }

        //Printing each Matrix out
        System.out.println("Printing each Matrix out");
        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(matrix1[row][column]);
            }
            System.out.println();
        }

        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(matrix2[row][column]);
            }
            System.out.println();
        }

        System.out.println("Printing the threaded matrix");
        totalMatrix = row1Product.run(1, 3, totalMatrix, matrix1, matrix2);

        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(totalMatrix[row][column]);
            }
            System.out.println();
        }

    }


}
