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
            System.out.println("Print a vertical asterisk line");
            int inputNumber = tool.readNumber();
            printAsteriskVertical(inputNumber);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    public void readNumberPrintAsteriskLine(){
        try{
            System.out.println(" ");
            System.out.println("Print an asterisk line");
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
            System.out.println("Let's print a right triangle");
            int inputNumber = tool.readNumber();
            printRightTriangle(inputNumber);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
    private void printBlankLine(int blankNumber){
        for (int i = 0; i < blankNumber; i++) {
            System.out.print(" ");
        }
    }
    private int getTriangleLength (int inputNumber){
        int accumulator=1;
        for (int i = 0; i < inputNumber; i++) {
            if(i!=0){
                accumulator=accumulator+2;
            }
        }
        return accumulator;
    }
    private void printTriangleLine(int blankSpaces, int asteriskNumber){
        if (blankSpaces!=0) {
            printBlankLine(blankSpaces);
            printAsteriskLine(asteriskNumber);
            printBlankLine(blankSpaces);
            System.out.println(" ");
        }else {
            printAsteriskLine(asteriskNumber);
        }
    }
    private void printIsoscelesTriangle(int inputNumber){
        int triangleLength = getTriangleLength(inputNumber);
        int totalBlankSpaces=1;
        int totalAsteriskNumber=1;
        for (int i = 0; i < inputNumber; i++) {
            if(i!=0){
                totalAsteriskNumber=totalAsteriskNumber+2;
                totalBlankSpaces=triangleLength-totalAsteriskNumber;
                int blankSpaces = totalBlankSpaces/2;
                printTriangleLine(blankSpaces, totalAsteriskNumber);
            }else{
                totalBlankSpaces=triangleLength-totalBlankSpaces;
                int blankSpaces = totalBlankSpaces/2;
                printTriangleLine(blankSpaces, totalAsteriskNumber);
            }
        }
    }
    public void readNumberPrintIsoscelesTriangle(){
        try{
            System.out.println(" ");
            System.out.println("Let's print an isosceles triangle");
            int inputNumber = tool.readNumber();
            printIsoscelesTriangle(inputNumber);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
}
