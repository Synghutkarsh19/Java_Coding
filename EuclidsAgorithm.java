package com.company;

import java.util.Scanner;

public class EuclidsAgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Taking Integer input
        int A = sc.nextInt();
        int B = sc.nextInt();

        //while B>0 repeat the loop, the final value of A give =s the gcd
        while(B>0){
            int R = A%B;
            A = B;
            B = R;
        }
        System.out.println(A);
    }
}
