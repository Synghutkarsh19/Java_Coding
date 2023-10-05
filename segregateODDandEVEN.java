package com.company;

import java.util.Scanner;

public class segregateODDandEVEN {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] odd = new int[n];
        int[] even = new int[n];
        for (int i=0; i<n; i++){
            if(arr[i]%2 == 0){
                even[i] = arr[i];
            }
            else{
                odd[i] = arr[i];
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(even[i] +" ");
        }
        System.out.println("");
        for (int i=0; i<n; i++){
            System.out.print(odd[i]+" ");
        }
    }
}
