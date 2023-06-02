package com.company;

import java.util.Scanner;

public class activitySelection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] finish = new int[n];
        int[] result = new int[n];
        result[0] = 0;
        for  (int i=0;i<n; i++){
            start[i] = sc.nextInt();
        }
        for  (int i=0;i<n; i++){
            System.out.println(start[i]);
        }
        for  (int i=0;i<n; i++){
            finish[i] = sc.nextInt();
        }
        for  (int i=0;i<n; i++){
            System.out.println(finish[i]);
        }
        int f = finish[0];
        for (int i=1; i<n; i++){
            int s = start[i];
            if( s>=f){
                f = finish[i];
                System.out.println(finish[i]);
                System.out.println(i);
            }
            else {
                break;
            }
        }
    }
}
