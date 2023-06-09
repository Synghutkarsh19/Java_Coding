package com.company;

import java.util.Scanner;

public class MaxProdInSubArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int['n'];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int minP = arr[0];
        int maxP = arr[0];
        int ans = arr[0];
        int x1,x2;
        for (int i = 0; i<n; i++){
            x1 = minP*arr[i];
            x2 = maxP*arr[i];
            minP = Math.min(arr[i],Math.min(x1,x2));
            maxP = Math.max(arr[i],Math.max(x1,x2));
            ans = Math.max(ans, maxP);
        }
        System.out.println(ans);
    }
}
