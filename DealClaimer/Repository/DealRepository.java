package Repository;

import java.util.*;
import Model.Deal;
import Repository.Interface.IDealRepository;


public class DealRepository implements IDealRepository{

    static DealRepository dealRepoInstance = null;

    ArrayList<Deal> dealList = new ArrayList<>();

    public static DealRepository getInstance(){

        if(dealRepoInstance == null){
            dealRepoInstance = new DealRepository();
        }

        return dealRepoInstance;
    }

    @Override
    public void save(Deal deal){

        dealList.add(deal);
    }

    // Method returns All deals from a sller
    public ArrayList<Deal> findDealsBySeller(String sellerId){
        
        int len = dealList.size();
        ArrayList<Deal> deals = new ArrayList<>();
        for (int i = 0; i < len; i++){

            Deal deal = dealList.get(i);
            if(deal.sellerId == sellerId){

                deals.add(deal);
            }
        }
        return deals;
    }

    // Method return all deals
    public ArrayList<Deal> findAll(){

        return dealList;
    }
}