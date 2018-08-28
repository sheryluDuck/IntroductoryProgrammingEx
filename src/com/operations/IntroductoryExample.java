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
    private void printRightTriangle(int inputNumber){
        for (int i = 0; i < inputNumber; i++) {
            printAsteriskLine(i+1);
            System.out.println(" ");
        }
    }

    public void readNumberPrintRightTriangle(){
        try{
            System.out.println(" ");
            int inputNumber = tool.readNumber();
            printRightTriangle(inputNumber);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

}
