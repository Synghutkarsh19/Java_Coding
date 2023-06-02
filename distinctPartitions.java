package com.company;

public class distinctPartitions {

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


}