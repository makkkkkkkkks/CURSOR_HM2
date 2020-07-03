package com.company.matrixOperation;

public class Matrix {
    public static String mainDiagonal(String[][] matrix) {
        String diagonal = "";
        for (int i = 0; i < matrix.length; i++) {
            diagonal += matrix[i][i] + " ";
        }
        return diagonal;
    }
}
