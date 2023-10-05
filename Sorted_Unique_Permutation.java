package com.company;

public class Sorted_Unique_Permutation {
    public static void main(String[] args){
        String s = "ABC";
        int n = s.length();
        int Num = Fact(n) ;
        for (int i = 0; i<Num; i++){
            Swap(s.charAt(0), s.charAt(i));
            for (int j = 1; j<n; j++){

            }

        }
    }
    public static int Fact(int n){
        int fact = 1;
        for (int i = 0; i<n; i++){
            fact*=n;
        }

        return fact;
    }
    public static void Swap(char a, char b){
        char temp = a;
        a = b;
        b = temp;
    }
    public static void ST(){

    }
}
