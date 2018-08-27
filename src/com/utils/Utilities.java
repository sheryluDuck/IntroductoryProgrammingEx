package com.utils;

import java.util.Scanner;

public class Utilities {
    public static void readNumber()
    {
        System.out.println("Please enter a number: ");

        Scanner scanIn = new Scanner(System.in);
        String inputString = scanIn.nextLine();
        scanIn.close();
        //Needs cast to int and validation
        System.out.println("Number : " + inputString);
    }
}
