import com.operations.IntroductoryExample;
import com.utils.Utilities;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Printer {

    public static void main(String[] args) {
        Utilities herramienta = new Utilities();
        IntroductoryExample quackExample = new IntroductoryExample();
        //First Exercise
        quackExample.printAsterisk();
        //Second Exercise
        quackExample.readNumberPrintAsteriskLine();
        //Third Exercise
        quackExample.readNumberPrintAsteriskVertical();

    }


}
