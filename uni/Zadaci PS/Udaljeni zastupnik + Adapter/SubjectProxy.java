class SubjectProxy extends Subject{

    private String address;
    private int id;
    private HttpInterface http;

    public SubjectProxy(int id, String address, HttpInterface http){
        this.address = address;
        this.id = id;
        this.http = http;
    }

    void f1(){
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("id", String.valueOf(id));
        parameters.put("method", "f1");

        int code = this.http.get(address, parameters);

        if(code = ...){
            //...
        }
        else if(code = ...){
            //...
        }
    }
    
    void f2(){
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("id", String.valueOf(id));
        parameters.put("method", "f2");

        int code = this.http.get(address, parameters);

        if(code = ...){
            //...
        }
        else if(code = ...){
            //...
        }
    }

    int f3(){
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("id", String.valueOf(id));
        parameters.put("method", "f3");

        String responseBody = this.http.post(address, parameters);

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> jsonResponse = objectMapper.readValue(responseBody, Map.class);

        int returnValue = (int) jsonResponse.get("returnValue");
        return returnValue;
    }

    int id(){
        return this.id;
    }
}