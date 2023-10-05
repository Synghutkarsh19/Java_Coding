package com.company;

import java.util.Scanner;

public class SegmentedSieve {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int h = sc.nextInt();
        int l = sc.nextInt();
        int n = h-l+1;
        boolean[] prime = new boolean[n];
        for (int i =0; i<n; i++) {
            prime[i] = true;
        }

    }
}
