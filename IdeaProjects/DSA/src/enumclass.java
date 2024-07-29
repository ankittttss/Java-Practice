enum Status  {
    //enum are named constant
        Pending,Rejected,Accepted
}

enum Laptop{
    MacBook(2000), Dell(4000),Surface(5600);
    private int price;

     private Laptop(int price){
         price = this.price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class enumclass {
    public static void main(String[] a){


        Laptop Macbook = Laptop.MacBook;
        System.out.println(Macbook);
        int pricee = Macbook.getPrice();
        System.out.println(pricee);

        for (Laptop lap:Laptop.values()){
            System.out.println(lap +  " " + lap.getPrice());
        }

    }
}
