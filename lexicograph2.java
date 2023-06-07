package com.company;

import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class lexicograph2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String s = sc.nextLine();
    String ns = "";

    if (isPalindrome(s)){
        if ((s.length()&1)==0) {
            String [] f = new String[s.length()/2];
            for (int i=0; i<=(s.length()/2)-1; i++) {
                f[i] = String.valueOf(s.charAt(i));
            }
            Arrays.sort(f);
            for (String a:f) {
                ns += a;
            }
            for (int i=f.length-1; i>=0; i--) {
                ns += f[i];
            }
            System.out.println(ns);
        }
        else {
            String [] f = new String[s.length()/2];
            for (int i=0; i<=(s.length()/2)-1; i++) {
                f[i] = String.valueOf(s.charAt(i));
            }

            Arrays.sort(f);
            for (String a:f) {
                ns += a;
            }
            ns += s.charAt(s.length()/2);
            for (int i=f.length-1; i>=0; i--) {
                ns += f[i];
            }
            System.out.println(ns);
        }
    }
    else{
        System.out.println("Input is not palindrome");
    }

}

    public static boolean isPalindrome(String A) {

        String s = "";
        char ch;
        int n = A.length();
        for (int i = 0; i< n; i++ ){
            ch = A.charAt(i);
            s = ch+s;
        }
        int x = s.compareTo(A);
        if (x == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
//malayalam
