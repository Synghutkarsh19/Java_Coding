package com.company;

import java.util.Scanner;

public class newProg2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n;
        int d, R=0;
        while (t>0){
            d= t%10;
            R*=10;
            if (d==1 || d == 0 || d==8 || d==6 || d==9){
                if (d==6){
                    d=9;
                }
                else if(d == 9){
                    d=6;
                }
            }
            else{
                break;
            }
            R+=d;
            t/=10;
        }
        if (R==n){
            System.out.println(n + " is Strobogrammatic");
        }
        else{
            System.out.println(n + " is not Strobogrammatic");
        }
    }
}

