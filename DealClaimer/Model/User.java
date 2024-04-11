package Model;

public class User{

    private String userId;
    private String name;
    private String address;

    public User(String userId, String name, String address){

        this.name = name;
        this.userId = userId;
        this.address = address;
    }

    
    public void getUserDeatails(){

        System.out.println("Name  : " + this.name);
        System.out.println("Seller Id : " + this.userId);
        System.out.println("Address : " + this.address);
        System.out.println();
    }

}

