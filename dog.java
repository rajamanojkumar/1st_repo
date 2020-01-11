public class dog extends animal {


    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public dog(String name, int size, int weight, int legs, int eyes, int tail, int teeth , String coat) {
        super(name, 1, size, weight);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

           }


     private void chew(){
         System.out.println("animal.chew called");
     }

    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }
}
