//Group Activity

package com.company;
import java.util.Scanner;
public class Mr_String_Problem {
    private static int VowelCount(int k){
        return switch (k) {
            case 0, 1, 3, 5, 4, 7, 8, 9 -> 2;
            case 2, 6 -> 1;
            default -> k;
        };
    }
    private static String NumTOString (int k){
        return switch (k) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> null;
        };
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int[] a1 = new int[n];
        for (int i = 0; i<n; i++){
            a1[i] = VowelCount(a[i]);
        }
        int count = 0;
        for (int i = 0; i<n; i++){
            count += a1[i];
        }
        int counter = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (i == j){
                    break;
                }
                else{
                    if(a[i] + a[j] == count){
                        counter++;
                    }
                }
            }
        }
        System.out.println("Solution: " + NumTOString(counter));
    }
}
