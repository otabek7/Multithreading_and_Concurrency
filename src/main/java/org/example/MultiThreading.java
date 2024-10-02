package org.example;

public class MultiThreading extends Thread{
//    @Override
    public int[][] run(int rowBegin, int rowEnd, int [][] totalMatrix, int [][] matrix1, int [][] matrix2){

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                totalMatrix[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    totalMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }//end of k loop
//                System.out.print(totalMatrix[i][j] + " ");  //printing matrix element
            }//end of j loop
//            System.out.println();//new line
        }
        return totalMatrix;
    }
}
