import Model.Seller;
import Model.User;
import Model.Deal;
import Controller.SellerController;
import Controller.DealController;



class Main{

    public static void main(String[] args){
        

        SellerController sellerController = new SellerController();
        DealController dealController = new DealController();

        sellerController.createSeller("1", "Gada Electronics", "Mumbai");
        sellerController.createSeller("2", "Sood Electronics", "Tarn");
        sellerController.getSellerbyId("1");
        sellerController.createDeal("1", "Fridge Sale", "10 AM", "12AM", "2", "10", "10", "9,999", "1", "Active");
        sellerController.createDeal("2", "TV Sale", "10 AM", "12AM", "2", "10", "10", "5,999", "2", "Active");
        sellerController.sellerAllDeals("1");
        sellerController.sellerAllDeals("2");
        dealController.getAllDeals();








        // //Seller
        // Seller gada = new Seller("1", "Gada Electronics", "Mumbai");
        // gada.getSellerDetails();

        // //User
        // User jatin = new User("1", "Jatin", "Mohali");
        // jatin.getUserDeatails();

        // //Deal

        // Deal deal1 = new Deal("1", "Fridge Deal", "10 AM", "12 PM", "2", "10", "10", "9999", "1");

        // deal1.getDealId();
        // deal1.getDealDetails();

    }
}