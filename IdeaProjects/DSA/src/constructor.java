class HumanNeed2{
    private int age;
    private String human;

    {/*Naming Convention in Java -: CamelCase
     Class Name and Interface name start with Capital Letter.
     Variable and method should be small

     Constant Value should be in Capital such as -: PIE,.....!
    */}

    {/*Constructor -: Used to initialise the variables*/}

    {/*Default Constructor*/}
    public HumanNeed2(){
        age = 30;
        human = "Temp";

        {/* Default Values of Int is 0 and String is NULL*/}
        {/*There are two Types of Constructor -: Default and Parametrized*/}
    }

    {/*This is Parametrised Constructor having value passed in Parameters*/}
    public HumanNeed2(int age,String Human){
         this.age = age;
         this.human = Human;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHuman() {
        return human;
    }

    public void setHuman(String human) {
        this.human = human;
    }
}

public class constructor {

    public static void main(String[] args){
        HumanNeed2 no1 = new HumanNeed2();
        int age = no1.getAge();
        String humann = no1.getHuman();

        HumanNeed2 h1 = new HumanNeed2(18,"Snehit");
        int h1age = h1.getAge();
        String h1name = h1.getHuman();

        System.out.println(h1age + " " + h1name);

        System.out.println(age +  " " + humann +  " " + "First");
        no1.setAge(20);
        no1.setHuman("Ankit");

        int agee = no1.getAge();
        String humandetails = no1.getHuman();

        System.out.println(agee + " " + humandetails);

        {/*This is called an Anonymous Object -: Object that do not have a name*/}
        new HumanNeed2();
    }
}
