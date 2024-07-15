class Human{
  private int age;
  private String name;

    {/*Access Modifiers -: We are implementing Encapsulation here
     We do not want person from outside world coming and accessing it
     instead we can create the Method to access the value;
    */}

    {/*These are our getter methods -: Helps you to get Method*/}

    public int getAge(){
         return  age;
    }

    public String getName(){
        return name;
    }

    {/*These are our setters -: Helps you to set the data*/}

    public void setName(String namee){
        name = namee;
    }

    public void setAge(int agee){
        age = agee;
    }
}

public class encapsulation {
  public static void main(String[] args){
     Human hum = new Human();
     hum.setAge(20);
     hum.setName("Ankit");

     String humanname = hum.getName();
     int humanage = hum.getAge();

      System.out.println(humanname + " " + humanage);
  }
}
