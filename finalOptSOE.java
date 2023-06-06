package com.company;

import java.util.Scanner;

public class finalOptSOE {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] prime = new boolean[n + 1];
        for (int i =0; i<n; i++) {
            prime[i] = true;
        }
        for (int p = 2; p <= n; p++){
            if (prime[p]){
                System.out.println(p+ " ");
                for(int i = p*p; i<=n; i+=p){
                    prime[i] = false;
                }
            }
        }
    }
}
// the code is optimized to max.
// the complexity of the algorithm initially was O(N^2)
// now the complexity of the program is O(N/2+N/3+........+N/P) O(N(log(logN)))
//


