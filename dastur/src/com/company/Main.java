package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static String in;

    public static void main(String[] args) {
	// write your code here
        int array[] = {2, 1, 91, 3, 4,  5, 0,12, 21, 36, 71, 24, 85, 12, 30, 2,5,61, 25, 91, 23, 72, 9, 18, 6};
        int a = 5

                ;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == a) {
                    System.out.println(array[i] + " + " + array[j] + "= " + a);
                }
            }
        }

    }
}
