public class animal {

    private String name;
    private int body;
    private int size;
    private int weight;



    public animal(String name, int body, int size, int weight) {
        this.name = name;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("animal. eat called");
    }

    public void move(){

        System.out.println("animal call move called");
    }



    public String getName() {
        return name;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }


}
