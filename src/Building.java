class Building{

    private String owner;
    private String location;

    Building(String owner){
        this.owner = owner;
    }

    Building(String owner,String location){
        this.owner = owner;
        this.location = location;
    }

    public void getOwner(){
        System.out.println(this.owner);
    }
    
    public void needFoundation(){

    }

    public void needRooms(){

    }

    public void needBricks(){

    }
}