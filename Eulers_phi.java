package com.company;

import java.util.Scanner;

public class Eulers_phi {
    static int getGCD(int x, int y) {
        int hcf = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x%i==0 && y%i == 0) {
                hcf = i;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        int Phi = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        for (int i = 1; i < num; i++) {
            if (getGCD(i, num) == 1) {
                Phi += 1;
            }
        }
        System.out.println("Euler's Phi = "+Phi);
    }
}
