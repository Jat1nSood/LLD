package Service;
import Service.Interface.IDealService;
import Model.Deal;
import Repository.DealRepository;
import java.util.*;

public class DealService implements IDealService{

    // DealService dealService = new DealService();
    DealRepository dealRepo = DealRepository.getInstance();


    // @Override
    public void getDealById(String id){
        
    }

    public void getAllDeals(){
        ArrayList<Deal> deals = dealRepo.findAll();

        if(deals.size() == 0){

            System.out.println("No Available Deals");
            return;
        }


        System.out.println("+--------------------------------+--------------------------------+--------------+");
        System.out.println("All Created Deals");
        for (Deal deal : deals) {
            String dealId = deal.dealId;
            String dealTitle = deal.dealTitle;
            String dealStartTime = deal.dealStartTime;
            String dealEndTime = deal.dealEndTime;
            String buyLimit = deal.buyLimit;
            String dealInitialStock = deal.dealInitialStock;
            String dealCurrentStock = deal.dealCurrentStock;
            String dealPrice = deal.dealPrice;
            String sellerId = deal.sellerId;
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