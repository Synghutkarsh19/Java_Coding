package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Lexicographical_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String[] f = new String['n'];
        for (int i = 0; i<n; i++){
            f[i]= s.substring(i,i+1);
        }
        Arrays.sort(f);


    }
}
