
class HumanNeed {
  private int age;
  private String name;

  public void setAge(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}


public class thiskeyword {
  public static void main(String[] args){

      HumanNeed no1 = new HumanNeed();
      no1.setAge(24);
      no1.setName("Ankit");

      String name = no1.getName();
      System.out.println(name);
  }
}
