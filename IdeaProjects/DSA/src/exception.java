public class exception {
    public static void main(String[] args){
        try{
           int a = 0;
           int b = 10/0;

           if(b == 0){
               throw new ArithmeticException();
//               {/*Creating an Exception*/}
           }
           System.out.println(b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hey");
    }

    {/*We have different Exception and just to manage those Exception we can Multiple Catch Block*/}
}
