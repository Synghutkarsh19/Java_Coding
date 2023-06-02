package com.company;
import java.util.Scanner;

public class binaryPalindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toBinaryString(n);
        int i = Integer.parseInt(s);
        if (isPalindrome(i)){
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
        return temp == sum;
    }
}

