package task03;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.print("numRows = ");
        int numRows= read.nextInt();
        pascalTriangle(numRows);
    }
    public static void pascalTriangle(int numRows){
        int[][] triangle = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int k = 0; k < numRows - i - 1; k++) {System.out.print(" ");}
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) { triangle[i][j] = 1; }
                else { triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }
}
