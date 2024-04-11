class HouseBuilder{

    public String stories;
    public String door_type;
    public String roof_type;

    public HouseBuilder(){

        this.stories = null;
        this.door_type = null;
        this.roof_type = null;
    }

    public void setStories(String stories){

        this.stories = stories;
    }

    public void setRoofType(String roof_type){

        this.roof_type = roof_type;
    }

    public void setDoorType (String door_type){

        this.door_type = door_type;
    }

    public House build(HouseBuilder house_builder){

        House house = new House(house_builder);
        return house;

    }
}