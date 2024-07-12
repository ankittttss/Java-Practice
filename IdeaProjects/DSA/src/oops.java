import java.util.Arrays;

class Methods{
    public  int add(int x,int y){
        return x+y;
    }

    public  int sub(int x,int y){
        return x-y;
    }

    public  int mul(int x,int y){
        return x*y;
    }
     public  int div(int x,int y){
        return x/y;
     }

     // Method Overloading -: Same Name, But Different Arguments//

     public int add(int x,int y,int z){
        return x+y+z;
     }
 }


public class oops {
    public static void main(String[] args){
        int y = 10;
        int x = 20;

        Methods xx = new Methods();

        // Object of the Methods Class//

        // Array and it's use cases

        int[] n = {1,2,3};

       for(int i=0;i<n.length;i++){
           System.out.println(n[i]);
       }

        int result = xx.add(x,y);
        System.out.println(result);
    }

}
