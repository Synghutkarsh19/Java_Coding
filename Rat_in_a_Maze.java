package com.company;

import java.util.Scanner;

public class Rat_in_a_Maze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] maze = new int[4][4];
        for(int i=0; i<4;i++){
            for(int j=0; j<4;j++){
                maze[i][j] = sc.nextInt();
            }
        }
        int[][] sol = new int[4][4];
        for(int i=0; i<4;i++){
            for(int j=0; j<4;j++){
                sol[i][j] = 0;
            }
        }

        //start
        sol[1][1] = maze[1][1];

    }
}
