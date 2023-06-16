package com.company;

public class NaturalSort {
    public static void main(String[] args){
        String[] s = {"A2", "A66", "A45", "AA1", "XYZ" };
//        char character = 'A';
//        int ascii = character;
//        System.out.println(ascii);
        for (int i = 0; i<s.length; i++){
            int ascii = Integer.parseInt(s[i].substring(0,1));
            System.out.println(ascii);
        }

    }
}
