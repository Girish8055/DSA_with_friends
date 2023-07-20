package shhradha;

import java.util.Scanner;

public class matrix_largest_elements {

    public static boolean search (int matrix [] [], int key) {
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j < matrix[0].length; j++) {
                if (matrix [i] [j] == key) {
                    System.out.println("Found at cell (" + i + "," + j +")");
                    return true;
                }

            }
        }
        System.out.println("Key is not found");
        return false;
    }




    public static void main(String[] args) {
        int matrix [] [] = new int [3] [3];
        int m = 3, n = 3;

        System.out.println("Enter the Numbers");
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                matrix [i] [j] =sc.nextInt();
            }
        }
        //Output
        for (int i = 0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(matrix [i] [j] + " ");
            }
            System.out.println();
        }
        search(matrix,8);
    }
}

