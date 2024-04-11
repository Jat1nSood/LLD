package Repository;

import Repository.Interface.ISellerRepository;
import Model.Seller;
import java.util.*;

public class SellerRepository{

    ArrayList<Seller> sellerList = new ArrayList<>();

    public void save(Seller seller){

        sellerList.add(seller);
    }


    public Seller findBy(String id){
        
        int len = sellerList.size();
        for (int i = 0; i < len; i++){

            Seller seller = sellerList.get(i);
            if(seller.id == id){

                return seller;
            }
        }

        return null;
    }

    public ArrayList<Seller> findAll(){

        return sellerList;
    }



}