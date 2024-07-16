
class A extends Thread{
    public void run(){
        for(int i=1;i<=10;i++) System.out.println("HI");
//        Thread.sleep(10); sleep method is for saying that wait for 10ms
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=10;i++) System.out.println("Hello");
    }
}


public class thread {
    {/*Definition -: smallest part of the process, or we can say that the smallest part of
    process
    */}

    {/*The range of priority of thread goes from 1 to 10*/}
    {/*We can set the priority by a method called setPriority()*/}

     public static void main(String[] args){
          A obj1 = new A();
          B obj2 = new B();

          obj1.start();
          obj2.start();

          obj1.setPriority(4);
          obj2.setPriority(Thread.MAX_PRIORITY);
     }
}
