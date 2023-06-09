package com.company;
import java.util.*;
class Solution
{
    static String arr[] = new String[101];
    public static int vowel (String str)
    {
        int sum = 0;
        for (int i = 0; i < str.length (); i++)
            if (str.charAt (i) == 'a' || str.charAt (i) == 'e'|| str.charAt (i) == 'i' || str.charAt (i) == 'o'|| str.charAt (i) == 'u')
                sum += 1;
        return sum;
    }
    public static String findWord (int no)
    {
        if (no <= 15)
            return arr[no];
        if (no < 20 && no > 15)
        {
            arr[no] = arr[no % 10] + "teen";
            return arr[no];
        }
        if (no % 10 == 0)
        {
            arr[no] = arr[no / 10] + "ty";
            return arr[no];
        }
        if (no > 100)
            return "greater 100";
        arr[no] = arr[(no / 10) * 10] + "-" + arr[no % 10];
        return arr[no];
    }
    public static void main (String[]args)
    {
        for (int i = 0; i < 100; i++)
            arr[i] = "";
        arr[0] = "zero";
        arr[1] = "one";
        arr[2] = "two";
        arr[3] = "three";
        arr[4] = "four";
        arr[5] = "five";
        arr[6] = "six";
        arr[7] = "seven";
        arr[8] = "eight";
        arr[9] = "nine";
        arr[10] = "ten";
        arr[11] = "eleven";
        arr[12] = "twelve";
        arr[13] = "thirteen";
        arr[14] = "fourteen";
        arr[15] = "fifteen";
        arr[20] = "twenty";
        arr[30] = "thirty";
        arr[40] = "forty";
        arr[50] = "fifty";
        arr[60] = "sixty";
        arr[70] = "seventy";
        arr[80] = "eighty";
        arr[90] = "ninenty";
        arr[100] = "hundred";
        int sum1 = 0;
        int sum2 = 0;
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt ();
        for (int i = 0; i < n; i++)
            sum1 += vowel (findWord (a[i]));
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (a[i] + a[j] == sum1)
                    sum2 += 1;
        System.out.println (findWord (sum2));
    }
}
