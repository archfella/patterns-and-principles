class Stock{
    private String name;
    private double price;

    public Stock(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getPrice(){
        return this.price;
    }

}