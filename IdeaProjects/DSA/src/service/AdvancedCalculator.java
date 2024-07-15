package service;

public class AdvancedCalculator extends Calculator{

    public AdvancedCalculator(){

    }

    public double logarithmic(int x){
        return Math.log(x);
    }

    public double pivalue(){
        return Math.PI;
    }

    public void show(){
        System.out.println("in Advanced Calculator");
    }

}
