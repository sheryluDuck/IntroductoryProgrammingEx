import com.operations.IntroductoryExample;
import com.utils.Utilities;

import java.util.Scanner;

public class Printer {

    public static void main(String[] args) {
        Utilities herramienta = new Utilities();
        IntroductoryExample quackExample = new IntroductoryExample();
        //First Exercise
        quackExample.printAsterisk();
        //Second Exercise
        int inputNumber = herramienta.readNumber();
        quackExample.printAsteriskLine(inputNumber);



    }


}
