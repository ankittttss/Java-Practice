import javax.sound.midi.SysexMessage;
import service.*;

public class Main {
    public static void main(String[] args) {
        boolean check = true;
        byte number3 = 123;

        char temp = 'a'; // These are Literals//
        // Here in Java boolean only consider true or false not 1 or 0

        // Type Conversion -:

        AdvancedCalculator ad = new AdvancedCalculator();
        double log = ad.logarithmic(4);

        byte a = 12;
        int b = 34;

        b = (byte)a;


//        System.out.println(b);


        double number4 = 10.7;
        float number5 = 10.7f;

        {/*
          By default, java takes double to store decimal Values
          To assign float as a Data Type we have to add f at the end
        */}


        int aa = 257;
        byte bb = 10;

        bb = (byte)aa;

        {/*
           Here we will understand casting -: the range is 257 for int and for
           byte is 257 so when we will cast it and it will return the modulo.
           ie -: 257%257 = 1
        */}

        {/*
          Type Promotion -: if two numbers that are byte are multiplied and the
          range is out of bound then it will promote.

          byte a = 10;
          byte b = 20;

          int result = a*b; // Type Promotion
          
        */}




//        int n = 4;
//
//        switch (n){
//            case 1:
//                System.out.println("Monday");
//            case 2:
//                System.out.println("Tuesday");
//            case 3:
//                System.out.println("Wednesday");
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//            case 6:
//                System.out.println("Saturday");
//            case 7:
//                System.out.println("Sunday");
//            default:
//                System.out.println("Done");
//
//        }
    }
}