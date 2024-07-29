
@FunctionalInterface // Annotation just to manage the Compile Time error//
interface functionallyInterface {
    void show();
}

class Sexy implements functionallyInterface {
    @Override
    public void show() {

    }
}

public class functionalInterface {
    //Functional Interface -: A Interface having one method in it//
    public static void main(String[] args){
        functionallyInterface s = new functionallyInterface(){
            //Anonymous class
            public void show() {

            }
        };
        s.show();
    }
}
