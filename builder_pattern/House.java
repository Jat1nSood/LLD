class House{


    private String stories;
    private String door_type;
    private String roof_type;

    public House(HouseBuilder house_builder){

        this.stories = house_builder.stories;
        this.door_type = house_builder.door_type;
        this.roof_type = house_builder.roof_type;
    }


    public void getDetails(){

        System.out.println("No of Stories : " + this.stories + ", Door Type : " + this.door_type + ", Roof Type : " + this.roof_type + "." );

    }


}