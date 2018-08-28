package com.operations;

import com.utils.Utilities;

import java.util.InputMismatchException;

public class IntroductoryExample {
    Utilities tool = new Utilities();

    public void printAsterisk (){
        System.out.println("*");
    }
    private void printAsteriskLine(int asteriskNumber){
        for (int i = 0; i < asteriskNumber; i++) {
            System.out.print("*");
        }
    }
    private void printAsteriskVertical(int asteriskNumber) {
        for (int i = 0; i < asteriskNumber; i++) {
            System.out.println("*");
        }
    }
    public void readNumberPrintAsteriskVertical(){
        try{
            System.out.println(" ");
            int inputNumber = tool.readNumber();
            printAsteriskVertical(inputNumber);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public void readNumberPrintAsteriskLine(){
        try{
            System.out.println(" ");
            int inputNumber = tool.readNumber();
            printAsteriskLine(inputNumber);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

}
