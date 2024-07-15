class Mobile{
    String Company;
    int price;
    static String phone;  // Static Variable

    public void getDetails(){
        System.out.println(Company + " " + price + " " + phone);
    }

    {/*Static Block that helps you to instantiate for a single time*/}

    static
    {
        phone = "smartphone";
    }


    {/*We can instantiate the values using a constructor*/}

    public Mobile(){
      Company = "";
      price = 120;
    }

   {/*When you have to call the non-static method you have to create object of it*/}

    public static void details(Mobile obj){
        System.out.println(obj.Company + " " + obj.price + " " + phone);
    }


}


public class statickeyword{
    public static  void main(String[] args){
       
        Mobile mob1 = new Mobile();
        mob1.Company = "Apple";
        mob1.price = 1200;
        Mobile.phone = "Smart Phone";
        
        Mobile mob2 = new Mobile();
        mob2.Company = "Samsung";
        mob2.price = 1300;
        Mobile.phone = "Flipped Phone";
        
        mob1.getDetails();
        mob2.getDetails();
        Mobile.details(mob1);

        {/*We cannot use non-static method inside static method, We have to pass the Object in the param*/}
        {/*Static keyword Variable can only be called by Class itself not the object*/}

    }
}


