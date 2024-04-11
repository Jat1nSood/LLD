package Service;

import java.util.*;
import Service.Interface.ISellerService;
import Repository.SellerRepository;
import Repository.DealRepository;
import Model.Seller;
import Model.Deal;

public class SellerService{

    SellerRepository sellerRepository = new SellerRepository();
    DealRepository dealRepo =  DealRepository.getInstance();


    // Method to create a Seller
    public void createSeller(String id, String name, String address){

        Seller seller = new Seller(id, name, address);

        
        sellerRepository.save(seller);
        System.out.println("Seller Created");

    }

    // Method to get Seller details by seller ID
    public void getSellerbyId(String id){

        Seller seller = sellerRepository.findBy(id);

        if(seller != null){
            System.out.println("Seller Found");

            System.out.println("{");
            System.out.println("    Id : " + seller.id );
            System.out.println("    Name : " + seller.name );
            System.out.println("    Address : " + seller.address );
            System.out.println("}");

            System.out.println();
        }
        else{
            System.out.println("Seller not found with given Id");
        }   
    }


    // Method to get All the Seller who have registered
    public void getAllSeller(){

        ArrayList<Seller> sellerList = sellerRepository.findAll();

        if(sellerList == null){
            System.out.println("No Seller Found");
            return;
        }

        int len = sellerList.size();
        for (int i = 0; i < len; i++){

            Seller seller = sellerList.get(i);

            System.out.println("-------------------");
            System.out.println("Id : " + seller.id);
            System.out.println("Name : " + seller.name);
            System.out.println("Address : " + seller.address);
            System.out.println("-------------------");
            System.out.println();
        }
    }


    // Method for seller to create the deal
    public void createDeal(String dealId, String dealTitle, String dealStartTime, String dealEndTime, String buyLimit,
            String dealInitialStock, String dealCurrentStock, String dealPrice, String sellerId, String dealStatus){


            Deal deal = new Deal(dealId, dealTitle, dealStartTime, dealEndTime, buyLimit,
            dealInitialStock, dealCurrentStock, dealPrice, sellerId, dealStatus);

            if(deal != null){

                dealRepo.save(deal);
                System.out.println("Deal Created");
                System.out.println();
            }
            else{
                System.out.println("There was an error while creating the deal");
            }    
    }


    // Method to get all deals create by a particular Seller
    public void sellerAllDeals(String sellerId){

        ArrayList<Deal> deals = dealRepo.findDealsBySeller(sellerId);

        if(deals.size() == 0){

            System.out.println("No deals Found");
            return;
        }

        System.out.println("+--------------------------------+--------------------------------+--------------+");
        System.out.println("All deal for Seller id :" + sellerId);
        for (Deal deal : deals) {
            String dealId = deal.dealId;
            String dealTitle = deal.dealTitle;
            String dealStartTime = deal.dealStartTime;
            String dealEndTime = deal.dealEndTime;
            String buyLimit = deal.buyLimit;
            String dealInitialStock = deal.dealInitialStock;
            String dealCurrentStock = deal.dealCurrentStock;
            String dealPrice = deal.dealPrice;
            // String sellerId = deal.sellerId;
            String dealStatus = deal.dealStatus;

            System.out.println('{');
            System.out.println("    Deal Id: " + dealId);
            System.out.println("    Deal Title: " + dealTitle);
            System.out.println("    Start Time: " + dealStartTime);
            System.out.println("    End Time: " + dealEndTime);
            System.out.println("    Buy Limit: " + buyLimit);
            System.out.println("    Initial Stock: " + dealInitialStock);
            System.out.println("    Current Stock: " + dealCurrentStock);
            System.out.println("    Price: " + dealPrice);
            
            System.out.println("    Seller Id: " + sellerId);
            System.out.println("    Status: " + dealStatus);

            System.out.println('}');
        }
        System.out.println("+--------------------------------+--------------------------------+--------------+");
    }
}