package com.company;

import java.util.Scanner;

public class manuvering {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int['n']['n'];
        for (int i = 0;i<n;i++){
            matrix[i][0] = 1;
        }
        for (int j=0; j<n; j++){
            matrix[0][j] = 1;
        }
        for (int i=1; i<n; i++){
            for (int j=1; j<n; j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1] ;

            }
        }
        System.out.println(matrix[n-1][n-1]);
    }
}
