package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String gender = sc.nextLine();
        int age = sc.nextInt();
        long phoneNo = sc.nextLong();
        float CGPA = sc.nextFloat();

        System.out.println("Name:" + name + '\n' + "Gender:" + gender + "\n" + "Age:" + age + "\n" + "Phone Number:" + phoneNo + "\n" + "CGPA:" + CGPA);
	// write your code here
    }
}
