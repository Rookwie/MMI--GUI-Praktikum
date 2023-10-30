package Practices;

import java.util.Scanner;

public class M_N_matrix {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Input M & N dimensions of the array");
        int m = scan.nextInt();
        int n = scan.nextInt();

        int[][] matrix = new int[m][n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = i * j;
            }
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    } 
}
