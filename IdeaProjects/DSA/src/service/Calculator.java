package service;

public class Calculator{
    public Calculator(){

    }

    public int addition(int x,int y){
        return x + y;
    }

    public int subtraction(int x , int y){
        return Math.abs(x - y);
    }

    public int multiplication(int x,int y){
        return x*y;
    }

    public int Division(int x,int y){
        if(y==0){
            return 0;
        }
        else{
            return x/y;
        }
    }

    {/*Method Overriding*/}

    public void show(){
        System.out.println("in Calculator");
    }
}
