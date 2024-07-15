import service.AdvancedCalculator;
import service.inheritance;
import service.inheritance.*;
class student{
    int rollno;
    String name;
    int classno;

    AdvancedCalculator ad = new AdvancedCalculator();


}

public class array {

    public static void main(String[] args){
        int[] arr1 = {1,2,3};

        {/* Array Declaration */}

        arr1[0] = 56;

        {/*We access the value using index -: indexing starts from 0 to n-1*/}

        int[] arr = new int[4];

        {/* Initialise a dynamic array using here in JAVA*/}

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        {/*Multidimensional Array -: Deals with rows and Columns*/}

        int[][] arr2 = {{2,2,2,2},{2,2,2,2},{2,2,2,2}};

        for(int i=0;i<3;i++){  // Rows
            for(int j=0;j<4;j++){  // Columns
                System.out.print(arr2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        {/*Three Dimension Array*/}

        int [][][] arr3 = new int[4][4][4];

        {/*Drawback of array -: The size is fixed, Searching opn is expensive*/}
        {/*Array of Object*/}

        student s1 = new student();
        s1.rollno = 2;
        s1.classno = 6;
        s1.name = "Ankit";

        student s2 = new student();
        s2.rollno = 3;
        s2.classno = 7;
        s2.name = "Ankit";

        student s3 = new student();
        s3.rollno = 30;
        s3.classno = 70;
        s3.name = "Ankitt";

        student s4 = new student();
        s4.rollno = 30;
        s4.classno = 700;
        s4.name = "Ankittt";

        student [] arr5 = new student[4];

        arr5[0] = s1;
        arr5[1] = s2;
        arr5[2] = s3;
        arr5[3] = s4;

        for(int i=0;i<arr5.length;i++){
            System.out.println(arr5[i].classno);
        }

        {/*Enhanced For Loop*/}

        int [] temp = {1,2,3};
        for(int n:temp){
            System.out.println(n);
        }

        for(student s:arr5){
            System.out.println(s.classno);
        }


    }
}
