package org.example;

import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        MultiThreading row1Product = new MultiThreading();
        MultiThreading row2Product = new MultiThreading();
        MultiThreading row3Product = new MultiThreading();
        MultiThreading row4Product = new MultiThreading();
        MultiThreading row5Product = new MultiThreading();

//
        //Initializing 2 matrices
        int matrixRows = 20;
        int matrixColumns = 20;

//        int[][] matrix1 = new int[matrixRows][matrixColumns];
//        int[][] matrix2 = new int[matrixRows][matrixColumns];
        int[][] matrix1 = {
                {1, 2, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1},
                {1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1},
                {1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1},
                {2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2},
                {2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2},
                {1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2},
                {2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2},
                {2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1},
                {2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 1, 1},
                {1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2},
                {1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 1},
                {2, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 2},
                {1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2},
                {1, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2},
                {2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1},
                {1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1},
                {1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2},
                {1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2},
                {2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1}
        };

        int[][] matrix2 = {
                {2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2},
                {1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 2},
                {2, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1},
                {2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1},
                {1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 1, 2},
                {1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1},
                {2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2},
                {1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1},
                {1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 2},
                {2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2},
                {1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2},
                {2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2},
                {2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2},
                {2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2},
                {2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2},
                {1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2},
                {1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2},
                {2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 1}
        };
        int[][] totalMatrix1 = new int[matrixRows][matrixColumns];
        int[][] totalMatrix2 = new int[matrixRows][matrixColumns];
        int[][] totalMatrix3 = new int[matrixRows][matrixColumns];
        int[][] totalMatrix4 = new int[matrixRows][matrixColumns];
        int[][] totalMatrix5 = new int[matrixRows][matrixColumns];

        int max = 2;
        int min = 1;
        int range = max - min + 1;

        //filling each cell of matrix with Math.random()
//        for (int row = 0; row < matrixRows; row++) {
//            for (int column = 0; column < matrixColumns; column++) {
//                matrix1[row][column] = (int) (Math.random() * range) + min;
//                matrix2[row][column] = (int) (Math.random() * range) + min;
//            }
//        }

        //Printing each Matrix out
        System.out.println("Matrix 1");
        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(matrix1[row][column]);
            }
            System.out.println();
        }
        System.out.println("Matrix 2");
        for (int row = 0; row < matrixRows; row++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(matrix2[row][column]);
            }
            System.out.println();
        }

        System.out.println("Printing the threaded matrix");
        totalMatrix1 = row1Product.run(1, 4, totalMatrix1, matrix1, matrix2);
        totalMatrix2 = row2Product.run(5, 8, totalMatrix2, matrix1, matrix2);
        totalMatrix3 = row3Product.run(9, 12, totalMatrix3, matrix1, matrix2);
        totalMatrix4 = row4Product.run(13, 16, totalMatrix4, matrix1, matrix2);
        totalMatrix5 = row5Product.run(17, 20, totalMatrix5, matrix1, matrix2);


        for (int i = 0; i < 4; i++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(totalMatrix1[i][column]);
            }
            System.out.println();
        }

        for (int i = 4; i < 8; i++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(totalMatrix2[i][column]);
            }
            System.out.println();

        }

        for (int i = 8; i < 12; i++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(totalMatrix3[i][column]);
            }
            System.out.println();
        }

        for (int i = 12; i < 16; i++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(totalMatrix4[i][column]);
            }
            System.out.println();

        }


        for (int i = 16; i < 20; i++) {
            for (int column = 0; column < matrixColumns; column++) {
                System.out.print(totalMatrix5[i][column]);
            }
            System.out.println();

        }


    }


}
