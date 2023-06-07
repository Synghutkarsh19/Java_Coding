package com.company;

public class LeaderinanArray {
    public static void main(String[] args){
        int[] a = {65, 32, 53, 16, 17, 44, 33, 66, 22};
        int n = a.length;
        System.out.println(a[n]);
        int l = a[n];
        for( int i = n-2; i>0; i--){
            if (a[i-1]> l){
                System.out.println(a[i-1]);
                l = a[i-1];
            }
        }
    }
}
