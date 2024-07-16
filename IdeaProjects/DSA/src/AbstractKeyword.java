abstract class Car{

    private String carName;
    private String modelName;

    public Car(String carName,String modelName){
         this.carName = carName;
         this.modelName = modelName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    {/*Here in this method I have used abstract because I have not instantiated this method just declared it*/}
    {/*An abstract method can only be in a Abstract Class*/}

    public abstract void drive();

    public void playMusic(){

    }

    public void airConditioner(){

    }
}

class Porsche extends Car{

    public Porsche(String carName, String modelName) {
        super(carName, modelName);
    }

    public void drive(){

   }
}



public class AbstractKeyword {
    public static  void main(String[] args){

        {/*You can not create object of the abstract Class*/}

        Porsche p1 = new Porsche("abc","abc");
        String carName = p1.getCarName();
        String modelName =  p1.getModelName();

        System.out.println(carName + " " + modelName);

    }
}
