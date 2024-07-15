import java.util.*;

class collectionapi {
     public void setDataStructure(){

         {/*Set stores the non duplicates element here*/}
         {/*Different Methods of Set*/}

         Set<Integer> set1 = new HashSet<Integer>();
         set1.add(10);
         set1.add(11);
         set1.add(12);

         for(int i=0;i<=100;i++){
           set1.add(i);
         }

         boolean f = set1.contains(10);
         set1.remove(10);
         int setSize = set1.size();

         for(int itr:set1){
             System.out.println(itr);
         }
     }

     public void TreeSetDataStructure(){
         {/*Tree Data structure is similar to Hashset, but it stores the value in sorted fashion */}

         Set<Integer> set2 = new TreeSet<>();
         set2.add(10);
         set2.add(9);

         for(int i=0;i<=12;i++){
             set2.add(i);
         }

         for(int itr:set2){
             System.out.println(itr);
         }
     }

     public void mapDataStructure(){
         {/*Map stores the data in key value Pair*/}

         Map<Integer,String> map1 = new TreeMap<>();
         map1.put(1,"Ankit");
         map1.put(2,"Shiva");

         int sizeOfMap = map1.size();
         map1.remove(1);

         System.out.println(map1);

         for(int i:map1.keySet()){
             System.out.println(i + " " + map1.get(i));
         }
     }

     public  void comparator(){
       List<Integer> list1 = new ArrayList<>();
       List<String> list2 = new ArrayList<>();

       list2.add("Ankit");
       list2.add("Keshav");
       list2.add("Pawan");
       list2.add("Sunil");

         Comparator<String> comp2 = new Comparator<String>() {
             @Override
             public int compare(String s1, String s2) {
                 if (s1.length() > s2.length()) {
                     return 1;
                 } else if (s1.length() < s2.length()) {
                     return -1;
                 } else {
                     return 0;
                 }
             }
         };

       Comparator<Integer> comp1 = new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
               if(i%10 > j%10)
                   return 1;
               else
                   return -1;
            };
       };

         {/*For each Loop*/}
         System.out.println("Lmabda Expression");
         list2.forEach(n-> System.out.println(n));

       for(int i=1;i<=10;i++){
           list1.add(i);
       }

       System.out.println(list1);
       Collections.sort(list1,comp1);

       System.out.println("After comparator");

         for(int i:list1){
             System.out.println(i);
         }

         Collections.sort(list2,comp2);

         for(String i:list2){
             System.out.println(i);
         }


         {/*These will be sorted on default manner of Collection framework*/}
         {/*We need to make default comparator to sort the list*/}

     }
}

public class collection{
    public static void main(String[] args){
   List<Integer> nums = new ArrayList<Integer>();

   nums.add(10);
   nums.add(10);
   nums.add(10);

   for(int i:nums){
       System.out.println(i);
   }

   System.out.println(nums);
   int no = nums.get(1);
   System.out.println(no);

   collectionapi api = new collectionapi();
   api.setDataStructure();
   api.TreeSetDataStructure();
   api.mapDataStructure();
   System.out.println("Ended");
   api.comparator();

    }
}

