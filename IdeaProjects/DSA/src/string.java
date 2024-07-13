public class string {

  public static void main(String[] args){
      String s = "Ankit";

      {/*Streams of Character is called String*/}
      String f = s.toLowerCase();
      s = s.toLowerCase();
      System.out.println(s);
      System.out.println(f);

      {/*Mutable vs Immutable*/}


      {/*String Buffer is mutable*/}
      StringBuffer sb = new StringBuffer("Ankit");
      System.out.println(sb.capacity());

      {/*if StringBuffer is empty then the default Capacity is  16bytes */}

      {/*There are Several Methods in our Buffer Class*/}

      sb.append("Saini");

  }
}
