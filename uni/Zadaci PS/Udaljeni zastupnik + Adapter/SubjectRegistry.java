class SubjectRegistry{

    private HashMap<Integer, Subject> objects;
    private HashMap<Integer, Subject> objectsOnServer;
    private String address;

    public SubjectRegistry(){
        this.address = ...;
        this.objects = new HashMap<>();
        this.objectsOnServer = new HashMap<>();

        HttpInterface http = new ApacheAdapter();

        for(int i=0; i < ...; i++){
            if(i < ...){
                objects.put(i, new SubjectImpl(i));
            }
            else{
                objectsOnServer.put(i, new SubjectProxy(i, this.address, http));
            }
        }
    }

    public Subject getSubject(int id){
        if(objects.contains(id)){
            return objects.get(id);
        }
        else if(objectsOnServer.contains(id)){
            return objectsOnServer.get(id);
        }
        else{
            throw new Exception("Object with id " + String.valueOf(id) + " doesn't exist!");
        }
    }

}