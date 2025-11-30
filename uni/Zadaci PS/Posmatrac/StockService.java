class StockService{
    private static StockService instance  = null;

    public static StockService getInstance(){
        if(instance == null){
            instance = new StockService();
        }
        return instance;
    }
    
    private StockService(){
        this.users = new ArrayList<>();
        this.stocks = new HashMap<>();
        //Inicijalizacija stockova...
    }
    private ArrayList<User> users;
    private HashMap<Stock, Integer> stocks;

    public void registerUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public void buyStock(Stock stock, int count){
        stocks.put(stock, stocks.get(stock) - count);
    }

    public void sellStock(Stock stock, int count){
        stocks.put(stock, stocks.get(stock) + count);
    }
    
    protected void stockChange(Stock stock, double delta){
        for(User user: users){
            users.update(stock, delta);
        }
    }

    //... Logika kojom stock service saznaje koji stock se promenio i koliko ...
}