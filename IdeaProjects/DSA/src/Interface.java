//class - class -> Extends
//class - interface -> Implements
//interface - interface -> extends


interface X{
    void show();
    void config();
}

interface Y{
    void run();
}

interface J extends Y{
    void gh();
}

class Bb implements X,Y,J{
    {/*A class can implement multiple interfaces*/}
    public void config() {
        System.out.println("Hey");
    }

    public void show(){
        System.out.println("Hey");
    }

    public void run(){
        System.out.println("Hi");
    }

    public void gh() {
        System.out.println("Extending");
    }
}


public class Interface {
    public static void main(String[] args){
        X obj1 = new Bb();
        obj1.show();
        obj1.config();
    }
}
