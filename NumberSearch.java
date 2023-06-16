package com.company;

import java.util.Scanner;

public class NumberSearch {
    public static void main( String[] args){
        int arr[]= {1,2,3,4,5,6};
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int x: arr){
//            if(n == x){
//                System.out.println("Present");
//                break;
//            }
//            else {
//                System.out.println("Not Present");
//                break;
//            }
//        }
        for (int i = 0; i<6; i++){
            if (n == arr[i]){
                found = true;
                System.out.println("Present");
                break;
            }
        }
        if (!found){
            System.out.println("Not Present");
        }
    }

}
