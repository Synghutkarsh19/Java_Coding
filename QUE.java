package com.company;

import java.util.*;

public class QUE {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int n = sc.nextInt();


    static int countSubset ( int t, int n){

        int dp[][] = new int[t + 1][n + 1];

        for (int i = 0; i <= t; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][n] = 0;
        }

        for (int i = 1; i <= t; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = j * dp[i - 1][j] + dp[i - 1][j - 1];
                }
            }
        }
        return dp[t][n];
    }


    public static void main(String[] args) {
        //System.out.println(countSubset(7,2));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] r = new int[T];
        for(int i = 0; i<T; i++){
            r[i] = sc.nextInt();
        }
        for(int i = 0; i<T; i++){
            System.out.println(countSubset(r[i],1));
        }
}

}