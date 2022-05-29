package MultidimentionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class P01CompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] rowsColumns = sc.nextLine().split(" ");
        int firstMatrixRows = Integer.parseInt(rowsColumns[0]);
        int firstMatrixCols = Integer.parseInt(rowsColumns[1]);

        int[][] firstMatrix = new int[firstMatrixRows][firstMatrixCols];
        for (int i = 0; i < firstMatrixRows; i++) {
            int[] arr = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            firstMatrix[i] = arr;
        }

        rowsColumns = sc.nextLine().split(" ");
        int secondMatrixRows = Integer.parseInt(rowsColumns[0]);
        int secondMatrixCols = Integer.parseInt(rowsColumns[1]);

        int[][] secondMatrix = new int[secondMatrixRows][secondMatrixCols];
        for (int j = 0; j < secondMatrixRows; j++) {
            int[] arr2 = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            secondMatrix[j] = arr2;
        }

        boolean areEqual = true;

        for (int i=0; i<firstMatrixRows; i++) {
            for (int j=0; j<firstMatrixCols; j++) {
                if (secondMatrixCols != firstMatrixCols) {
                    areEqual = false;
                    break;
                }
                if (firstMatrix.length != secondMatrix.length) {
                    areEqual = false;
                    break;
                }
                if (firstMatrix[i][j] != secondMatrix[i][j]) {
                    areEqual = false;
                    break;
                }
            }
        }

        if (areEqual) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static void printMatrix(int firstMatrixRows, int firstMatrixCols, int[][] firstMatrix) {
        for (int i = 0; i < firstMatrixRows; i++) {
            for (int j = 0; j < firstMatrixCols; j++) {
                System.out.print(firstMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
