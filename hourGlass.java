package com.company;

import java.util.Scanner;

public class hourGlass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int['n']['m'];
        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                System.out.printf("%-4s",arr[i][j]);

            }
            System.out.print("\n");
        }
        int sum = 0;

        for (int i = 0; i<n-2; i++){
            for (int j = 0; j<m-2; j++){
                int sum1 = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(sum1>sum){
                    sum = sum1;
                }
            }
        }
        System.out.println(sum);
    }
}
