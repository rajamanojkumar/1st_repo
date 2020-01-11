public class car extends vechile {

    int model;
    int version;
    int wheels;

    public car(String name, int cost, int speed, int gear, int model, int version, int wheels) {
        super(name, cost, speed, 4);
        this.model = model;
        this.version = version;
        this.wheels = wheels;
    }

    @Override
    public void speed(int speed){

        System.out.println("car moves at a speed of"+ speed);
    }

    public void gear(int gear){

        System.out.println("car is  at a gear of "+ gear);
    }

}
