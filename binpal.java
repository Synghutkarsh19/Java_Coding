package com.company;

import java.util.Scanner;

public class binpal {
    /*static String binCon(int a){
        StringBuilder b = new StringBuilder();
        while (a >= 1){
            b.append(Integer.toString(a%2));
            a /=2;
        }
        return b.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = binCon(n);
        int i = Integer.parseInt(s);

        if (isPalindrome(i) == true){
            System.out.println("Yes, it is a binary palindrome");
        }
        else{
            System.out.println("No, it is a binary palindrome");
        }

    }
    public static boolean isPalindrome(int n){
        int sum = 0;
        int temp = n;
        while (n>0){
            int r = n%10;
            sum = (sum*10)+r;
            n = (n-r)/10;
        }
        if (temp == sum){
            return true;
        }
        else{
            return false;
        }
}*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = (int) (Math.log((double) n) / Math.log(2.0)) + 1;
        int R=0;
        for (int i = 0; i < a; i++) {
            int c_bit = (n & (1<<i))>>i;
            R = R | (c_bit<<(a-i-1));
        }
        if (n == R){
            System.out.println("Yes, it is a binary palindrome");
        }
        else{
            System.out.println("No, it is a binary palindrome");
        }
    }
}
