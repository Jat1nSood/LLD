package Controller;

import Controller.Interface.IDealController;
import Service.DealService;

public class DealController implements IDealController{


    DealService dealService = new DealService();

    
    // Get Deal by Deal ID
    @Override
    public void getDealById(String id){

        dealService.getDealById(id);
    }


    // Method to get All Avaialble Deals
    public void getAllDeals(){

        dealService.getAllDeals();
    }
}