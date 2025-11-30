class Company implements User{

    private static final int stockNumber = 5;

    private double threshold;
    private HashMap<Stock, Integer> stocks;

    public Company(double threshold){
        this.threshold = threshold;
        this.stocks = new HashMap<>();
    }

    public void update(Stock stock, double delta){
        if(delta < 0 && stock.getPrice() < threshold){
            StockService.getInstance().buyStock(stock, stockNumber);
            stocks.set(stock, stockNumber);
        }
        if(delta > 0 && stocks.get(stock) != null){
            StockService.getInstance().sellStock(stock, stocks.get(stock));
            stocks.set(stock, 0);
        }
    }

}