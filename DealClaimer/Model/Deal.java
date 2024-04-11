package Model;


public class Deal {

    public String dealId;
    public String dealTitle;
    public String dealStartTime;
    public String dealEndTime;
    public String buyLimit;
    public String dealInitialStock;
    public String dealCurrentStock;
    public String dealPrice;
    public String sellerId;
    public String dealStatus;

    public Deal(String dealId, String dealTitle, String dealStartTime, String dealEndTime, String buyLimit,
            String dealInitialStock, String dealCurrentStock, String dealPrice, String sellerId, String dealStatus){

                this.dealId = dealId;
                this.dealCurrentStock =  dealCurrentStock;
                this.dealEndTime = dealEndTime;
                this.dealInitialStock = dealInitialStock;
                this.dealPrice = dealPrice;
                this.sellerId = sellerId;
                this.buyLimit = buyLimit;
                this.dealTitle = dealTitle;
                this.dealStartTime = dealStartTime;
                this.dealStatus = dealStatus;
                }
            

            // Methids of Dela Class
            public String getDealId(){

                return this.dealId;

            }

            public String getDealTitle(){
                return this.dealTitle;
            }
            public void getDealDetails(){

                System.out.println("--------------------The Deal Details------------- ");
                System.out.println("Deal Title : " + this.dealTitle);
                System.out.println("Deal ID :  : " + this.dealId);
                System.out.println("Selled Id : " + this.sellerId);
                
                System.out.println("Deal Start Time :  : " + this.dealStartTime);
                System.out.println("Deal End Time : " + this.dealEndTime);
                System.out.println("Deal Inital Stock : " + this.dealInitialStock);
                System.out.println("Current Avaialble Stock : " + this.dealCurrentStock);
                System.out.println("Limit : " + this.buyLimit + "/Per User");
                System.out.println("Deal Price : " + "Rs" + this.dealPrice);
                System.out.println("Deal Status : " + "Rs" + this.dealStatus);
            }

    }

