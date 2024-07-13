class Mobile{
    String Company;
    int price;
    static String phone;

    public void getDetails(){
        System.out.println(Company + " " + price + " " + phone);
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

        {/*Static keyword Variable can only be called by Class itself not the object*/}
    }
}


