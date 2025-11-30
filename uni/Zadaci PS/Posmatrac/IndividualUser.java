class IndividualUser implements User{
    private static final int stockNumber = 2;
    private HashMap<Stock, Integer> stocks;
    public User(Tactic tactic){
        this.stocks = new HashMap<>();
    }
    public void update(Stock stock, double delta){
        if(delta < 0){
            StockService.getInstance().buyStock(stock, stockNumber);
            stocks.set(stock, stockNumber);
            return;
        }
        if(delta > 0 && stocks.get(stock) != null){
            StockService.getInstance().sellStock(stock, stocks.get(stock));
            stocks.set(stock, 0);
        }
    }

}