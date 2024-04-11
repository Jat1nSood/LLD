package  Model;

public class Seller{

    public String id;
    public String name;
    public String address;

    public Seller(String sellerId, String name, String address){

        this.name = name;
        this.id = sellerId;
        this.address = address;
    }

    
    public void getSellerDetails(){

        System.out.println("Name  : " + this.name);
        System.out.println("Seller Id : " + this.id);
        System.out.println("Address : " + this.address);
        System.out.println();


    }

}

