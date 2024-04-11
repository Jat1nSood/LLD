class main{

    public static void main(String[] args){

        System.out.println("Main Initialized");

        Director director = new Director();

        House one_stroey_house = director.createOneStoryHous();

        House two_stroey_house = director.createTwoStoryHous();


        one_stroey_house.getDetails();
        two_stroey_house.getDetails();


        
    }
}