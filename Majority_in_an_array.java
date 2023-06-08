package com.company;

import java.util.Arrays;

public class Majority_in_an_array {
    public static void main(String[] args){
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4};
        int n = arr.length;
        //System.out.println(n/2);
        Arrays.sort(arr);
        int counter = 1;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++ ){
                if(arr[i] == arr[j]){
                    counter++;
                    i++;
                }
                else{
                    i++;
                    break;
                }
            }
        }
        if(counter > n/2){
            System.out.println(counter);
        }
        else{
            System.out.println(-1);
        }
}}
