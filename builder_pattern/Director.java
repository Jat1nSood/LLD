class Director{

    HouseBuilder house_builder;

    public Director(){

        this.house_builder = new HouseBuilder();
    }


    public House createOneStoryHous(){

        house_builder.setStories("Single Storey");
        house_builder.setDoorType("Single Door");
        house_builder.setRoofType("Pointy");

        return house_builder.build(this.house_builder);
    }

    public House createTwoStoryHous(){

        house_builder.setStories("Double Storey");
        house_builder.setDoorType("Double Door");
        house_builder.setRoofType("Flat");
        return house_builder.build(this.house_builder);
    }
}