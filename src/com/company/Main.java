package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[][] array = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int)(Math.random()*10-1);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
              
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
