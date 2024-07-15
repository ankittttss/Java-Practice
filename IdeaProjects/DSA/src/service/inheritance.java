package service;

public class inheritance {
    public static void main(String[] args){
        Calculator simplecalculator = new Calculator();
        int addition = simplecalculator.addition(2,4);
        int subtraction = simplecalculator.subtraction(4,7);
        int multiplication = simplecalculator.multiplication(5,6);
        int division = simplecalculator.Division(6,2);


        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double log = advancedCalculator.logarithmic(5);
        double pi = advancedCalculator.pivalue();

        System.out.println(addition + " " +  subtraction + " " + multiplication + " " + division );
        System.out.println(log + " " + pi);

        ScientificCalculator scientificCalculator = new ScientificCalculator();
        double power = scientificCalculator.power(2,4);

        System.out.println(power + " " + "power");

        advancedCalculator.show();

    }

}


