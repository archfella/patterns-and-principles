public interface HttpInterface{

    public int get(String address, HashMap<String, String> parameters);

    public String post(String address, HashMap<String, String> parameters);

}