package com.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {

    static final Scanner scanIn = new Scanner(System.in);

    public static int readNumber()
    {
        System.out.println("Please enter a number: ");
        String inputString = scanIn.nextLine();
        //scanIn.close();
        return castNumberFromConsole(inputString);
    }
    private static int castNumberFromConsole(String rawNumber){
        try {
            return Integer.parseInt(rawNumber);
        } catch (NumberFormatException e) {
            throw new InputMismatchException("This is not a number :(");
        }
    }
}
