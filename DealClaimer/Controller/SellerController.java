package Controller;

import Controller.Interface.ISellerController;
import Service.SellerService;

public class SellerController implements ISellerController{

    SellerService sellerService = new SellerService();

    // Method to create a seller
    @Override
    public void createSeller(String id, String name, String address){

        sellerService.createSeller(id, name, address);
    }

    // Get details of a seller by its ID
    @Override
    public void getSellerbyId(String id){

        sellerService.getSellerbyId(id);
    }

    // Method to get all register Seller
    public void getAllSeller(){

        sellerService.getAllSeller();
    }


    // Method for seller to create a Deal
    public void createDeal(String dealId, String dealTitle, String dealStartTime, String dealEndTime, String buyLimit,
            String dealInitialStock, String dealCurrentStock, String dealPrice, String sellerId, String dealStatus){

             sellerService.createDeal(dealId, dealTitle, dealStartTime, dealEndTime, buyLimit, dealInitialStock, dealCurrentStock, dealPrice, sellerId, dealStatus);
    }

    // Method to get all deals created by a particular Seller
    public void sellerAllDeals(String sellerId){

        sellerService.sellerAllDeals(sellerId);
    }

    

}